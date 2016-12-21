package abstraction;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by emanueleghelfi on 20/12/2016.
 */
public class InformedFrontier extends Frontier {

    public ArrayList<Node> frontier = new ArrayList<>();

    @Override
    public void addToFrontier(Node node) {
        frontier.add(node);
        frontier.sort(new HeuristicComparator());
    }

    @Override
    public Node getNode() {
        return frontier.remove(0);
    }

    private class HeuristicComparator implements Comparator<Node>{


        @Override
        public int compare(Node o1, Node o2) {
            if(o1.getDistance()+o1.getNodeState().heuristicFunction()<o2.getDistance()+o2.getNodeState().heuristicFunction())
                return -1;
            else{
                if(o1.getDistance()+o1.getNodeState().heuristicFunction()==o2.getDistance()+o2.getNodeState().heuristicFunction())
                    return 0;
                else
                    return 1;
            }
        }
    }
}
