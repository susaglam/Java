package assignments.Assignment_6;

public class question3 {

	public static void main(String[] args) {
		/*
		 * Question-3

			Write a Java program to print the following pattern
			
			1 2 3 4 5 6 7
			 2 3 4 5 6 7
			  3 4 5 6 7
			   4 5 6 7
			    5 6 7
			     6 7
			      7
			     6 7
			    5 6 7
			   4 5 6 7
			  3 4 5 6 7
			 2 3 4 5 6 7
			1 2 3 4 5 6 7
		 */
		
		//First part
		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j < i; j++) {
				System.out.print(" ");
				}
			for (int k = i; k <= 7; k++) {
				System.out.print(k + " ");
				}
			System.out.println();
			}
		
		//Second part
		for (int i = 7; i >= 1; i--) {
			for (int j = 1; j < i; j++) {
				System.out.print(" ");
				}
			for (int k = i; k <= 7; k++) {
				System.out.print(k + " ");
				}
			System.out.println();
			}
		
		}
	}
