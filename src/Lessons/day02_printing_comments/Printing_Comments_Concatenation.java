package Lessons.day02_printing_comments;

public class Printing_Comments_Concatenation {

	public static void main(final String[] args) {
		/*
		 * To join two or more Strings we use Concatenation operation
		 */

		final String s1 = "Java";
		final String s2 = "is easy";
		System.out.println(s1 + " " + s2);// Java is easy

		final String s3 = "2";
		final int i1 = 3;
		final int i2 = 4;

		System.out.println(s3 + i1 + i2);
		System.out.println(s3 + (i1 + i2));
		System.out.println(i1 + i2 + s3);

		System.out.println("Hi, My Number is 100");
		System.out.println("Hi, My Number is " + "100");
		System.out.println("Hi, My Number is " + 100);

		final int number = 100;
		System.out.println("Hi, My Number is " + number);

		final int numA = 2;
		final int numB = 3;
		final String str1 = "Study";
		
		//Print 5 Study
		System.out.println(numA + numB + " " + str1);
		
		//Print 61 Study-1
		System.out.println((numA*numB) + "" + (numB - numA) + " " + str1 + (numA - numB));//61 Study-1
		
		//You can use comparison operators for all primitive data types.
		//Everytime, you get boolean results from comparison operators
		System.out.println(5 == 2+3);//true
		System.out.println(5 < 2+3);//false
		System.out.println(5 <= 2+3);//true
		System.out.println(5 > 2+3);//false
		System.out.println(5 >= 2+3);//true
		System.out.println(5 != 2+3);//false
		
		System.out.println('a' == 'A');//false
		System.out.println('a' > 'A');//true
		
		System.out.println(true == true);//true
		System.out.println(true == false);//false

		

	}

}
