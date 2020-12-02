package assignments.repl_it;

import java.util.Scanner;

/*
Given a square matrix, calculate the absolute difference between the sums of its diagonals.
For example, the square matrix  is shown below:
1 2 3
4 5 6
9 8 9
The left-to-right diagonal = 1+5+9 = 15.
The right to left diagonal =  3+5+9 = 17.
Their absolute difference is |15-17| = 2.
 */

public class repl_2D_Arrays_Diagonal_Difference {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[][] matrix = new int[][] { { scan.nextInt(), scan.nextInt(), scan.nextInt() },
				{ scan.nextInt(), scan.nextInt(), scan.nextInt() },
				{ scan.nextInt(), scan.nextInt(), scan.nextInt() } };
		int result = 0, ltr = 0, rtl = 0;
		for (int i = 0; i < matrix.length; i++) {
			for (int l = i; l < matrix.length; l++) {
				if (i == l) {
					ltr += matrix[i][l];
				}
			}
			for (int r = matrix.length - 1; r >= i;r--) {
				rtl += matrix[i][r - i];
				break;
			}
		}
		result = ltr - rtl;
		// FINAL PRINT
		System.out.println(Math.abs(result));
		scan.close();
	}
}
