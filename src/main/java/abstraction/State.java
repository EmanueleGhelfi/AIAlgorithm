package abstraction;

import java.util.List;

/**
 * Created by emanueleghelfi on 21/10/16.
 */
public abstract class State {

    public abstract boolean isGoalState();

    public abstract int heuristicFunction();

}
