package assignments.repl_it;

import java.util.Scanner;
/*
Instructions from your teacher:
Inputs:
String word;

Write a for loop that will loop through every letter of
the input and print out just the vowels. Sample input/outputs
In: howdyho
oo

In: huehuehuehue
ueueueue

In: poopoo what idk what im doing
ooooaiaioi
 */

public class repl_023_For_Loops_5 {
    public static void main (String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String word = inp.nextLine();
        for (int w = 0; w < word.length(); w++) {
            char c = word.charAt(w);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                System.out.print(c);
            }
        }
    }
}
