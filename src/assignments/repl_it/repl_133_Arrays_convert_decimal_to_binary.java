package assignments.repl_it;

import java.util.Arrays;
import java.util.Scanner;

/*
Binary number is a number expressed in the base-2 numeral system or binary numeral system,
which uses only two symbols: typically 0 (zero) and 1 (one). Each digit is referred to as a bit.

Given an int variable decimal,  write java program to calculate binary value of the decimal
variable and assign it binary array. print out value of binary array matching below format.
Feel free to use additional arrays or formulas.

Example:
decimal -> 3
binary -> [0, 0, 0, 0, 0, 0, 1, 1]

decimal -> 35
binary -> [0, 0, 1, 0, 0, 0, 1, 1]

decimal -> 255
binary -> [1, 1, 1, 1, 1, 1, 1, 1]
 */
public class repl_133_Arrays_convert_decimal_to_binary {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int decimal = input.nextInt();
		int[] binary = new int[8];

		// TODO: Write your code below.
		int index = 0;
		while (decimal > 0) {
			// find the remainder and assing binary last index to first
			binary[binary.length - index++ - 1] = decimal % 2;
			// divide decimal to 2
			decimal = decimal / 2;
		}
		System.out.println(Arrays.toString(binary));
		input.close();
	}
}
