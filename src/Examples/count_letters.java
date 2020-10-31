package Examples;

public class count_letters {
    public static void main (String[] args) {
        freqOfEachChar("testingggaabbccddd");
    }

    public static void freqOfEachChar (String str) {
        int wordCount1 = 0;
        for (char letter = 'a'; letter <= 'z'; letter++) {
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == letter) {
                    wordCount1++;
                }
            }
            if (wordCount1 > 0) {
                System.out.println(letter + " = " + wordCount1);
                wordCount1 = 0;
            }
        }
    }
}
