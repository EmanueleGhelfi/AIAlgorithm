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

}