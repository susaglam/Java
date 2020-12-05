package assignments.Assignment_9;

import java.util.Scanner;

public class Question_1 {
	/*
	 * Question-1 Create a method called tipCalculator which accepts parameters:
	 * boolean isSplit, int numberPeople, double checkAmount, String serviceQuality
	 * 
	 * Ask the user to enter each value.
	 * 
	 * User should select service quality that will correspond to tip percent.
	 * 
	 * Poor = 5% Fair = 10% Good = 15% Great = 20% Excellent = 25%
	 * 
	 * The program should display the following information based on the user input:
	 * Split or No split Number of people entered: &&&& Service Quality: Total to
	 * pay: Total tip: Total per person: Tip per person:
	 * 
	 * Input: Split:Yes Number of people:4 Check amount:476.0 Service
	 * Quality:Excellent
	 * 
	 * Output: Number of people entered: &&&& Total to pay: 595.0 Total tip: 119.0
	 * Total per person: 148.75 Tip per person: 29.75
	 */

	public static void main(String[] args) {
		int totalPeople;
		double checkAmount, tipPrice = 1;
		String serviceQuality;

		Scanner input = new Scanner(System.in);

		System.out.println("Split:");
		//split = input.next();
		System.out.println("Number of people:");
		totalPeople = input.nextInt();
		System.out.println("Check amount:");
		checkAmount = input.nextDouble();
		System.out.println("Service Quality:");
		serviceQuality = input.next();

		switch (serviceQuality) {
		case "Poor":
			tipPrice = checkAmount / 100 * 5;
			break;

		case "Fair":
			tipPrice = checkAmount / 100 * 10;
			break;

		case "Good":
			tipPrice = checkAmount / 100 * 15;
			break;

		case "Great":
			tipPrice = checkAmount / 100 * 20;
			break;

		case "Excellent":
			tipPrice = checkAmount / 100 * 25;
			break;
		}

		System.out.print("Number of people entered: ");
		for (int inum = 1; inum <= totalPeople; inum++) {
			System.out.print("&");
		}
		System.out.println("\nTotal to pay: " + (checkAmount + tipPrice));
		System.out.println("Total tip: " + tipPrice);
		System.out.println("Total per person: " + (checkAmount + tipPrice) / totalPeople);
		System.out.println("Tip per person: " + (tipPrice / totalPeople));
		input.close();
	}
}
