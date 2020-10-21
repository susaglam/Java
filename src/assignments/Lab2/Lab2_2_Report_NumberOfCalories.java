package assignments.Lab2;
import java.util.Scanner;

/*
Question-2

A bag of cookies holds 40 cookies.
The calorie information on the bag claims
that there are 10 serving in the bag and
that a serving equals 300 calories.
Write a program that lets the user enter
the number of cookies he or she actually ate
and then reports the number of total calories consumed.
*/
public class Lab2_2_Report_NumberOfCalories {
    public static void main (String[] args) {

        // final int oneBagOfCookies =40;
        // final int totalServing = 10;
        // final int oneServing = 40/10;
        // final int oneServingCalories = 300 ;

        // Find One Cookies Calories
        // (oneServingCalories = 300) /(oneBagOfCookies = 40/ totalServing = 10)

        final int oneCookiesCalories = 300 / (40 / 10); // 75 calories
        int eatenTotalCookies, eatenTotalCalories;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your eat cookies: ");
        eatenTotalCookies = scan.nextInt();

        eatenTotalCalories = eatenTotalCookies * oneCookiesCalories;
        System.out.print("Eaten total calories  : " + eatenTotalCalories);
        scan.close();
    }
}
