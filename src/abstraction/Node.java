package abstraction;

/**
 * Created by emanueleghelfi on 22/10/16.
 */
public class Node {

    //state that represents the node
    private State nodeState;

    //father node
    private Node parent;

    //distance from root node
    private int distance;

    //action from previous node
    private Action action;


    public Node(State nodeState, Node parent, Action action) {
        this.nodeState = nodeState;
        this.parent = parent;
        this.distance = parent.getDistance() + action.getCost();
        this.action = action;
    }

    public Node(State nodeState) {
        this.nodeState = nodeState;
        this.parent=null;
        this.action=null;
        this.distance =0;
    }

    public State getNodeState() {
        return nodeState;
    }

    public int getDistance() {
        return distance;
    }
}
