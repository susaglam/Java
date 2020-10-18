package assignments.repl_it;
import java.util.Scanner;

public class verify_contains {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    String word = scan.nextLine();
	    String sentence = scan.nextLine();
	    //WRITE YOUR CODE HERE
	    boolean result;
	    if(sentence.contains(word))
	    {
	    	result=true;
	    }
	    else {
	    	result=false;
	    }
	    System.out.println(result);
	    scan.close();
	}
}
