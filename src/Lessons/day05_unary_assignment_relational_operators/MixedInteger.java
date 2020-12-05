package Lessons.day05_unary_assignment_relational_operators;

public class MixedInteger {

	public static void main(String[] args) {

		int i1 = 5;
		int i2 = 10;
		float f1 = 15.5f;
		double d1 = 20.5;
		System.out.println(f1);
		int res1 = i1 + i2;
		// float res2 = i1 + f1;
		double res3 = i2 + d1;
		System.out.println(res1);
		System.out.println(res3);

		short firstNumber = 10;
		short secondNumber = 20;

		int thirdNumber = firstNumber + secondNumber;
		System.out.println(thirdNumber);

		short thirdNumber2 = (short) (firstNumber + secondNumber);
		System.out.println(thirdNumber2);

//		byte b1=20;
//		byte b2=2;
//		byte b3 =(byte)(b1*b2);

		int b1 = 126;
		int b2 = 1;

		byte res = (byte) (b1 + b2); // Casting is required
		System.out.println(res);

		byte res2 = 126 + 1; // No casting is required
		System.out.println(res2);

	}

}
