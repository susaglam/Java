package assignments.Assignment_5;

import java.util.Scanner;

public class question6_scanner {

	public static void main(String[] args) {
		/*
		 * Question-6:
		 * 
		 * Write a program to print Fibonacci series of n terms where n is declared by
		 * user : 0, 1, 1, 2, 3, 5, 8, 13, 21, 34,......
		 */
		Scanner scan = new Scanner(System.in);

		int n , term1 = 0, term2 = 1;
		System.out.println("Please enter Fibonacci number of terms: ");
		n = scan.nextInt();
		System.out.print("First " + n + " terms: ");

		for (int i = 1; i <= n; ++i) {
			System.out.print(term1 + ", ");

			int total = term1 + term2;
			term1 = term2;
			term2 = total;
		}
		System.out.print(".......");
		scan.close();
	}
}
