package classes;

import java.util.Scanner;

public class Switch_Statement_login_account {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner swt = new Scanner(System.in);
		
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
	}
}
