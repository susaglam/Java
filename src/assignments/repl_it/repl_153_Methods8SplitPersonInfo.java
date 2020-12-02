package assignments.repl_it;

import java.util.Scanner;

public class repl_153_Methods8SplitPersonInfo {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		String s = inp.next();
		person(s);
		inp.close();
	}

	private static void person(String s) {
		String[] v = s.split(",");
		System.out.println("person name: " + v[0] + " last name: " + v[1] + " age: " + v[2]);
	}
}
