package assignments.repl_it.Repl_210;

public class Utils {
    public static String reverseLetters (String word) {
        char[] chars = word.toCharArray();
        // Initialize left and right pointers
        int right = chars.length - 1, left = 0;

        // Traverse string from both ends until
        // 'left' and 'right'
        while (left < right) {
            // Ignore special characters
            if (!Character.isAlphabetic(chars[left]))
                left++;
            else if (!Character.isAlphabetic(chars[right]))
                right--;

                // Both str[left] and str[right] are not spacial
            else {
                char temporary = chars[left];
                chars[left] = chars[right];
                chars[right] = temporary;
                left++;
                right--;
            }
        }
        String reverseString = new String(chars);
        return reverseString;
    }
}