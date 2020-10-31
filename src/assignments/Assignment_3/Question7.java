package assignments.Assignment_3;

public class Question7 {
	public static void main(String[] args) {
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

		int  quarters, dimes, nickels, change;
		//  quarters is 25 cent, dimes is 10 cent, nickels is 5 cent, exchange is;
		change = 100 - 95;// 95 cents used change = 5 cent

		System.out.println("Amount in Return:" + change + "cents");

		quarters = change / 25;// 5/25 =0.2 but it is integer = 0 Quarters
		change = change % 25;// 5

		dimes = change / 10; // 5/10 = 0.5 but it is integer = 0 dimes
		change = change % 10; // 5

		nickels = change / 5; // 5/5 = 1 nickels
		change = change % 5;//  0

		System.out.println("Your change is " + quarters + " Quarters, :" + dimes + " Dimes, " + nickels + " nickles");
	}
}
