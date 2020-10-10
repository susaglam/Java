package assignments.Assignment_5;

public class question7 {

	public static void main(String[] args) {
		/*
		 * Question-7:
		 * 
		 * Write a Java program to print all the numbers between 1 and 100 (including 1
		 * and 100) which are divisible by 5.
		 */
		
		System.out.println("Between 1 and 100  which are divisible by 5.");
		
		for (int i = 1; i <= 100; ++i) {			
			if(i%5==0)
			{
				System.out.println(i);
			}			
		}		
	}
}
