package Interview_Question;

public class frequencyOfCharacters {
    /*
            String -- Frequency of Characters Write a return method that can find the
		 * frequency of characters
		 * -->: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
         */
    public static void main (String[] args) {
        System.out.println(FrequencyOfChars("AAABBCDD"));
        // ==> A3B2C1D2
    }

    public static String FrequencyOfChars (String str) {
        String unique = "";
        for (int i = 0; i < str.length(); i++) {

            if (!unique.contains(str.charAt(i) + "")) {
                unique += str.charAt(i);
            }
        }

        String result = "";
        for (int j = 0; j < unique.length(); j++) {
            int count = 0;
            for (int k = 0; k < str.length(); k++) {
                if (str.charAt(k) == unique.charAt(j)) {
                    count++;
                }
            }
            result += unique.charAt(j) + "" + count;
        }
        return result;
    }
}
