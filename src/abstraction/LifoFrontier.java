package abstraction;

import java.util.Stack;

/**
 * Created by emanueleghelfi on 22/10/16.
 */
public class LifoFrontier extends Frontier {

    public Stack<Node> frontier;


    public LifoFrontier() {
        this.frontier = new Stack<>();
    }

    @Override
    public void addToFrontier(Node node) {
        frontier.push(node);
    }

    @Override
    public Node getNode() {
        return frontier.pop();
    }
}
