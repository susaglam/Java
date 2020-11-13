package assignments.repl_it;

import java.util.Scanner;

public class repl_142_2D_Array_largest_number {
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
        for (int x = 0; x < rows; x++) {
            for (int y = 0; y < cols; y++) {
                if (arr[x][y] > max) {
                    max = arr[x][y];
                }
            }
        }
        System.out.println(max);
        inp.close();
    }//end main

}
