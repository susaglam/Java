package classes;

public class increment_Decrement_Shorthand_Compound_assignment_Operators {

	public static void main(String[] args) {
		
		/*
		 * Operator  Name 			Description 							Example 
		 * 	 + 		Addition 		Adds together two values				x + y 
		 *   - 		Subtraction 	Subtracts one value from another 		x - y 
		 * 	 *		Multiplication	Multiplies two values 					x * y 
		 * 	 / 		Division 		Divides one value by another 			x / y 
		 * 	 %		Modulus 		Returns the division remainder 			x % y 
		 * 	++ 		Increment 		Increases the value of a variable by 1 	 ++x 
		 * 	-- 		Decrement 		Decreases the value of a variable by 1	 --x
		 */
		
		/*
		 * 1)Increment: Increase the value of a variable
		 */
		
		int number = 0;
		System.out.println(number);
		System.out.println(++number);
		System.out.println(number++);
		System.out.println(++number);
		System.out.println(number++);
		System.out.println(number);
		System.out.println(--number);
		++number;
		System.out.println(number--);
		System.out.println(number);

		int egg = 3;
		int basket = ++egg * 3 + egg++ + egg / 5;
		// (4*3)+4+(5/5)=17

		System.out.println(basket);// 17

		
		int num01 = 12;
		System.out.println("Before increment: " + num01); // Before increment: 12

		// 1. Way to increase the value of a variable
		num01 = num01 + 5;
		System.out.println("After increment: " + num01); // After increment: 17

		// Create an int variable and increase its value by 3, then by 4, then by 5
		int num02 = 10;
		num02 = num02 + 3;
		System.out.println(num02);// 13
		num02 = num02 + 4;
		System.out.println(num02);// 17
		num02 = num02 + 5;
		System.out.println(num02);// 22

		// 2. Way to increase the value of a variable
		// Create an int variable and increase its value by 3, then by 4, then by 5
		// by using 2. way
		int num03 = 300;
		num03 += 3;// 303
		num03 += 4;// 307
		num03 += 5;
		System.out.println(num03);// 312

		// 3. Way to increase the value of a variable by 1
		int num04 = 12;
		num04++;
		System.out.println(num04); // 13

		// Create an int variable and increase its value by multiplication
		int num05 = 6;
		num05 = num05 * 2;
		System.out.println(num05);// 12

		// Do not put any space betwen operation and equal signs
		num05 *= 3;
		System.out.println(num05);// 36

		/*
		 * 1)Decrement: Decrease the value of a variable
		 */
		// Create a variable and decrease it by 5, 3, and 1 by using 3 different ways
		int e = 35;

		e = e - 5;
		System.out.println(e);// 30

		e -= 3;
		System.out.println(e);// 27

		e--;
		System.out.println(e);// 26

		// Create a variable and decrease it by 2, and 3 by using division operation
		int i = 60;
		i = i / 2;

		System.out.println(i);// 30
		i /= 3;
		System.out.println(i);// 10

		// Post and Pre Increment / Post and Pre Decrement
		int x = 12;
		System.out.println(x++);// Post increment
		System.out.println(x);// 13
		System.out.println(++x);// Pre increment

		// What do you see on the console?
		int y = 15;
		System.out.println(++y);// 16
		System.out.println(y++);// 16
		System.out.println(y);// 17

		// What do you see on the console?
		int z = 21;
		System.out.println(--z);// 20
		System.out.println(z--);// 20
		System.out.println(--z);// 18
		
		
		//
		boolean val1=true;
		boolean val2=(val1=false);
		
		System.out.println(val1);
		System.out.println(val2);

	}

}
