package classes;

public class Primitive_Data_Types {

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
		
		//Integer Types
		//Byte
		//The byte data type can store whole numbers from -128 to 127. This can be used instead of int or other integer types to save memory when you are certain that the value will be within -128 and 127:

		byte myNum = 100;
		System.out.println(myNum);

		//Short
		//The short data type can store whole numbers from -32768 to 32767:

		short myNum1 = 5000;
		System.out.println(myNum1);

		//Int
		//The int data type can store whole numbers from -2147483648 to 2147483647. In general, and in our tutorial, the int data type is the preferred data type when we create variables with a numeric value.

		int myNum2 = 100000;
		System.out.println(myNum2);

		//Long
		//The long data type can store whole numbers from -9223372036854775808 to 9223372036854775807. This is used when int is not large enough to store the value. Note that you should end the value with an "L":

		
		long myNum3 = 15000000000L;
		System.out.println(myNum3);

		//Floating Point Types
		//You should use a floating point type whenever you need a number with a decimal, such as 9.99 or 3.14515.

		//Float
		//The float data type can store fractional numbers from 3.4e−038 to 3.4e+038. Note that you should end the value with an "f":

		float myNum4 = 5.75f;
		System.out.println(myNum4);

		//Double
		//The double data type can store fractional numbers from 1.7e−308 to 1.7e+308. Note that you should end the value with a "d":

		double myNum5 = 19.99d;
		System.out.println(myNum5);

		//Use float or double?

		//The precision of a floating point value indicates how many digits the value can have after the decimal point. The precision of float is only six or seven decimal digits, while double variables have a precision of about 15 digits. Therefore it is safer to use double for most calculations.

		//Scientific Numbers
		//A floating point number can also be a scientific number with an "e" to indicate the power of 10:

		float f1 = 35e3f;
		double d1 = 12E4d;
		System.out.println(f1);
		System.out.println(d1);

		//Booleans
		//A boolean data type is declared with the boolean keyword and can only take the values true or false:

		boolean isJavaFun = true;
		boolean isFishTasty = false;
		System.out.println(isJavaFun);     // Outputs true
		System.out.println(isFishTasty);   // Outputs false

		//Boolean values are mostly used for conditional testing, which you will learn more about in a later chapter.

		//Characters
		//The char data type is used to store a single character. The character must be surrounded by single quotes, like 'A' or 'c':

		char myGrade = 'B';
		System.out.println(myGrade);

		//Alternatively, you can use ASCII values to display certain characters:

		char a = 65, b = 66, c = 67;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);

		//Tip: A list of all ASCII values can be found in our ASCII Table Reference.

		//Strings
		//The String data type is used to store a sequence of characters (text). String values must be surrounded by double quotes:

		String greeting = "Hello World";
		System.out.println(greeting);
		
		
	}

}
