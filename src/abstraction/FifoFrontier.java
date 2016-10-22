package abstraction;

import java.util.AbstractQueue;
import java.util.ArrayDeque;
import java.util.Queue;

/**
 * Created by emanueleghelfi on 22/10/16.
 */
public class FifoFrontier extends Frontier {


    private Queue<Node> frontier;

    public FifoFrontier() {
        this.frontier = new ArrayDeque<>();
    }

    @Override
    public void addToFrontier(Node node) {
        frontier.add(node);
    }

    @Override
    public Node getNode() {
        return frontier.poll();
    }


}
