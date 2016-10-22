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
        int[][] toReturn = new int[board.length][board[0].length];

        for (int i = 0; i< board.length; i++){
            for(int j = 0; j<board[i].length;j++){
                toReturn[i][j] = board[i][j];
            }
        }

        return toReturn;


    }

    @Override
    public boolean isGoalState(){

        if(board[0][0] == 0)
            return false;

        for(int row = 0; row<board.length; row++){
            for(int column = 0; column<board[row].length; column++){

                // if last cell ret ok
                if(row == board.length-1 && column == board[row].length-1)
                    return true;
                int nextRow = column == board[row].length-1 ? row+1 : row;
                int nextCol = column == board[row].length-1 ? 0 : column+1;

                if(nextRow == board.length -1 && nextCol == board[nextRow].length-1)
                    return true;
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

        for (int i = 0; i< board.length; i++){
            for(int j = 0; j<board[i].length;j++){
                if(board[i][j]!=that.board[i][j])
                    return false;
            }
        }
        return true;

    }


    @Override
    public String toString() {
        String toReturn = "";
        toReturn+= "{\n";
        for (int i = 0; i< board.length; i++){
            for(int j = 0; j<board[i].length;j++){
                toReturn+=""+board[i][j]+"\t";
            }
            toReturn+="\n";
        }
       toReturn+= "}";
        return toReturn;
    }

    @Override
    public int hashCode() {
        return Arrays.deepHashCode(board);
    }


    public static void main(String[] arg){

    }
}
