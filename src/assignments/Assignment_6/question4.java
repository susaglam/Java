package assignments.Assignment_6;

public class question4 {

	public static void main(String[] args) {
		/*
		 * Question-4
			Write a Java program to print the following pattern
			
			1
			10
			101
			1010
			10101
			101010
			1010101
		 */

		for (int i = 1; i <= 7; i++) {
			for (int j = 1; j <= i; j++) {
				if (j % 2 == 1) {
					System.out.print("1");
					} 
				else {
						System.out.print("0");
						}
				}
			System.out.println();
			}
		}
	}
