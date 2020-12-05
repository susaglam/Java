package assignments.Assignment_8;

public class Question_14 {
	public static void main(String[] args) {
		/*
		 * Question-14
		 * 
		 * This one is about truth table logic, threeLocks gets 3 booleans and returns a
		 * boolean.
		 * 
		 * It returns true only if both a and b are true or c is true.
		 * 
		 * https://en.wikipedia.org/wiki/Truth_table
		 */
		boolean a, b, c;
		a = true;
		b = false;
		c = true;
		System.out.println(truthTable(a, b, c));
	}

	public static boolean truthTable(boolean a, boolean b, boolean c) {
		if ((a || b) || c) {
			return true;
		} else {
			return false;
		}
	}
}
