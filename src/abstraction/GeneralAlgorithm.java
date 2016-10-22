package abstraction;

import java.util.List;

/**
 * Created by emanueleghelfi on 22/10/16.
 */
public class GeneralAlgorithm {



    public static Node solve(Solver solver, State initialState,Frontier frontier,ClosedListAbstraction closedList){
        Node node = new Node(initialState);
        frontier.addToFrontier(node);

        Node nextNode = frontier.getNode();

        while (nextNode!=null && !nextNode.getNodeState().isGoalState()){
            //expand node

            //add to closed list
            closedList.add(nextNode.getNodeState());

            //reasoning
            List<Action> actions = solver.getPossibleAction(nextNode.getNodeState());

            for (Action action: actions){
                State nextState = action.doAction(nextNode.getNodeState());
                Node frontierNode = new Node(nextState,nextNode,action);
                frontier.addToFrontier(frontierNode);
            }

            //find next node
            nextNode = frontier.getNode();
            while (nextNode!=null && closedList.isInClosedList(nextNode.getNodeState())){
                //// TODO: 22/10/16  
                nextNode = frontier.getNode();
            }
        }

        return nextNode;
    }
}
