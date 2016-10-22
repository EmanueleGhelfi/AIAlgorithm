package fifteenGame;

import abstraction.Action;
import abstraction.Solver;
import abstraction.State;

/**
 * Created by emanueleghelfi on 22/10/16.
 */
public class LeftAction extends GameAction {

    public LeftAction() {
        horizontalSwitch = -1;
        verticalSwitch =0;
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }
}
