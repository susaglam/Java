package Lessons.day04_arithmetic_operators;

public class Modulus {
	public static void main(String[] args) {

		System.out.println(13 % 5);
		System.out.println(241 % 7);

		int a = 12;
		int b = 13;
		int c = 14;

		System.out.println(a * b % (b + c)); // ?

		// Check if a number is odd or even.
		// odd numbers: Give 1 as remainder when you divide them by 2
		// even numbers: Give 0 as remainder when you divide them by 2

		int d = 2345324;
		System.out.println(d % 2);// if the result is 0, I understand it is even

		int e = 12345;
		System.out.println(e % 2);// if the result is 1, I understand it is odd

	}
}
