package assignments.Assignment_5;

public class question8 {

	public static void main(String[] args) {
		/*
		 * Question-8:
		 * 
		 * Write a program to calculate the sum of the numbers from 1 till upper bound.
		 * If upper bound is 5, sum should be 1 + 2 + 3 + 4 + 5 = 15. If upper bound is
		 * 11, sum should be 1 + 2 + ... + 11 = 66. If upper bound is 100, sum should be
		 * 1 + 2 + ... + 100 = 5050.
		 * 
		 * You should use a while loop.
		 */

		
		int upBound = 5, i = 1, sum = 0;
		String word = "";

		System.out.println("Upper Bound " + upBound);
		while (i <= upBound) {
			if (i == upBound) {
				word += i + " = ";
			} else {
				word += i + " + ";
			}
			sum += i;
			i++;
		}
		System.out.println(word + sum);
	}
}
