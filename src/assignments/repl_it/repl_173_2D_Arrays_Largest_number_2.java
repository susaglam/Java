package assignments.repl_it;

import java.util.Arrays;
import java.util.Scanner;
        /*
        Given a 2d array of ints, find the biggest number(integer)
        and replace all array values on biggest number in the array then print an array.
        Example:
        Given values: [[1, 2, 3], [5, 33, 9]]
        output: [[33, 33, 33], [33, 33, 33]]
         */

public class repl_173_2D_Arrays_Largest_number_2 {
    public static void main (String[] args) {
        Scanner inp = new Scanner(System.in);
        int rows = inp.nextInt(), cols = inp.nextInt();
        int[][] arr = new int[rows][cols];
        for (int i = 0; i <= rows - 1; i++) {
            for (int j = 0; j <= cols - 1; j++) {
                arr[i][j] = inp.nextInt();
            }//end for cols
        }//end for rows

        //TODO write your code below
        int max = Integer.MIN_VALUE;
        int[] hold = new int[rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }//end for cols
            hold[i] = max;
        }//end for rows

        for (int j = 0; j < hold.length; j++) {
            if (hold[j] > max) {
                max = hold[j];
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = max;
            }//end for cols
        }//end for rows
        //FINAL PRINT
        System.out.println(Arrays.deepToString(arr));
    }
}
