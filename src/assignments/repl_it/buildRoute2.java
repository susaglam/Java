package assignments.repl_it;
import java.util.Scanner;
public class buildRoute2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String start = scan.next();
		String end = scan.next();
		boolean found = false;
		boolean go = false;
		
		String[] route = {"A", "B", "C", "D"};

		if (start == end) {
			System.out.println(end + " found");
		} else {
			for (int i = 0; i < route.length; i++) {
				if (route[i].equals(end) && found == true) {
					System.out.println(": " + end + " found");
					break;
				} else if (route[i].equals(start) || go == true) {
					switch (route[i]) {
						case "A" :
							System.out.print("right");
							break;
						case "B" :
							System.out.print("down");
							break;
						case "C" :
							System.out.print("left");
							break;
						case "D" :
							System.out.print("up");
							break;
						default :
							break;
					}
					go = true;
					if (i == route.length - 1) {
						if (!found) {
							i = -1;
						}
					}
					if (end.equals(route[i + 1])) {
						found = true;
					} else {
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
