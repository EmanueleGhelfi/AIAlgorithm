package abstraction;

/**
 * Created by emanueleghelfi on 21/10/16.
 */
public abstract class Action {

    public abstract State doAction(State s);

    public abstract int getCost();

}
