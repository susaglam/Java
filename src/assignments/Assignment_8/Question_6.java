package assignments.Assignment_8;

import java.util.Scanner;

public class Question_6 {
    public static void main (String[] args) {
        /*
        Question-6
        Create a method called next3 .
        This method gets an int argument and prints the next 3 numbers after that number.
        Call the method from main method and pass num to it.
        enter number :    1
        next 3 are:
        2 3 4
        (put a space between numbers)
         */
        Scanner scan = new Scanner(System.in);
        System.out.print("enter number : ");
        int num = scan.nextInt();
        next3(num);
        scan.close();

    }

    private static void next3 (int num) {
        System.out.println("next 3 are :");
        for (int i = 0; i < 3; i++) {
            System.out.print(++num + " ");
        }
    }
}

