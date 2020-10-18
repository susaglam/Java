package Examples.Patterns;

public class pattern2 {
	public static void main(String[] args) {

	/*
	1 2 3 4 5 6 7 
	1 2 3 4 5 6 
	1 2 3 4 5 
	1 2 3 4 
	1 2 3 
	1 2 
	1 
	*/
	
	for (int i = 7; i >= 1; i--) {
		for (int j = 1; i >= j; j++) {
			System.out.print(j + " ");
		}
		System.out.println();
		}
	}
}
