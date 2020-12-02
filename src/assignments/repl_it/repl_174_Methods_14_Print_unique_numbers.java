package assignments.repl_it;

import java.util.Scanner;

public class repl_174_Methods_14_Print_unique_numbers {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		int[] nums = new int[size];
		for (int i = 0; i < size; i++) {
			nums[i] = scan.nextInt();
		}
		printUniqueNumbers(nums);
		scan.close();
	}

	public static void printUniqueNumbers(int[] nums) {
		// WRITE YOUR CODE HERE
		for (int i = 0; i < nums.length; i++) {
			int count = 0;
			for (int j = 0; j < nums.length; j++) {
				if ((nums[i] == nums[j]) && (i != j)) {
					count++;
				}
			}
			if (count == 0) {
				System.out.println(nums[i]);
			}
		}
	}
}
