package assignments.Assignment_8;

import java.util.Scanner;

public class Question_9 {
    public static void main (String[] args) {
        /*
        Question-9

        Create a method called max. It gets two ints, x and max.
        x is the test case, max is what we test against.

        if x is bigger then max return max
        in any other case return x.

        for example:

        max(1,10)
        returns 1

        max(11,5)
        returns 5
         */

        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        System.out.println(max(num1, num2));
        scan.close();
    }

    public static int max (int num1, int num2) {
        if (num1 < num2)
            return num1;
        else
            return num2;

    }
}
