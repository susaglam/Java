package assignments.Assignment_5;

public class question11 {

	public static void main(String[] args) {
		/*
		 * Question-11:

			Print the following output using nested for loops.
			
			4       3       2      1
			
			    3       2      1
			
			       2       1
			
			            1
		*/
		
		int row = 4; // Set row numbers
		int col = 4; // Set column numbers
		
		// 1- Create Column at row 
		for (int i = 1; i <= col; i++) { 
			
			// 2- Print every row space value if needed
			for (int j = 1; j < i; j++) {
				System.out.print(" ");
			}
			
			// 3- Print every row column values
			for (int k = row; k >= 1; k--) {
				System.out.print(k + " ");
			} 
			
			// 4- Print go to next row
			System.out.println(); // to end of the	line
			
			// 5- Decrease the amount of remaining lines
			row--; 
		}

	}
}
