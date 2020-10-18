package assignments.Assignment_6;

public class question6 {

	public static void main(String[] args) {
		/*
		 * Question-6
			Write a Java program to print the following pattern
			1
			2 6
			3 7 10
			4 8 11 13
			5 9 12 14 15
		 */

		for (int row = 1; row <= 5; row++) {
			int a = 0, increaseValue = 4;
			for (int col = 1; col <= row; col++) {
				int s = row + a;
				System.out.print(s + " ");
				a = a + increaseValue;
				increaseValue--;
			}
			System.out.println();
		}
	}
}
