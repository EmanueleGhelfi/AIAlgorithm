package abstraction;

import java.util.ArrayList;

/**
 * Created by emanueleghelfi on 22/10/16.
 */
public class ClosedList extends ClosedListAbstraction {

    public ArrayList<State> closedList;

    @Override
    public void add(State state){
        closedList.add(state);
    }

    @Override
    public boolean isInClosedList(State state){
        return closedList.contains(state);
    }
}
