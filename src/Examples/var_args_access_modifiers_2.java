package Examples;

public class var_args_access_modifiers_2 {
    public static void main (String[] args) {
        concat("C", "y", "b", "e", "r", "t", "e", "k");
        concat("Sukru"," Saglam");
        concat("Hello"," World");
        concat("Test"," D", "a","t","a");
    }

    public static void concat (String... words) {
        String result = "";
        for (String word : words) {
            result += word;
        }
        System.out.println(result);
    }
}
