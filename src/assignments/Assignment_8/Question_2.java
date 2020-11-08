package assignments.Assignment_8;

import java.util.Scanner;

public class Question_2 {

    public static void main (String[] args) {
        /*
        Create a method called cube.
        Write all required code inside this method in order
        to ask the user for a number and then prints the cubed
        value of that number:

        Example:

        input: 5
        output: 125
         */
        Scanner scan = new Scanner(System.in);
        int num1;
        System.out.print("Enter number  : ");
        num1 = scan.nextInt();

        cube(num1);
    }

    public static void cube (int num1) {
        int result = 1;
        for (int i = 1; i <= 3; i++) {
            result *= num1;
        }
        System.out.println("Result : " + (result));
    }
}
