package assignments.repl_it;

public class repl_179_Methods_with_String_2_unique {
    public static void main (String[] args) {
        System.out.println(uniqueChars("wooden-spoon"));
    }

    public static String uniqueChars (String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            String letter = String.valueOf(str.charAt(i));
            if (!result.contains(letter)) {
                result = result + str.charAt(i);
            }
        }
        return result;
    }
}
