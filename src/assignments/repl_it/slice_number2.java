package assignments.repl_it;

import java.util.Scanner;

public class slice_number2 {

	public static void main(String[] args) {
		// DO NOT CHANGE
		int num, digit1, digit2, digit3, digit4, digit5;
		// WRITE YOUR CODE HERE
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your number:");
		num = scan.nextInt();
		String l = Integer.toString(num);;
		for (int i = 0; i < l.length(); i++) {			
			System.out.println(l.charAt(i));
		}
	}
}
