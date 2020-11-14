package Interview_Question;

import java.util.Arrays;

public class frequencyOfCharacters {
    /*String -- Frequency of Characters Write a return method that can find the
     * frequency of characters
     * -->: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
     */
    public static void main (String[] args) {
        System.out.println(FrequencyOfChars("AAABBCDD"));        // ==> A3B2C1D2
    }

    public static String FrequencyOfChars (String str) {
        String unique = "";
        str = sort(str); // sorting string
        int c = 1;
        for (int i = 0; i < str.length(); i++) {
            //We compare every char with next char. str.charAt(i) == str.charAt(i + 1)
            //if they are equal increase the count
            //if they are not equal then write the letter and count
            //I used str.charAt(i + 1) for found next char
            // but if (i + 1) equal to str.length  then  i used ternary operator =>      (i + 1) == str.length() ? str.length() - 1
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
    public static String sort (String str) {
        // convert string to char array
        char temp[] = str.toCharArray();

        // sorting
        Arrays.sort(temp);
        //and returning
        return new String(temp);
    }
}
