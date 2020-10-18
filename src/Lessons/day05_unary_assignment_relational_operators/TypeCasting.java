package Lessons.day05_unary_assignment_relational_operators;

public class TypeCasting {
	public static void main(String[] args) {

		/*
		 * Type casting is when you assign a value of one primitive data type to another type.
		 * 
		 * In Java, there are two types of casting:
		 * 
		 * Widening Casting (automatically) - converting a smaller type to a larger type size 
		 * byte -> short -> char -> int -> long -> float -> double
		 * 
		 * Narrowing Casting (manually) - converting a larger type to a smaller size type 
		 * double -> float -> long -> int -> char -> short -> byte
		 */

		// byte < short < int < long < float < double

		/* 1.Auto Widening:
		 * If you convert small data type to large ones there is nothing to do. Java will convert automatically.
		 */
		final byte num01 = 12;
		final short num02 = num01;

		/* 2.Explicit Narrowing: 
		 * If you convert large data types  to small ones, its name is Explicit Narrowing. 
		 * Java does not do it. You have to do it manually by typing small data type inside the parenthesis.
		*/ 
		final int num03 = 14;
		final byte num04 = (byte) num03;

		// 1)Convert int to double. Auto Widening
		final int num05 = 19;
		final double num06 = num05;

		// 2)Convert float to double. Auto Widening
		final float num07 = 13.5f;
		final double num08 = num07;

		// 3)Convert double to short. Explicit Narrowing
		final double num09 = 13.3;
		final short num10 = (short) num09;

		// 4)Convert int to short. Explicit Narrowing
		final int num11 = 25;
		final short num12 = (short) num11;

		// In how many different ways, I can fix the following error?
		// float num13 = 3.23; //float num13 = 3.23f;
		// float num13 = (float)3.23;
		// double num13 = 3.23;

		// What do you see on the console?
		final int a = 5;
		final int b = 3;
		// If you divide int by int the result always will be integer.
		// Java cancels the decimal part and returns the whole part.
		// Java does not make round operation
		// 5/3 ==> 1 OR 5/4 ==> 1
		System.out.println(a / b);

		// What do you see on the console?
		final int c = 5;
		final double d = 3;
		// If the data types are different the result will be in the large data type
		System.out.println(c / d);// 1,666...

		// What do you see on the console?
		System.out.println(5f / 2);// 2.5
		// When you put d at the end of any number Java will accept it as double
		System.out.println(5d / 2d);// 2.5

	}

}
