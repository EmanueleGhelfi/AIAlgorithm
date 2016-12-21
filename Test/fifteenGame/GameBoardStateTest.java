package fifteenGame;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by emanueleghelfi on 22/10/16.
 */
public class GameBoardStateTest {


    @Test
    public void testGoal(){

        int[][] initialState = new int[][]{
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,0}
        };

        GameBoardState gameBoardState = new GameBoardState(initialState);

        assertTrue(gameBoardState.isGoalState());
    }

    @Test
    public void testHeuristic() throws Exception {
        int[][] initialState = new int[][]{
                {7,2,4},
                {5,0,6},
                {8,3,1},
        };

        GameBoardState gameBoardState = new GameBoardState(initialState);

        assertEquals(gameBoardState.heuristicFunction(),18);


        int[][] goalState = new int[][]{
                {0,1,2},
                {3,4,5},
                {6,7,8},
        };

        GameBoardState gameBoardState2 = new GameBoardState(goalState);

        assertEquals(0,gameBoardState2.heuristicFunction());
    }
}