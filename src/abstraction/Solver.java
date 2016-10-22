package abstraction;

import java.util.List;

/**
 * Created by emanueleghelfi on 22/10/16.
 */
public abstract class Solver {

    public abstract List<Action> getPossibleAction(State s);
}
