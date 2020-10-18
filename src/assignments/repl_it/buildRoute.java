package assignments.repl_it;

import java.util.Scanner;

public class buildRoute {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String startInput = scan.next();
		String endInput = scan.next();
		boolean found = false;
		char start = startInput.charAt(0);
		char end = endInput.charAt(0);

		if (start == end) {
			System.out.println(endInput + " found");
		} else {
			for (int checkPoint = start; checkPoint <= 'D'; checkPoint++) {
				if (checkPoint == end && found == false) {
					found = true;
					System.out.println(": " + end + " found");
					break;
				} else {
					if (checkPoint == 'D') {
						System.out.print("up");
						if (checkPoint != end) {
							for (int lapPoint = 'A'; lapPoint < start; lapPoint++) {
								if (end == lapPoint) {
									found = true;
									System.out.println(": " + end + " found");
									break;
								} else {
									System.out.print(" > ");
								}
								if (lapPoint == 'A')
									System.out.print("right");
								else if (lapPoint == 'B')
									System.out.print("down");
								else if (lapPoint == 'C')
									System.out.print("left");
							}
						}
					}
					if (checkPoint == 'C')
						System.out.print("left");
					else if (checkPoint == 'B')
						System.out.print("down");
					else if (checkPoint == 'A')
						System.out.print("right");
					if (end != (checkPoint + 1)) {
						if (found == true)
							break;
						System.out.print(" > ");
					}
				}
			}
		}
		scan.close();
	}
}