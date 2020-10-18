package assignments.repl_it;

import java.util.Scanner;

public class slice_number {

	public static void main(String[] args) {
		// DO NOT CHANGE
		int num, digit1, digit2, digit3, digit4, digit5;
		// WRITE YOUR CODE HERE
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your number:");
		num = scan.nextInt();
		digit1 = num / 10000 % 10; // hundred thousand digit
		digit2 = num / 1000 % 10; // thousands digit
		digit3 = num / 100 % 10; // hundred digit
		digit4 = num / 10 % 10; // tens digit
		digit5 = num / 1 % 10; // ones digit
		System.out.println(digit1 + "\n " + digit2 + "\n " + digit3 + "\n " + digit4 + "\n " + digit5);
		scan.close();
	}
}
