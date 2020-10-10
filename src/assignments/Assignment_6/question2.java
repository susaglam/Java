package assignments.Assignment_6;

public class question2 {

	public static void main(String[] args) {
		/*
		 *Question-2

			Write a Java program to print the following pattern
			
			1 2 3 4 5 6 7
			1 2 3 4 5 6
			1 2 3 4 5
			1 2 3 4
			1 2 3
			1 2
			1
			1 2
			1 2 3
			1 2 3 4
			1 2 3 4 5
			1 2 3 4 5 6
			1 2 3 4 5 6 7
		 */
		for (int i = 7; i >= 1; i--) {
			for (int j = 1; i >= j; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		for (int i = 1; i <= 7; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		
	}
}
