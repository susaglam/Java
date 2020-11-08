package assignments.Assignment_8;

import java.util.Scanner;

public class Question_11 {
    public static void main (String[] args) {
        /*
        Question-11

        c_profits gets the buyPrice(int) and sellPrice(int) and determines if there was a profit or loss.
        it returns a string value that can be "profit","loss","no loss"

        for example:
        c_profis(100,1500)
        returns : "profit"

        c_profis(20,5)
        returns : "loss"

        c_profis(100,100)
        returns : "no loss"
         */

        Scanner scan = new Scanner(System.in);
        int buyPrice = scan.nextInt();
        int sellPrice = scan.nextInt();
        System.out.println(c_profis(buyPrice, sellPrice));
        scan.close();
    }

    public static String c_profis (int buyPrice, int sellPrice) {
        if (buyPrice < sellPrice) {
            return "profit";
        } else if (sellPrice < buyPrice) {
            return "loss";
        } else if (buyPrice == sellPrice) {
            return "no loss";
        }
        return "";
    }
}
