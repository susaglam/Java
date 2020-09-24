package assignment.Arithmetic_Operators;

import java.util.Scanner;

import com.sun.org.apache.xalan.internal.xsltc.compiler.sym;
import com.sun.xml.internal.ws.api.pipe.NextAction;

public class Question6 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		 */

		int drinks;
		int totalDrinkMl; // Dont remember miligram to gram

		Scanner input = new Scanner(System.in);
		System.out.println("Number of milligrams in drink: ");

		totalDrinkMl = input.nextInt();

		drinks=10000/totalDrinkMl;

		System.out.println("Number of milligrams in drink: " + totalDrinkMl + " It would take about " + drinks
				+ " drinks for a lethal overdose");
	}
}
