package assignments.repl_it;

import java.util.Arrays;

public class repl_171_2D_Arrays_Chess_board {
    public static void main (String[] args) {
        String[][] chessBoard = new String[8][8];
        //WRITE YOUR CODE HERE
        for (int i = 0; i < chessBoard.length; i++) {
            char c = 'a';
            for (int j = 0; j < chessBoard.length; j++) {
                chessBoard[i][j] = i + 1 + "" + c;
                c++;
            }
        }
        //DO NOT CHANGE
        System.out.println(Arrays.deepToString(chessBoard));
    }
}
