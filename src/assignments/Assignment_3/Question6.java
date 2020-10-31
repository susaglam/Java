package assignments.Assignment_3;

import java.util.Scanner;


public class Question6 {
	public static void main(String[] args) {
		/*
		 * Question-6
		 * 
		 * Scientists estimate that roughly 10 grams of caffeine consumed at one time is
		 * a lethal overdose.
		 * 
		 * Write a program with a variable that holds the number of milligrams of
		 * caffeine in a drink and outputs how many drinks it takes to kill a person.
		 * 
		 * Sample Output
		 * 
		 * Number of milligrams in drink: 500 It would take about 20 drinks for a lethal
		 * overdose
		 * 
		 * 
		 * Real : 1 coffe approx 240 ml caffein -source https://www.compoundchem.com/2014/07/27/lethaldoses/
		 */

		int drinks;
		int totalDrinkMl; // Dont remember miligram to gram

		Scanner input = new Scanner(System.in);
		System.out.println("Number of milligrams in drink: ");

		totalDrinkMl = input.nextInt();

		drinks=10000/totalDrinkMl;

		System.out.println("Number of milligrams in drink: " + totalDrinkMl + " It would take about " + drinks
				+ " drinks for a lethal overdose");
				input.close();
	}
}
