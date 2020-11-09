package assignments.Assignment_8;

import java.util.Scanner;

public class Question_10 {
    public static void main (String[] args) {
        /*
        Question-10
        isEven method gets a number(int) if its even (2,4,8...) returns true.
        if its odd return false.

        for example:
        isEven(1) --> false
        isEven(8) --> true
         */

        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        System.out.println(isEven(num1));
        scan.close();
    }

    public static boolean isEven(int num1) {
        if (num1%2==0)
            return true ;
        else
            return false;

    }
}
