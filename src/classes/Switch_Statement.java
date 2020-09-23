package classes;

import java.io.IOException;
import java.util.Scanner;

public class Switch_Statement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner swt = new Scanner(System.in);
		Scanner input = new Scanner(System.in);
		String adminuser = "admin";
		String adminpass = "1234";

		System.out.println("+--------------------+");
		System.out.println("| Welcome Login Page |");
		System.out.println("+--------------------+");

		System.out.print("Enter Username : ");
		String username = input.next();
		System.out.print("Enter Password : ");
		String pass = input.next();

		if (username.equals(adminuser)) {

			if (pass.equals(adminpass)) {
				System.out.print("\033[H\033[2J");
				System.out.flush();
				System.out.println("Welcome Admin Dashboard ");

				System.out.println("+--------------------+");
				System.out.println("|   ACCESS GRANTED   |");
				System.out.println("+--------------------+");

				System.out.println("+--------------------+");
				System.out.println("| Welcome Dashboard  |");
				System.out.println("| ----Select Menu--- |");
				System.out.println("| 1- Summary         |");
				System.out.println("| 2- Money Transfer  |");
				System.out.println("| 3- Account...      |");
				System.out.println("+--------------------+");
				System.out.print("Select Menu : ");
				int selectMenu = swt.nextInt();

				switch (selectMenu) {
				case 1:
					System.out.println("Selected Menu: " + selectMenu);
					System.out.println("+--------------------+");
					System.out.println("| Account Summary    |");
					System.out.println("| ----Select Menu--- |");
					System.out.println("| 1- .......         |");
					System.out.println("| 2- ..............  |");
					System.out.println("| 3- .............   |");
					System.out.println("+--------------------+");
					break;
				case 2:
					System.out.println("Selected Menu: " + selectMenu);
					System.out.println("+--------------------+");
					System.out.println("| Money Transfer     |");
					System.out.println("| ----Select Menu--- |");
					System.out.println("| 1- .......         |");
					System.out.println("| 2- ..............  |");
					System.out.println("| 3- .............   |");
					System.out.println("+--------------------+");

					break;
				case 3:
					System.out.println("Selected Menu: " + selectMenu);
					System.out.println("+--------------------+");
					System.out.println("| Account .......    |");
					System.out.println("| ----Select Menu--- |");
					System.out.println("| 1- .......         |");
					System.out.println("| 2- ..............  |");
					System.out.println("| 3- .............   |");
					System.out.println("+--------------------+");

					break;

				default:
					break;
				}

				swt.close();

			} else {
				System.out.println("+--------------------+");
				System.out.println("|   ACCESS DENIED    |");
				System.out.println("+--------------------+");
				System.out.println("Admin Password is wrong ");
				System.out.println("Please check admin password. ");

			}
		}

		else if (pass.equals(adminpass)) {

			System.out.println("+--------------------+");
			System.out.println("|   ACCESS DENIED    |");
			System.out.println("+--------------------+");
			System.out.println("Admin Username is wrong ");
			System.out.println("Please check admin username. ");

		} else {
			System.out.println("+--------------------+");
			System.out.println("|   ACCESS DENIED    |");
			System.out.println("+--------------------+");
			System.out.println("Admin Username and Password is wrong ");
			System.out.println("Please check your user credentials. ");

		}

		input.close();
	}
}
