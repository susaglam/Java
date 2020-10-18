package Lessons.day06_logical_operators;

public class Comparison_Operators {
	public static void main(String[] args) {

		/*
		 * Comparison Operators: We use <, >, <=, >=, ==, != to compare two values in
		 * Java Note:Comparison operators return boolean everytime in Java
		 */

		System.out.println(5 < 13);// true
		System.out.println(5 > 13);// false

		System.out.println(5 <= 13);// true
		System.out.println(5 >= 5);// true

		// In math we use "=" but in Java we have to use "=="
		// In Jav "=" means assignment operator. We use "=" when we assign a value to a
		// variable.
		System.out.println(5 == 5);// true
		System.out.println(5 != 5);// false

		char letter1 = 'a';
		char letter2 = 'b';
		System.out.println(letter1 < letter2);//true
		System.out.println(letter1 > letter2);//false

	}
}
