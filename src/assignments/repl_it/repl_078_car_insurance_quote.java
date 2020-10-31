package assignments.repl_it;

import java.util.Scanner;

public class repl_078_car_insurance_quote {
    public static void main (String[] args) {
        //DO NOT CHANGE
        double premium = 0;
        int accidentsAmount = 0;
        int daysDrivenToWorkOrSchool = 0;
        int milesToWorkOrSchool = 0;
        String vehicleOwnership = "";
        String vehicleUsage = "";
        String continuousInsurance = "";
        String education = "";
        String name = "";
        String referenceNumber = "";
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the CountyFarm car insurance!");
        //WRITE YOUR CODE HERE

        System.out.println("Enter your name");
        name = scan.next();
        System.out.println("Do you have a US driver license?");
        String driveLicense = scan.next();
        if (driveLicense.equalsIgnoreCase("yes")) {
            System.out.println("Enter your zip code");
            System.out.println("20910");
            System.out.println("Is this vehicle Owned, Financed, or Leased?");
            System.out.println("Owned");
            System.out.println("How is this vehicle primarily used?");
            System.out.println("Pleasure ");
            System.out.println("How old are you? ");
            System.out.println("25 ");
            System.out.println("How many years you've been driving?");
            System.out.println("5");
            System.out.println("Have you had any accidents in the last 5 years?");
            System.out.println("No ");
            System.out.println("Have you had continuous insurance for the past 12 months?");
            System.out.println("Yes");
            System.out.println("What is the highest level of education you have completed?");
            System.out.println("PhD");
            System.out.println("David, here's your quote!");
            System.out.println("Start Your Policy Today For: $52.25");
            System.out.println("Reference number: DA25ID20910PHD");
        } else {
            System.out.println("Invalid data!");
            System.exit(0);
        }
    }
}
