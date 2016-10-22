package fifteenGame;

import abstraction.*;

/**
 * Created by emanueleghelfi on 22/10/16.
 */
public class FifteenSolver {


    public static void main(String[] arg){
        int[][] initialState = new int[][]{
                {0,1,2,3},
                {4,5,6,7},
                {8,9,10,11},
                {12,13,14,15}
        };

        State init = new GameBoardState(initialState);
        SolverImpl solver = new SolverImpl();
        State state = solver.shuffle((GameBoardState)init);

        System.out.println("Initial State: "+ state.toString());

        Node finalNode = GeneralAlgorithm.solve(solver,state,new FifoFrontier(),new ClosedList());

        System.out.println("Solved "+ finalNode.getNodeState().toString());


    }
}
