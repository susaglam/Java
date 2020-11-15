package assignments.repl_it;

import java.util.Arrays;
import java.util.Scanner;
/*
Modify an array that is "left shifted" by one -- so {6, 2, 5, 3}
becomes {2, 5, 3, 6}. You may modify and print the given array, or print a new array.
Example:
input: 6, 2, 5, 3
output: [2, 5, 3, 6]
 */

public class repl_130_Arrays_Shift_Left {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] nums = new int[size];
        for (int i = 0; i < size; i++) {
            nums[i] = scan.nextInt();
        }
        //WRITE YOUR CODE HERE
        int temp = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                temp = nums[i];
            }
            if (i < nums.length - 1) {
                nums[i] = nums[i + 1];
            } else {
                nums[i] = temp;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
