package assignments.Assignment_5;

public class question9 {

	public static void main(String[] args) {
		/*
		 * Write a program for the following logic: Print all the odd numbers in
		 * comma-separated form from 1 till the end (you may change it): if end = 10,
		 * OUTPUT = 1, 3, 5, 7, 9 if end = 11, OUTPUT = 1, 3, 5, 7, 9, 11
		 * 
		 * You should use while loop and if-else statements. Note that, there should not
		 * be any comma after the last digit.
		 */

		int number = 15, i = 1;
		String print = "";
		while (i <= number) {			
				print += (i % 2 > 0) ? i : ((i == number) ? "" : ", ");			
			i++;
		}
		System.out.println(print);
	}
}
