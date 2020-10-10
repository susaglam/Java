package assignments.Assignment_5;

public class question3 {

	public static void main(String[] args) {
		/*
		 * Question-3:
		 * 
		 * Write a program that displays the number of even numbers between 5 and 50
		 * (included)
		 */

		for (int i = 5; i <= 50; i++) {
			if (i % 2 == 0)
				System.out.println(i);
		}
	}
}
