package assignments.Assignment_5;


public class question6 {

	public static void main(String[] args) {
		/*
		 * Question-6:
		 * 
		 * Write a program to print Fibonacci series of n terms where n is declared by
		 * user : 0, 1, 1, 2, 3, 5, 8, 13, 21, 34,......
		 */
		int n = 10, term1 = 0, term2 = 1;
		System.out.print("First " + n + " terms: ");

		for (int i = 1; i <= n; ++i) {
			System.out.print(term1 + ", ");

			int total = term1 + term2;
			term1 = term2;
			term2 = total;
		}
		System.out.print(".......");
	}
}
