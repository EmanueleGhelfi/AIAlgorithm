package fifteenGame;

import abstraction.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by emanueleghelfi on 22/10/16.
 */
public class FifteenSolver {


    public static void main(String[] arg){
        int[][] initialState = new int[][]{
                {0,1,2},
                {3,4,5},
                {6,7,8},
        };

        State init = new GameBoardState(initialState);
        SolverImpl solver = new SolverImpl();
        State state = solver.shuffle((GameBoardState)init);

        System.out.println("Initial State:\n "+ state.toString());

        Node finalNode = GeneralAlgorithm.solveAStar(solver,state);
        Node currentNode = finalNode;

        System.out.println("Solved\n "+ finalNode.getNodeState().toString());

        List<Node> path = new ArrayList<>();

        path.add(finalNode);

        while (currentNode.getParent()!=null){
            path.add(currentNode.getParent());
            currentNode = currentNode.getParent();
        }

        Collections.reverse(path);

        for(Node node: path){
            System.out.println("Passo "+ path.indexOf(node));
            System.out.println(node.getNodeState().toString());
        }


    }
}
