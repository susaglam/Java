package classes;

import java.util.Scanner;

public class Switch_Statement_login_account {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String item = scan.nextLine();

		// WRITE YOUR CODE HERE
		String product;
		double productPrice;
		int giftCard = 100;

		int remainingCash;

		if (item.equals("Smartphone")) {
			System.out.println("Sorry, not enough funds on your gift card!");
		} else if (item.equals("Laptop")) {
			System.out.println("Sorry, not enough funds on your gift card!");
		} else if (item.equals("Charger")) {
			System.out.println("Thank you for your purchase!");
			remainingCash = giftCard - 15;
			System.out.println("Your current balance is: " + remainingCash + "$");
		} else if (item.equals("USB cable")) {
			System.out.println("Thank you for your purchase!");
			remainingCash = giftCard - 10;
			System.out.println("Your current balance is: " + remainingCash + "$");
		} else if (item.equals("Headphones")) {
			System.out.println("Thank you for your purchase!");
			remainingCash = giftCard - 30;
			System.out.println("Your current balance is: " + remainingCash + "$");
		} else if (item.equals("Pants")) {
			System.out.println("Thank you for your purchase!");
			remainingCash = giftCard - 50;
			System.out.println("Your current balance is: " + remainingCash + "$");
		} else if (item.equals("Hat")) {
			System.out.println("Thank you for your purchase!");
			remainingCash = giftCard - 25;
			System.out.println("Your current balance is: " + remainingCash + "$");
		} else if (item.equals("Socks")) {
			System.out.println("Thank you for your purchase!");
			remainingCash = giftCard - 5;
			System.out.println("Your current balance is: " + remainingCash + "$");
		} else if (item.equals("Blanket")) {
			System.out.println("Thank you for your purchase!");
			remainingCash = giftCard - 60;
			System.out.println("Your current balance is: " + remainingCash + "$");
		} else if (item.equals("Pillow")) {
			System.out.println("Thank you for your purchase!");
			remainingCash = giftCard - 40;
			System.out.println("Your current balance is: " + remainingCash + "$");
		} else {
			System.out.println("invalid item!");
		}

	}
}
