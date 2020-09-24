package assignment.Arithmetic_Operators;

import java.util.Scanner;

public class Question7 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Question-7
		 * 
		 * Write a program that determines the change to be dispensed from a vending
		 * machine. An item in the machine can cost between 25 cents and 1 dollar, in
		 * 5-cent increments (25, 30, 35, . . . , 90, 95, or 100), and the machine
		 * accepts only a single dollar bill to pay for the item.
		 * 
		 * Sample output
		 * 
		 * Price in cents : 95
		 * 
		 * Your change is 0 quarters, 0 dimes, and 1 nickles
		 */

		Scanner input = new Scanner(System.in);
		int amount, quarters, dimes, nickels, pennies, exchange;

		System.out.print("Please Enter the price of the(from 25 cents to a dollar, in 5-cent increments): ");
		amount = input.nextInt();

		exchange = 100 - amount;

		System.out.println("Amout in Return:" + exchange + "cents");

		quarters = exchange / 25;
		exchange = exchange % 25;

		dimes = exchange / 10;
		exchange = exchange % 10;

		nickels = exchange / 5;
		exchange = exchange % 5;

		pennies = exchange;

		System.out.println("Your change is " + quarters + " Quarters, :" + dimes + " Dimes, " + nickels + " nickles, "
				+ pennies + " Pennies");
		input.close();
	}
}
