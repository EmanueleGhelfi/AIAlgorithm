package fifteenGame;

import abstraction.Action;
import abstraction.Solver;
import abstraction.State;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by emanueleghelfi on 22/10/16.
 */
public class SolverImpl extends Solver {


    @Override
    public List<Action> getPossibleAction(State s) {
        GameBoardState gameBoardState = (GameBoardState) s;
        MatrixPoint matrixPoint = findWhiteCell(s);

        Action upAction = new UpAction();
        Action rightAction = new RightAction();
        Action leftAction = new LeftAction();
        Action downAction = new DownAction();
        List<Action> possibleActions = new ArrayList<Action>();
        possibleActions.add(upAction);
        possibleActions.add(downAction);
        possibleActions.add(leftAction);
        possibleActions.add(rightAction);

        if(matrixPoint.getColumn()==gameBoardState.getBoard()[0].length-1)
            possibleActions.remove(rightAction);

        if(matrixPoint.getColumn() == 0)
            possibleActions.remove(leftAction);

        if(matrixPoint.getRow() ==0)
            possibleActions.remove(upAction);

        if(matrixPoint.getRow() == gameBoardState.getBoard().length-1)
            possibleActions.remove(downAction);

        return possibleActions;

    }


    public MatrixPoint findWhiteCell(State state){

        GameBoardState gameBoardState = (GameBoardState) state;
        int[][] board = gameBoardState.getBoard();

        for(int row = 0; row<board.length; row++){
            for(int column = 0; column<board[row].length; column++){

                if(board[row][column] == 0)
                    return new MatrixPoint(row,column);
            }
        }

        return null;

    }

}
