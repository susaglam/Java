package assignments.repl_it;

import java.util.Scanner;

public class repl_089_Print_first_and_last_letters {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String word = scan.next();
		// word = "adobe";
		System.out.println(word.substring(0, 1) + word.substring(word.length() - 1));// ae
		scan.close();
	}
}
