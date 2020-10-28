**Week 6 Note** 
---
* Week 6 : 
	Class and Object
	
	    Class is a blueprint| template for object 
	    Object is created based on the class
	     
	 `1. Object has attribute|properties :` 
	 
	 for example : 
	 	 Computer : price ,screenSize , brand     and ....... cpu , ram , screenSize , brand .......
	 
	 `2. Object has bahaviour :`
	  
	 	 Computer : open , shutdown , runCode , calculate , displayComputerInfo...... 
	
	 ```java
	 public class Computer {
	 	// attributes ...
	 	// instance field | variable 
	 	double price ; 
	 	int screenSize ; 
	 	String brand ; 
	 }
 ```
	 // how do we create 3 Computer objects
	String manipulation 
		equals
		equalsIgnoreCase
		toUpperCase
		toLowerCase
		contains 
		trim
		length 
		charAt 
		concat 
		isEmpty
		indexOf 
		replace 
		subString 
```
```java
package a_review.week6;
public class StringMethodsPractice {
	public static void main(String[] args) {
		/**
		 *
		 * 		length
		 * 		equals
				equalsIgnoreCase
				toUpperCase
				toLowerCase
				contains
				trim
				charAt
				concat
				isEmpty
				indexOf
				replace
				subString
		 *
		 */
		String message = "Java is Awesome!!" ;
		System.out.println("Initial value of message \n" + message);
//		int count = message.length() ;
//		System.out.println("how many characters we have " + count);
//		
//		System.out.println("how many characters we have " + message.length() );
		message = message.toUpperCase();
		System.out.println("after using uppercase method in above line \n"+message );
		String str = "abc " ;
		System.out.println("str has character count : " + str.length() );
		System.out.println("is <abc > equal <abc> " + str.equals("abc"));
		// what if i did not care about the leading or training space
		// save the trimmed result in new variable
		String str2 = str.trim(); //abc
		System.out.println("the result after trimming " + str2.equals("abc"));
		// compare str2 with ABC without caring about the case.
		System.out.println("check str2 is ABC caseInsensitive "
											+ str2.equalsIgnoreCase("ABC"));
		// contain : partial check
		//
		System.out.println("Does str1 contains letter a " + str.contains("a"));
	}
}
```