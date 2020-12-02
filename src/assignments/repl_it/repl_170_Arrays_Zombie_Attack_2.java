package assignments.repl_it;

import java.util.Arrays;
import java.util.Scanner;
/*
An array inhabitants represents cities and their respective populations.
For example, the following arrays shows 8 cities and their respective populations:
[3, 6, 0, 4, 3, 2, 7, 0]
Some cities have a population of 0 due to a pandemic zombie disease
that is wiping away the human lives.After each day, any city that is adjacent
to a zombie-ridden city will lose half of its population.

Write a program to loop though each city population and make it lose half of
its population if it is adjacent(right or left) to a city with zero people
until all cities have no humans left.

 Make updates to each element in the array And print the array like below for each day:

Day 0 [3, 6, 0, 4, 3, 2, 7, 0]
Day 1 [3, 3, 0, 2, 3, 2, 3, 0]
Day 2 [3, 1, 0, 1, 3, 2, 1, 0]
Day 3 [3, 0, 0, 0, 3, 2, 0, 0]
Day 4 [1, 0, 0, 0, 1, 1, 0, 0]
Day 5 [0, 0, 0, 0, 0, 0, 0, 0]
---- EXTINCT ----

Write the program in a way that it will handle any number of people in cities,
above was just an example numbers to follow.

Hint:
Below expression will print array in this format:
[3, 6, 0, 4, 3, 2, 7, 0]
Code:
System.out.println(Arrays.toString(inhabitants)));
 */

public class repl_170_Arrays_Zombie_Attack_2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] inhabitants = new int[8];
		for (int i = 0; i < inhabitants.length; i++) {
			inhabitants[i] = input.nextInt();
		}
		// TODO. Write you code below this line.
		// 3 6 0 4 3 2 7 0
		int[] inhabitantsTemp = new int[8];
		System.arraycopy(inhabitants, 0, inhabitantsTemp, 0, 8);
		for (int i = 0; i < Integer.MAX_VALUE; i++) {
			boolean flag = false;
			if (i == 0) {
				System.out.println("Day " + i + " " + Arrays.toString(inhabitants));
			} else {
				for (int city = 0; city < inhabitantsTemp.length; city++) {
					if (city == 0) {
						if (inhabitantsTemp[city + 1] < 1) {
							inhabitants[city] = inhabitants[city] / 2;
						}
					} else if (city == inhabitantsTemp.length - 1) {
						if (inhabitantsTemp[city - 1] < 1) {
							inhabitants[city] = inhabitants[city] / 2;
						}
					} else {
						if (inhabitantsTemp[city + 1] < 1) {
							inhabitants[city] = inhabitants[city] / 2;
						} else if (inhabitantsTemp[city - 1] < 1) {
							inhabitants[city] = inhabitants[city] / 2;
						}
					}
				}
				System.out.println("Day " + i + " " + Arrays.toString(inhabitants));
			}

			for (int j = 0; j < inhabitants.length; j++) {
				if (inhabitants[j] != 0) {
					flag = false;
					break;
				} else {
					flag = true;
				}
			}
			if (flag) {
				System.out.println("---- EXTINCT ----");
				break;
			}
			System.arraycopy(inhabitants, 0, inhabitantsTemp, 0, 8);
		}
		input.close();
	}
}
