package assignments.repl_it;

/*
    Anagram is a word, phrase, or name formed by rearranging the letters of another,
    such as cinema, formed from iceman.
    isAnagram method checks if word1 and word2 are anagram
    to each other than return a boolean.

    each letter in word1 should appear in word2 exact number of times
    ignore empty spaces
    make your code case-insensitive.

    Examples:

    isAnagram("listen", "Silent") ==> true

    isAnagram("earth", "heart") ==> true

    isAnagram("star", "rats") ==> true

    isAnagram("hi", "bye") ==> false

    isAnagram("java", "cava") ==> false
 */
public class repl_204_Methods_with_String_15_anagram {
    public static void main (String[] args) {
        System.out.println(isAnagram("test", "setT"));
    }
    public static boolean isAnagram (String word1, String word2) {
        int wordCount1 = 0;
        int wordCount2 = 0;
        String w1 = "", w2 = "";
        word1 = word1.toLowerCase().replaceAll("\\s+","");
        word2 = word2.toLowerCase().replaceAll("\\s+","");
        for (char letter = 'a'; letter <= 'z'; letter++) {
            for (int i = 0; i < word1.length(); i++) {
                if (word1.charAt(i) == letter) {
                    wordCount1++;
                }
            }
            for (int i = 0; i < word2.length(); i++) {
                if (word2.charAt(i) == letter) {
                    wordCount2++;
                }
            }
            if (wordCount1 > 0) {
                w1 += letter + "" + wordCount1;
                w2 += letter + "" + wordCount2;
                System.out.println(w1);
                System.out.println(w2);
                wordCount1 = 0;
                wordCount2 = 0;
            }
        }
        if (w1.equals(w2)) {
            return true;
        } else {
            return false;
        }
    }

}
