
package classes;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		  // DO NOT CHANGE
				int propertyPrice = 0;
				int numberOfBedrooms, garageSpots;
				float metroAccessibility, schoolScore, highwayAccessibility;
				boolean backyard, smoking, garage;
				String houseType;
				Scanner scan = new Scanner(System.in);
				System.out.println("*****************************************");
				System.out.println("* Welcome to the RealEstate calculator! *");
				System.out.println("*****************************************");
				// WRITE YOUR CODE HERE

			

				System.out.println("Enter your property type:");

				houseType = scan.nextLine();
				// Home types : Condo, Townhouse ,Single Family Home
				// Condo = 50000;
				// Townhouse = 75000;
				// Single Family Home = 95000;
				
				System.out.println("How many bedrooms do you have?");

				switch (houseType) {
				case "Condo":
					propertyPrice = 50000;
					break;
				case "Townhouse":
					propertyPrice = 75000;
					break;
				case "Single Family Home":
					propertyPrice = 95000;
					break;
				}
				 System.out.println("house type: " + houseType + " price" +propertyPrice + "$");
				numberOfBedrooms = scan.nextInt();
				// add to the price of your property 30000 for every bedroom.
				if (numberOfBedrooms>0)
				{propertyPrice += numberOfBedrooms * 30000;
				  System.out.println("bedroom: " + propertyPrice + "$");
				}

				System.out.println("Do you have a backyard?");
				backyard = scan.nextBoolean();

				if (backyard) {
					if (houseType.equals("Condo")) {
						// Backyard shouldn't be available for Condo, so display message
						System.out.println("Backyard is not available for condo!");
					} else {
						// backyard. Add 5000 to the property price
						propertyPrice += 5000;
						System.out.println("bakyard: " + propertyPrice + "$");
					}
				}

				System.out.println("Do you have garage?");
				garage = scan.nextBoolean();

				if (garage) {
					System.out.println("How many spots?");
					garageSpots = scan.nextInt();

					if (garageSpots > 10) {
						// If amount of garage spots exceeds 10 spots (grater then 10), display message:
						System.out.println("Pardon,  it's not a public parking!");
					} else {
						propertyPrice += garageSpots * 20000;
						System.out.println("garage: " + propertyPrice + "$");
					}
				}

				System.out.println("How close is metro station?");
				metroAccessibility = scan.nextFloat();

				// If metro is closer than 1 mile (inclusive), add to the property price 10000.
				// If metro is in the radius from 1 mile to 3 miles, add to the property price 5000.

				if (metroAccessibility <= 1) {
					propertyPrice += 10000;
					System.out.println("metro 1 " + propertyPrice + "$");
				}

				else if (metroAccessibility > 1 && metroAccessibility < 3) {
					propertyPrice += 5000;
					System.out.println("metro 1-3 " + propertyPrice + "$");
				}

				System.out.println("How close is highway?");
				highwayAccessibility = scan.nextFloat();

				if (highwayAccessibility <= 1) {
					// If highway is closer than 1 mile (inclusive), add to the property price
					// 15000.
					propertyPrice += 15000;
					System.out.println("higway 1: " + propertyPrice + "$");
				} else if (highwayAccessibility > 1 && highwayAccessibility < 5) {
					// If highway is in the radius from 1 to 5 miles, add to the property price
					// 8000.
					propertyPrice += 8000;
					System.out.println("hogway 1-5: " + propertyPrice + "$");
				} else if (highwayAccessibility >= 5 && highwayAccessibility <= 20) {
					// if highway is in the radius from 5 mile to 20 miles (inclusive), add to the
					// property price 4000.
					propertyPrice += 4000;
					System.out.println("higway other: " + propertyPrice + "$");
				}

				System.out.println("What's the rating of nearest school?");
				schoolScore = scan.nextFloat();

				if (schoolScore > 8 && schoolScore <= 10) {
					// If school's rating is in the range from 10 (inclusive) to 8 points, add to
					// the property price 45000.
					propertyPrice += 45000;
					System.out.println("school 8-10: " + propertyPrice + "$");
				} else if (schoolScore >= 4 && schoolScore < 8) {
					// If school's rating is less than 8 points and more or equals to 4 points, add
					// to the property price 20000.
					propertyPrice += 20000;
					System.out.println("school 4-8: " + propertyPrice + "$");
				} else {
					// Otherwise, add 5000 to the property price.
					propertyPrice += 5000;
					System.out.println("school diger: " + propertyPrice + "$");
				}

				System.out.println("Does any of your family members smoking?");
				smoking = scan.nextBoolean();
				if (smoking) {
					// If so, reduce property price for 5000.
					propertyPrice -= 5000;
					System.out.println("smoke: " + propertyPrice + "$");
				}

				System.out.println("Market report has been generated.");
				System.out.println("Your estimate market price is: " + propertyPrice + "$");
	}
}
