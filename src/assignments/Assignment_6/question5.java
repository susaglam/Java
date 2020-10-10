package assignments.Assignment_6;

public class question5 {

	public static void main(String[] args) {
		/*
		 * Question-5
			Write a Java program to print the following pattern
			
			1111111
			1111122
			1111333
			1114444
			1155555
			1666666
			7777777
		 */
		for (int i = 1; i <= 7; i++) {			
			for (int j = 7; j >=1 ; j--) {				
				if(j<=i)
				System.out.print(i);
				else
					System.out.print(1);	
			}
			System.out.println();
		}
		
		
		
	}
}
