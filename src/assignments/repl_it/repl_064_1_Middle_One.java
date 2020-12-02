package assignments.repl_it;

import java.util.Scanner;
/*
Instructions from your teacher:
You have a word, do the following:

1. When word has odd number of characters and:
      - 3 or more characters, print middle letter
      oak ==> a
      javav ==> v
    - Single character, print that character 3 times
      # ==> ###
      q ==> qqq
2. When word has even number of characters and:
     - 4 or more characters, print middle 2
     java ==> av
     apples ==> pl
     #$%^&* ==> %^
      - 2 characters, print those 2 characters twice
      @@ ==>@@@@
      $$ ==>$$$$
      hi ==> hihi
 */

public class repl_064_1_Middle_One {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String word = scan.next();
		if (word.length() == 1)
			System.out.println(word + word + word);
		else if (word.length() == 2)
			System.out.println(word + word);
		else if (word.length() % 2 == 0)
			System.out.println(word.charAt(word.length() / 2 - 1) + "" + word.charAt(word.length() / 2));
		else
			System.out.println(word.charAt(word.length() / 2));

		scan.close();
	}
}
