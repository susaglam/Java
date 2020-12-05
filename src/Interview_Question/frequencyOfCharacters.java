package Interview_Question;

import java.util.*;

public class frequencyOfCharacters {
	/*
	 * String -- Frequency of Characters Write a return method that can find the
	 * frequency of characters -->: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
	 */
	public static void main(String[] args) {
		System.out.println(FrequencyOfChars ("AAABBCDD")); // ==> A3B2C1D2
		System.out.println(FrequencyOfChars2("AAABBCDD"));
		System.out.println(FrequencyOfChars3("AAABBCDD"));
		System.out.println(FrequencyOfChars4("AAABBCDD"));
		System.out.println(FrequencyOfChars0("AAABBCDD"));
	}

	public static String FrequencyOfChars0(String str) {
		String unique = "";
		int count = 0;
		for (int j = 0; j < str.length(); j++) {

			if (!unique.contains("" + str.charAt(j))) {
				unique += str.charAt(j);
			}

			for (int i = j; i < str.length(); i++) {
				if (unique.contains("" + str.charAt(i))) {
					count++;
				}
			}

			unique += j == str.length() - 1 ? count : "";
			count = 0;
		}
		return unique;
	}

	public static String FrequencyOfChars(String str) {
		String unique = "";
		str = sort(str); // sorting string
		int c = 1;
		for (int i = 0; i < str.length(); i++) {
			// We compare every char with next char. str.charAt(i) == str.charAt(i + 1)
			// if they are equal increase the count
			// if they are not equal then write the letter and count
			// I used str.charAt(i + 1) for found next char
			// but if (i + 1) equal to str.length then i used ternary operator => (i + 1) ==
			// str.length() ? str.length() - 1
			// and write the last char and count
			if (str.charAt(i) == ((i + 1) == str.length() ? str.length() - 1 : str.charAt(i + 1))) {
				c++;
			} else {
				unique += str.charAt(i) + "" + c;
				c = 1;
			}
		}
		return unique;
	}

	// Method to sort a string alphabetically
	public static String sort(String str) {
		// convert string to char array
		char temp[] = str.toCharArray();

		// sorting
		Arrays.sort(temp);
		// and returning
		return new String(temp);
	}

	// another solution 2
	public static String FrequencyOfChars2(String str) {
		String nonDup = "";
		for (int i = 0; i < str.length(); i++)
			if (!nonDup.contains("" + str.charAt(i)))
				nonDup += "" + str.charAt(i);
		String expectedResult = "";
		for (int j = 0; j < nonDup.length(); j++) {
			int count = 0;
			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) == nonDup.charAt(j))
					count++;
			}
			expectedResult += nonDup.charAt(j) + "" + count;
		}
		return expectedResult;
	}

	public static String FrequencyOfChars3(String str) {
		String expectedResult = "";
		int j = 0;
		while (j < str.length()) {
			int count = 0;
			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) == str.charAt(j)) {
					count++;
				}
			}
			expectedResult += str.charAt(j) + "" + count;
			str = str.replace("" + str.charAt(j), "");
		}
		return expectedResult;
	}

	// solution 4
	public static String FrequencyOfChars4(String str) {

		String nonDup = "", result = "";
		for (int i = 0; i < str.length(); i++)
			if (!nonDup.contains("" + str.charAt(i)))
				nonDup += "" + str.charAt(i);
		for (int i = 0; i < nonDup.length(); i++) {
			int num = Collections.frequency(Arrays.asList(str.split("")), "" + nonDup.charAt(i));
			result += "" + nonDup.charAt(i) + num;
		}
		return result;
	}
}
