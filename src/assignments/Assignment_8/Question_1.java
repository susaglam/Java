package assignments.Assignment_8;

import java.util.Scanner;

public class Question_1 {

    public static int num1;
    public static int num2;

    public static void main (String[] args) {
        /*
        Create a method called "plus", its return is void and it gets no arguments.

        It asks the user to input two numbers, then it will add them and print the result.
        Create a scanner within the plus method.
        Example:

        enter first number :  1
        enter second number:  2
        result: 3
         */
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter first number  : ");
        num1 = scan.nextInt();
        System.out.print("Enter second number : ");
        num2 = scan.nextInt();
        plus();
    }

    public static void plus () {
        System.out.println("Result : " + (num1 + num2));
    }
}
