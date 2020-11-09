package assignments.Assignment_8;

import java.util.Scanner;

public class Question_12 {
    public static void main (String[] args) {
        /*
        Question-12

        The danish prince most famous quote is "to be or not to be". thats a classic example of boolean logic.

        the hamletQuote method only returns true if one of or both of the boolean parameters is true.

        example:
        hamletQuote(true, false)
        returns true

        hamletQuote(false,true)
        returns true

        hamletQuote(true,true)
        returns true

        hamletQuote(false,false)
        returns false
         */

        Scanner scan = new Scanner(System.in);
        boolean bool1 = scan.nextBoolean();
        boolean bool2 = scan.nextBoolean();
        System.out.println(hamletQuote(bool1, bool2));
        scan.close();
    }

    public static boolean hamletQuote (boolean b1, boolean b2) {
        if (b1 || b2) {
            return true;
        } else {
            return false;
        }

    }
}
