package classes;

public class Printing_Comments_Concatenation {

	public static void main(String[] args) {			
		/*
		 To join two or more Strings we use Concatenation operation
		*/
		
		String s1 = "Java";
		String s2 = "is easy";
		System.out.println(s1 + " " + s2);//Java is easy
		
		String s3 = "2";
		int i1 = 3;
		int i2 = 4;
		
		System.out.println(s3 + i1 + i2);
		System.out.println(s3 + (i1 + i2));
		System.out.println(i1 + i2 + s3);
		
		System.out.println("Hi, My Number is 100");
		System.out.println("Hi, My Number is " + "100");
		System.out.println("Hi, My Number is " + 100);
		
		int number = 100;
		System.out.println("Hi, My Number is " + number);
		
		
		int numA = 2;
		int numB = 3;
		String str1 = "Study";
		
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
