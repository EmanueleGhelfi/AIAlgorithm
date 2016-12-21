package abstraction;

/**
 * Created by emanueleghelfi on 22/10/16.
 */
public class ClosedListFake extends ClosedListAbstraction{


    @Override
    public void add(State state) {

    }

    @Override
    public boolean isInClosedList(State state) {
        return false;
    }
}
