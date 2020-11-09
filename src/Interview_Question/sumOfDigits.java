package Interview_Question;

public class sumOfDigits {
    /*
     * String -- Frequency of Characters Write a return method that can find the
		 * frequency of characters
		 * -->: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
		 * String --> sum of digits in a string Write a method that can return the sum of
		 * the digits in a string
		Write a code to prove that strings are immutable in java?
     */
    public static void main (String[] args) {

        String a = "aab545bcd34dfgfd";
        System.out.println(getSumOfdigit(a));
    }

    private static int getSumOfdigit (String str) {
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                String b = str.substring(i, i + 1);
                sum += Integer.parseInt(b);
            }
        }
        return sum;
    }
}
