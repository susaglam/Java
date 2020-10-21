package assignments.Lab2;

import java.util.Scanner;

/*
Question-3

Write a program that asks the user for a
positive nonzero integer value.
The program should use a loop to get the sum of
all the integers from 1 up to the number entered.
*/
public class Lab2_3_Sum_Of_All_Integers {
    public static void main (String[] args) {
        int numbers = 0, nextNumber = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a positive nonzero integer number: ");
        numbers += scan.nextInt();

        do {
            System.out.print("Enter a positive nonzero integer number: ");
            numbers += scan.nextInt();

            System.out.print("Do you want to enter another number : 0-NO   1-YES ");
            nextNumber = scan.nextInt();

            if (nextNumber != 1)
                break;
        } while (nextNumber == 1);

        System.out.print("Sum of total all numbers  : " + numbers);
        scan.close();
    }
}
