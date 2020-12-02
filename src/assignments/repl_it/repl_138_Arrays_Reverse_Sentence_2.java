package assignments.repl_it;

import java.util.Scanner;

public class repl_138_Arrays_Reverse_Sentence_2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String sentence = input.nextLine();

		String reversed = "";
		// TODO: start your code here
		for (int i = sentence.split(" ").length - 1; i >= 0; i--) {
			reversed += sentence.split(" ")[i] + (i == 0 ? "" : " ");
		}

		// End your code here. do not modify below statement
		System.out.println(reversed);
		input.close();
	}
}
