package assignments.Assignment_5;

public class question13_ascii {

	public static void main(String[] args) {
		/*
		 * Print following chessboard using nested for loops.
			W B W B W B W B
			B W B W B W B W
			W B W B W B W B
			B W B W B W B W
			W B W B W B W B
			B W B W B W B W
			W B W B W B W B
			B W B W B W B W

			NOTE:
			1. Total 8 rows and 8 columns.
			2. "W" and "B" are in alternate positions (row-wise or column-wise), you will not find consecutive W or B.
		 */

		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 8; j++) {
				System.out.print("█");
				System.out.print("░");
			}
			System.out.println();
			for (int j = 1; j <= 8; j++) {
				System.out.print("░");
				System.out.print("█");
			}
			System.out.println();
		}
	}
}
