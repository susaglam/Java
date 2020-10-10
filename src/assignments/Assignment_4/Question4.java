package assignments.Assignment_4;

public class Question4 {
	public static void main(String[] args) {
		/*
		 * Question-4
		 * 
		 * Declare 2 variables (Num1, Num2)
		 * 
		 * Swap values between Num1 and Num2
		 * 
		 * Display new values of Num1 and Num2
		 * 
		 * Sample output:
		 * 
		 * n1=10 n2=20
		 * 
		 * ----------
		 * 
		 * n1=20 n2=10
		 */

		int n1 = 10; // num1
		int n2 = 20; // num2
		int t;

		System.out.println("n1= " + n1 + "  n2= " + n2);

		t = n2;// temp
		n2 = n1;
		n1=t;
		
		System.out.println("n1= " + n1 + "  n2= " + n2);

	}
}
