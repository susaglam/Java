package assignments.Assignment_4;

public class Question1 {

	public static void main(String[] args) {
		/*
		 * Question-1
		 * 
		 * Write a program to convert gallons into Liters and display it.
		 * 
		 * Sample output:
		 * 
		 * 15 gallon is 56.7812 liter
		 */

		double gallons; // gallons
		double liters; // liters

		gallons = 15; // gallons

		liters = gallons * 3.7854; // conversion to liters

		System.out.println(gallons + " gallons is " + liters + " liters.");

	}
}
