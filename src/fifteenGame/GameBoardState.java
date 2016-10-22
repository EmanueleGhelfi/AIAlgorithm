package fifteenGame;

import abstraction.Action;
import abstraction.State;

import java.util.Arrays;
import java.util.List;

/**
 * Created by emanueleghelfi on 21/10/16.
 */
public class GameBoardState extends State {

    private int[][] board;

    public GameBoardState(int[][] board) {
        this.board = board;
    }

    public int[][] getBoard() {
        return board;
    }

    @Override
    public boolean isGoalState(){

        for(int row = 0; row<board.length; row++){
            for(int column = 0; column<board[row].length; column++){

                // if last cell ret ok
                if(row == board.length-1 && column == board[row].length-1)
                    return true;
                int nextRow = column == board[row].length-1 ? row+1 : row;
                int nextCol = column == board[row].length-1 ? 0 : column+1;

                if(board[row][column] + 1 != board[nextRow][nextCol])
                    return false;
            }
        }

        return true;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GameBoardState that = (GameBoardState) o;

        return Arrays.deepEquals(board, that.board);

    }

    @Override
    public int hashCode() {
        return Arrays.deepHashCode(board);
    }
}
