package fifteenGame;

import abstraction.Action;
import abstraction.State;

/**
 * Created by emanueleghelfi on 21/10/16.
 */
public abstract class GameAction extends Action {

    protected int horizontalSwitch;
    protected int verticalSwitch;
    
    @Override
    public State doAction(State s) {
        GameBoardState gameBoardState = (GameBoardState) s;
        int[][] board = gameBoardState.getBoard();
        SolverImpl solver = new SolverImpl();
        MatrixPoint whitePos =  solver.findWhiteCell(s);
        int pointToSwitch = board[whitePos.getRow()+verticalSwitch][whitePos.getColumn()+horizontalSwitch];
        board[whitePos.getRow()][whitePos.getColumn()] = pointToSwitch;
        board[whitePos.getRow()+verticalSwitch][whitePos.getColumn()+horizontalSwitch] = 0;
        return new GameBoardState(board);
    }

    @Override
    public int getCost() {
        return 1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GameAction that = (GameAction) o;

        if (horizontalSwitch != that.horizontalSwitch) return false;
        return verticalSwitch == that.verticalSwitch;

    }

    @Override
    public int hashCode() {
        int result = horizontalSwitch;
        result = 31 * result + verticalSwitch;
        return result;
    }
}
