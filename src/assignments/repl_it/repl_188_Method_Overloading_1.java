package assignments.repl_it;

/*
    In this task, you need to write 2 methods findMax() that will find a maximum number in the array.
    First method should work with array of integers (int[]) and return int, and second method should work
    with an array of doubles (double[]) and return double as a result.
 */
public class repl_188_Method_Overloading_1 {
	public static void main(String[] args) {

		double[] dValues = { 1.5, 2, 4, 7 };
		int[] iValues = { 1, 2, 3, 7, 9 };

		System.out.println(findMax(dValues));
		System.out.println(findMax(iValues));
	}

	public static double findMax(double[] values) {
		double max = -Double.MAX_VALUE;
		for (double value : values) {
			if (value > max) {
				max = value;
			}
		}
		return max;
	}

	public static int findMax(int[] values) {
		int max = -Integer.MAX_VALUE;
		for (int value : values) {
			if (value > max) {
				max = value;
			}
		}
		return max;
	}
}
