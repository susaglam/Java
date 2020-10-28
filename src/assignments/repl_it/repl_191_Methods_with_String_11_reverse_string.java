package assignments.repl_it;

public class repl_191_Methods_with_String_11_reverse_string {
    public static String reverse (String input) {
        String rv = "";
        for (int i = (input.length() - 1); i >= 0; i--) {
            // rv.concat(Character.toString(input.charAt(i)));
            rv += input.charAt(i);

        }
        return rv;
    }
}
