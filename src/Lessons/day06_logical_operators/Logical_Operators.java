package Lessons.day06_logical_operators;

public class Logical_Operators {
	public static void main(String[] args) {

		/*
		 * Logical Operators:
		 * 
		 * 1) && ---> And Operator: 
		 * 
		 * true && false = false 
		 * false && true = false 
		 * false && false = false 
		 * true && true = true
		 * 
		 * 
		 * 2) || ---> Or Operator:
		 * 
		 *  true || true = true 
		 *  true || false = true 
		 *  false || true = true 
		 *  false || false = false
		 *  
		 *  ^ Logical XOR operator // Not popular
		 *	true=true ==> false
		 * 	false=true ==> true
		 * 	true=false ==> true
		 * 	false=false ==> false
		 * 
		 * 3) ! ---> Not Operator:
		 * 
		 *  !true = false 
		 *  !false = true 
		 *  !!true = true
		 * 
		 * Detail Information: Normally And Operator is &, but if you type && your code
		 * will run faster For "false && true = false" and "false && false = false" no
		 * need to check the second condition. If you use &&, Java will not check the
		 * second condition. But if you use &, Java checks both sides for all.
		 */

		boolean bool;

		bool = 9 > 7 && 8 < 9;

		System.out.println(bool);

//		bool = 15 > 7 || 3 > 1;
//		System.out.println(bool);
		
		char c1 = 'A';
		char c2 = 65;
		int i1 = 5;
		int i2 = 10;
		
		boolean res1=(i1==i2)&(c1==c2);  // F & T = F
		boolean res2=(i1==i2)&&(c1==c2); // F && ---- = F
		
		System.out.println("res1 = " + res1);
		System.out.println("res2 = " + res2);
		
		boolean res3 = (c1==c2)|(i1==i2); // T | F = T
		boolean res4 = (c1==c2)||(i1==i2); // T || ------ = T
		
		System.out.println("res3 = " + res3);
		System.out.println("res4 = " + res4);
		
		
		// ^ Logical XOR operator
		// true=true ==> true
		// false=true ==> true
		// true=false ==> true
		// false=false ==> false
		
		boolean res5 = (c1==c2)^(i1==i2); // T ^ F = T
		boolean res6 = (c1==c2)^(i1!=i2); // T ^ T = f
		
		System.out.println("res5 = " + res5);
		System.out.println("res6 = " + res6);

	}
}
