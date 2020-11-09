package assignments.Assignment_8;

import java.util.Scanner;

public class Question_7 {
    public static void main (String[] args) {
        /*
        Question-7

        Complete a method isPalindrome() that will check if the number is a palindrome. Print your result as a boolean (true or false).
        Do not convert int into a string!
        Example:
        input: 1001
        output: true
        Example:
        input: 1234
        output: false
         */
        Scanner scan = new Scanner(System.in);
        String pal_check = scan.next();
        System.out.println(isPalindrome(pal_check));
    }

    static boolean isPalindrome (String pal_check) {
        int ltr = 0, rtl = pal_check.length() - 1;
        while (ltr < rtl) {
            if (pal_check.charAt(ltr) != pal_check.charAt(rtl))
                return false;
            ltr++;
            rtl--;
        }
        return true;
    }
}
