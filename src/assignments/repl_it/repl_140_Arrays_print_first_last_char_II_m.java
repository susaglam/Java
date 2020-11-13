package assignments.repl_it;

import java.util.Arrays;
import java.util.Scanner;

/*
Given a String array words, iterate through each word and print
first and last letter of each element in the format below.
Example:
words → ["hello", "why", "by", "apple" , "note"]
print → [ho, wy, by, ae, ne]
 */
public class repl_140_Arrays_print_first_last_char_II_m {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine()};

        //TODO: Write your code below
        for (int i = 0; i < words.length; i++) {
            words[i] = words[i].charAt(0) + "" + words[i].charAt(words[i].length()-1);
        }
        System.out.println(Arrays.deepToString(words));
    }
}
