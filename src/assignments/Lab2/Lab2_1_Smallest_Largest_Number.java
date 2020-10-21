package assignments.Lab2;

import java.util.Arrays;
import java.util.Scanner;

/*Question-1

   Write a program with a loop that lets the user enter a series of integer numbers.
   After all the numbers have been entered, the program should
   display the largest and smallest numbers entered.
*/
public class Lab2_1_Smallest_Largest_Number {
    public static int max = Integer.MIN_VALUE;  // Initialize a max with minimum value
    public static int min = Integer.MAX_VALUE;  // Initialize a min with maximum value
    public  static void minMaxNumber(int number)
    {
        if (number > max) {
            max = number;
        }

        if (number < min) {
            min = number;
        }
    }
    public static void main (String[] args) {
        int number;
        int nextNumber;

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your first number: ");
        number = scan.nextInt();
        minMaxNumber(number);
        System.out.print("Enter your next number: ");
        number = scan.nextInt();
        minMaxNumber(number);
        do {
            System.out.print("Do you want to enter another number : 0-NO   1-YES ");
            nextNumber = scan.nextInt();
            if (nextNumber!=1)
                break;
            System.out.print("Enter your next number: ");
            number = scan.nextInt();
            minMaxNumber(number);

        } while (nextNumber == 1);

        System.out.println("The Largest number: " + max);
        System.out.println("The Smallest number: " + min);
        scan.close();
    }



}
