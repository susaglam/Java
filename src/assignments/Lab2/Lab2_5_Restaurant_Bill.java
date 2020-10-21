package assignments.Lab2;

import java.util.Scanner;

/*
Question-5

Write a program that computes the tax and tip on a restaurant bill.
The program should ask the user to enter the charge for the meal.
The tax should be 6.75 percent of the meal charge.
The tip should be 20 percent of the total after adding tax.
Display the meal charge, tax amount, tip amount, and total bill on the screen.
*/
public class Lab2_5_Restaurant_Bill {
    public static void main (String[] args) {
        double mealCharge;
        final double tax = 0.0675; // 6.75% constant amount of meal charge
        double taxAmount;
        double totalWithTax;
        final double tip = 0.20; // 20% constant amount of total amount after adding tax amount
        double tipAmount;
        double totalBill;

        Scanner scan = new Scanner(System.in);

        //user has to enter the charge for the meal
        System.out.print("Please enter the charge for your meal $");
        mealCharge = scan.nextDouble();

        scan.nextLine();

        //calculate meal charge, tax amount, tip amount, and total bill
        taxAmount = mealCharge * tax;
        totalWithTax = mealCharge + taxAmount;
        tipAmount = totalWithTax * tip;
        totalBill = totalWithTax + tipAmount;

        //display to user meal charge, tax amount, tip amount, and total bill
        System.out.println("Your meal charge amount is $" + mealCharge + ".");
        System.out.println("Your tax amount is $" + taxAmount + ".");
        System.out.println("Your tip amount is $" + tipAmount + ".");
        System.out.println("-----------------------------------");
        System.out.println("Your total bill amount is $" + totalBill + ".");

        scan.close();
    }
}
