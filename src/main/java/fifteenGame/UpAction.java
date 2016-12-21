package fifteenGame;

import abstraction.Action;
import abstraction.State;

/**
 * Created by emanueleghelfi on 22/10/16.
 */
public class UpAction extends GameAction {

    public UpAction() {
        verticalSwitch = -1;
        horizontalSwitch = 0;
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }
}
