package assignments.repl_it;

import java.util.Scanner;

public class repl_076_email1 {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        String email = scan.next();
        String[] mail = email.split("@");
        String fname= mail[0].split("_")[0];
        String lname= mail[0].split("_")[1];
        System.out.println("First Name: " + fname.substring(0, 1).toUpperCase() +fname.substring(1));
        System.out.println("Last name: " + lname.substring(0, 1).toUpperCase() +lname.substring(1));
        System.out.println("Domain: " + mail[1].split("\\.")[0]);
        System.out.println("Top-Level Domain: " + mail[1].split("\\.")[1]);
    }
}
