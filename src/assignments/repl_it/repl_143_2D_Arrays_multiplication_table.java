package assignments.repl_it;

import java.util.Arrays;
/*
Two-dimensional Arrays - 2D array has a type such as int[][] or String[][],
with two pairs of square brackets. The elements of a 2D array are arranged in rows and columns, and the new operator for 2D arrays specifies both the number of rows and the number of columns.

You have  2D array multiplicationTable declared with 10 rows and 10 columns.
 */

public class repl_143_2D_Arrays_multiplication_table {
    public static void main (String[] args) {
        int[][] multiplicationTable = new int[10][10];

        //TODO: type your code below
        for (int x = 0; x < multiplicationTable.length; x++) {
            for (int y = 0; y < multiplicationTable.length; y++) {
                multiplicationTable[x][y] = (x + 1) * (y + 1);
            }
        }
        //Do not modify below line it will be used to test your code. And
        //Can be used by you while developing your code
        System.out.println(Arrays.deepToString(multiplicationTable));
    }
}
