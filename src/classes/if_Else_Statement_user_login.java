package classes;

import java.util.Scanner;

public class if_Else_Statement_user_login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String adminuser="admin";
		String adminpass="1234";
		
		System.out.println("+--------------------+");
		System.out.println("| Welcome Login Page |");
		System.out.println("+--------------------+");

		System.out.print("Enter Username : ");
		String username= input.next();
		System.out.print("Enter Password : ");
		String pass=input.next();
		
		
		if (username.equals(adminuser) && pass.equals(adminpass)) {
			
			System.out.println("+--------------------+");
			System.out.println("|   ACCESS GRANTED   |");
			System.out.println("+--------------------+");
			
			System.out.print("Welcome Admin Dashboard ");

			
		} else {
			
			System.out.println("+--------------------+");
			System.out.println("|   ACCESS DENIED    |");
			System.out.println("+--------------------+");
			
			System.out.print("Please check admin username or password. ");

		}
		
	}

}
