package Assignment3_Arithmetic_Operators;

public class Question5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Question-5
		 * 
		 * Write a program that outputs the number of hours, minutes, and seconds that
		 * corresponds to input total seconds.
		 * 
		 * -Declare int variables inputSeconds, hours, minutes, seconds -Initialize the
		 * inputSeconds
		 * 
		 * -Using %(remainder) and / operators, find out how many whole hours, minutes
		 * and seconds are in inputSeconds. -Assign values to the hours, minutes,
		 * seconds variables -Display the result
		 * 
		 * Sample Output:
		 * 
		 * inputSecond is 3695
		 * 
		 * 1 hours, 1 minutes, and 35 seconds
		 */

		int hour, minute, second, inputSecond;
		inputSecond = 3695;

		minute =(inputSecond/60)%60;
		hour = inputSecond/3600;

		second = inputSecond%60 ;

		System.out.println(hour + " hour,  " + minute + " minutes , and " + second + " seconds");

	}
}
