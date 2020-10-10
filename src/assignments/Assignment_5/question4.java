package assignments.Assignment_5;

import java.util.Scanner;

public class question4 {

	public static void main(String[] args) {
		/*
		 * Question-4:
		 * 
		 * Write a while loop that lets the user enter a number. The number should be
		 * multiplied by 10, and the result stored in the variable product. The loop
		 * should iterate as long as product contains a value less than 100.
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = scan.nextInt();
		int result = 0;

		while (result < 100) {

			result = num * 10;
			
			// The loop should iterate as long as product contains a value less than 100.
			if (result < 100) {				
				// if result less than 100 , Then ask from user enter a number
				System.out.println("Enter a number: ");
				num = scan.nextInt();
			}
		}
		scan.close();
	}
}
