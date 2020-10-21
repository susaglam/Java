package assignments.Lab2;

import java.util.Scanner;

/*
Question-6

Write a program that will ask the user to enter the amount of a purchase.
The program should then compute the state and county tax sales tax.
Assume the state sales tax is 4 percent, and the county sales tax is 2 percent.
The program should display the amount of the purchase , the state sales tax,
the county sales tax, the total sales tax, and the total of the sale
(which is the sum of the amount of purchase plus the total sales tax)
*/
public class Lab2_6_Purchase_tax {
    public static void main (String[] args) {
        double amountOfPurchase;
        final double stateTax = 0.04; // 4% assume the state sales tax
        final double countyTax = 0.02; // 4% assume the state sales tax
        double taxAmount;
        double totalWithTax;
        double countyTaxTotal;
        double stateTaxTotal;

        Scanner scan = new Scanner(System.in);

        System.out.print("Please enter the amount of purchase   $");
        amountOfPurchase = scan.nextDouble();

        scan.nextLine();

        countyTaxTotal = amountOfPurchase * countyTax;
        stateTaxTotal = amountOfPurchase * stateTax;
        taxAmount = stateTaxTotal + countyTaxTotal;

        totalWithTax = amountOfPurchase + taxAmount;

        System.out.println("|Your amount of purchase is \t\t\t$" + amountOfPurchase + "|");
        System.out.println("|Your County Tax amount is \t\t\t\t$" + countyTaxTotal+ " |");
        System.out.println("|Your State Tax amount is \t\t\t\t$" + stateTaxTotal + " |");
        System.out.println("|Your total tax amount is \t\t\t\t$" + taxAmount + " |");
        System.out.println("|____________________________________________|");
        System.out.println("Your total bill amount is \t\t\t\t" +
                "$" + totalWithTax);

        scan.close();
    }
}
