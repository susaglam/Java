package assignment.Arithmetic_Operators;

import java.util.Scanner;

public class Question7_secondExm {
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
		int amount, quarters, dimes, nickels, pennies, change;

		System.out.print("Please Enter the price of the(from 25 cents to a dollar, in 5-cent increments): ");
		amount = input.nextInt();
		change = 100 - amount;

		System.out.println("Amout in Return:" + change + "cents");

		quarters = change / 25;// 25 cent
		change = change % 25;

		dimes = change / 10; //10 cent
		change = change % 10;

		nickels = change / 5; //5 cent
		change = change % 5; 

		pennies = change;

		System.out.println("Your change is " + quarters + " Quarters, :" + dimes + " Dimes, " + nickels + " nickles, "+ pennies + " Pennies");
		input.close();
	}
}
