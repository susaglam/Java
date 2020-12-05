package assignments.Lab2;

import java.util.Scanner;

/*
Question-3

Write a program that asks the user for a
positive nonzero integer value.
The program should use a loop to get the sum of
all the integers from 1 up to the number entered.
*/
public class Lab2_4_Display_PercentageOf_MalesAndFemales {
    public static void main (String[] args) {
        int numberOfMales = 0, numberOfFemales = 0, totalPerson;
        double percentageOfMales, percentageOfFemales;

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number of males: ");
        numberOfMales = scan.nextInt();

        System.out.print("Enter number of females: ");
        numberOfFemales = scan.nextInt();

        totalPerson = numberOfFemales + numberOfMales;
        percentageOfFemales = ((double)numberOfFemales/(double)totalPerson) * 100;
        percentageOfMales = ((double)numberOfMales/(double)totalPerson) * 100;

        System.out.println("Percentage of Males  : %" + percentageOfMales);
        System.out.println("Percentage of Females  : %" + percentageOfFemales);
        scan.close();
    }
}
