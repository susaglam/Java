package classes;

import java.util.Scanner;

public class if_Else_Statement_Nested_user_login_check_user_and_password {

	public static void main(String[] args) {
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

				System.out.println("Welcome Admin Dashboard ");

				System.out.println("+--------------------+");
				System.out.println("|   ACCESS GRANTED   |");
				System.out.println("+--------------------+");

			} else {
				System.out.println("+--------------------+");
				System.out.println("|   ACCESS DENIED    |");
				System.out.println("+--------------------+");
				System.out.println("Admin Password is wrong ");
				System.out.println("Please check admin password. ");

			}
		}

		/*
		 * else {
		 * 
		 * if (pass.equals(adminpass)) {
		 * 
		 * System.out.println("+--------------------+");
		 * System.out.println("|   ACCESS DENIED    |");
		 * System.out.println("+--------------------+");
		 * System.out.println("Admin Username is wrong ");
		 * System.out.println("Please check admin username. ");
		 * 
		 * } else { System.out.println("+--------------------+");
		 * System.out.println("|   ACCESS DENIED    |");
		 * System.out.println("+--------------------+");
		 * System.out.println("Admin Username and Password is wrong ");
		 * System.out.println("Please check your user credentials. ");
		 * 
		 * }
		 */
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
