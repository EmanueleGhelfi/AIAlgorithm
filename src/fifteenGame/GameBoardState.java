package fifteenGame;

import abstraction.Action;
import abstraction.State;

import java.util.List;

/**
 * Created by emanueleghelfi on 21/10/16.
 */
public class GameBoardState extends State {

    @Override
    public List<Action> getPossibleAction() {
        return null;
    }

    @Override
    public boolean isGoalState(){
        return false;
    }
}
