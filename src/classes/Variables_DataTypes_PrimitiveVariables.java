package classes;

public class Variables_DataTypes_PrimitiveVariables {

	public static void main(String[] args) {

		/*
		 * Data Type	 Size		Description
		 *	byte		1 byte		Stores whole numbers from -128 to 127
		 *	short		2 bytes		Stores whole numbers from -32,768 to 32,767
		 *	int			4 bytes		Stores whole numbers from -2,147,483,648 to 2,147,483,647
		 *	long		8 bytes		Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
		 *	float		4 bytes		Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
		 *	double		8 bytes		Stores fractional numbers. Sufficient for storing 15 decimal digits
		 *	boolean		1 bit		Stores true or false values
		 *	char		2 bytes		Stores a single character/letter or ASCII values
		 */

		byte b1 = 25;
		byte b2 = -25;
		// byte b3 = 128;

		System.out.println("b1 = " + b1);
		System.out.println("b2 = " + b2);

		short s1 = -32768;
		short s2 = 32767;
		short s3 = 500;

		System.out.println("s1 = " + s1);
		System.out.println("s2 = " + s2);
		System.out.println("s3 = " + s3);

		int i1 = -214768;
		int i2 = 20;
		int i3 = 100_000;
		int i4 = 100000;

		System.out.println("i1 = " + i1);
		System.out.println("i2 = " + i2);
		System.out.println("i3 = " + i3);

		long l1 = 5000; // Suffix L is optional. Literal 5000 is of int type
		long l2 = -2147483649L; // Suffix L is mandatory, this number is out of int range

		long creditCardNumber = 5876_1234_3453_9832l;

		System.out.println("l1 = " + l1);
		System.out.println("l2 = " + l2);
		System.out.println("creditCardNumber = " + creditCardNumber);

		// Floating Numbers : default is double
		float f1 = 2.1f;

		double d1 = 3.14687868594949395885;

		System.out.println("f1 = " + f1);
		System.out.println("d1 = " + d1);

		char c1 = 'A';
		char c2 = 65; // Decimal value corresponding to character 'A'
		System.out.println(c2);

		char c3 = '\u0041';
		System.out.println(c3);

		char c4 = 8658;
		System.out.println(c4);

		boolean status = true;
		boolean status2 = false;

		System.out.println("Eligible to take the exam: " + status);
		System.out.println("He is 16, can he take driver licence? :" + status2);

		String name = "Ozzy";
		System.out.println("My name is " + name);

		String age = "12";

	}

}
