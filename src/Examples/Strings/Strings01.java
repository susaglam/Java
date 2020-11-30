package Examples.Strings;

public class Strings01 {
    public static void main (String[] args) {

        //1.charAt()
        String s1 = "StudyHardStayHumble";

        System.out.println(s1.charAt(0));//S
        //Prints the 7th character on the screen
        System.out.println(s1.charAt(6));//h
        //Prints the last character on the screen
        System.out.println(s1.charAt(s1.length() - 1));
        //Prints the middle character on the screen
        if (s1.length() % 2 != 0) {
            System.out.println(s1.charAt((s1.length() - 1) / 2));
        } else {
            System.out.println("No middle character");
        }
        // When you use an index that is not included in the charAt() method,
        // you will get a red error message on the screen after running the program.
        //System.out.println(s1.charAt(38));

		/*
		 There are basically two types of errors in Java;
        1) Compile Time Error: Red underscores received while writing code
        2) Run Time Error: After the code is run, red messages appear on the console
        Subsequent codes are not executed when a Run Time Error occurs.
        Java stops executing code (eXecution).
        */

        //2.concat()
        String s2 = "You learn while teaching.";
        // String methods make temporary changes. The original string does not change.
        //Strings are immutable

        System.out.println(s2.concat(" OK?"));//You learn while teaching. OK?
        System.out.println(s2);//You learn while teaching.

        //3.contains()
        String s3 = "Learn java get rich";
        // contains() method returns boolean (true / false)
        System.out.println(s3.contains("L"));//true
        System.out.println(s3.contains("x"));//false
        System.out.println(s3.contains("java"));//true
        System.out.println(s3.contains("Z"));//false
        System.out.println(s3.contains(""));//true
        System.out.println(s3.contains(" "));//true

        //4.endsWith() ==> Works with string, does not accept char

        String s11 = "I have to work hard.";

        System.out.println(s11.endsWith("."));//true
        System.out.println(s11.endsWith("hard."));//true
        System.out.println(s11.endsWith(""));//true
        System.out.println(s11.endsWith("work hard."));//true
        System.out.println(s11.endsWith("I have to work hard."));//true

        //5.equals()
        System.out.println("Omer".equals("Omer"));//true
        System.out.println("Nisa".equals("NISA"));//false
        System.out.println("Faruk" == "Faruk");//true

        //6.equalsIgnoreCase()
        System.out.println("OMER".equalsIgnoreCase("omer"));//true

        //7.indexOf() method returns the index of the first appearance of the char in the String,
        // whose index is asked.

        //indexOf() Both char and String can be used in method.
        //indexOf() If the method asks for the index of more than one character,
        // the index of the first character is returned.
        System.out.println(s11.indexOf('a'));//3
        System.out.println(s11.indexOf('I'));//0
        System.out.println(s11.indexOf('v'));//4
        System.out.println(s11.indexOf("e "));//5
        //indexOf() returns -1 for chars with no method
        System.out.println(s11.indexOf('x'));//-1
        System.out.println(s11.indexOf(""));//0

        //8.indexOf()
        String s12 = "easy to learn, easy to forget";
        System.out.println(s12.indexOf('a', 6));//10
        System.out.println(s12.indexOf('r', 8));//11
        System.out.println(s12.indexOf("for", 5));//23
        System.out.println(s12.indexOf("to", 5));//5

        //9.isEmpty() If you get true from method,
        // it means that there is no character in the String. so String's length is 0

        String s13 = "practice makes perfect";

        System.out.println(s13.isEmpty()); //false
        System.out.println("".isEmpty());//true

        //10.lastIndexOf() Index returns the last index of the requested character.
        System.out.println(s13.lastIndexOf('e'));//19
        System.out.println(s13.lastIndexOf("per"));//15
        System.out.println(s13.lastIndexOf('r', 16));//1
        System.out.println(s13.lastIndexOf("k", 14));//11

        //11.length() method returns the number of characters in a string.
        System.out.println(s13.length());//22

        //12.replace()
        System.out.println(s13.replace('e', 'E'));//practicE makEs pErfEct
        System.out.println(s13.replace('c', 'C'));//praCtiCe makes perfeCt
        System.out.println(s13.replace("mak", "tak"));//practice takes perfect
        System.out.println(s13.replace("a", ""));//prctice mkes perfect
        System.out.println(s13.replace(" ", ""));//practicemakesperfect
        System.out.println(s13.replace("", "|"));//|p|r|a|c|t|i|c|e| |m|a|k|e|s| |p|e|r|f|e|c|t|

        //13.replaceAll()
		/*
			 Regular Expression(regex): It allows us to select the characters in a certain type.
			 1) \\d ==> All figures
			    \\D ==> All non-digit characters

			 2) \\w ==> A->Z    a->z   0->9   _
			    \\W ==> A->Z    a->z   0->9   _  everything except

			 3) \\s ==> space
			    \\S ==> space expect
		 */
        String s4 = "Learning1 by2 writing3 code__";

        System.out.println(s4.replaceAll("\\d", "*"));//Learning* by* writing* code__
        System.out.println(s4.replaceAll("\\D", "*"));//********1***2********3*******

        System.out.println(s4.replaceAll("\\w", "*"));//********* *** ******** ******
        System.out.println(s4.replaceAll("\\W", "*"));//Learning1*by2*writing3*code__

        System.out.println(s4.replaceAll("\\s", "*"));//Learning1*by2*writing3*code__
        System.out.println(s4.replaceAll("\\S", "*"));//********* *** ******** ******

        //14.
        System.out.println(s4.startsWith("L"));//true
        System.out.println(s4.startsWith("c"));//false
        System.out.println(s4.startsWith("Learn"));//true
        //s4 Is the 4.character (index 3) of the string "e"?
        System.out.println(s4.startsWith("r", 3));//true


        //15.substring()
        String s01 = "Java is popular because it is an OOP language.";

        System.out.println(s01.substring(3));// a is popular because it is an OOP language.
        System.out.println(s01.substring(5));//is popular because it is an OOP language.
        System.out.println(s01.substring(0));//Java is popular because it is an OOP language.

        //Print the last letter on the screen
        System.out.println(s01.substring(s1.length() - 1));//cause it is an OOP language.
        //substring(9, 17) In the statement, index 9 is included, index 17 is excluded.
        System.out.println(s01.substring(9, 17));//opular b
        //substring(0, 1) Returns the first letter in a string, like charAt(0)
        //substring(0, 1) String returns, charAt(0) returns char.
        System.out.println(s01.substring(0, 1));//J
        System.out.println(s01.substring(5, 5));// If the indexes are equal, you get nothing
        //The starting index in the substring () method cannot be greater than the end index.
        // If it is bigger, you will get a Run Time Error.
        //s1.substring(5, 1);

        //16.trim()
        String s02 = "     Java learners learn other languages quickly         ";
        //trim() method erases spaces at the beginning and end of a string.
        //It does not delete the spaces inside the string.
        System.out.println("Before using trim: " + s02);
        //Before using trim:      Java learners learn other languages quickly
        System.out.println("After using Trim: " + s02.trim());
        //After using Trim: Java learners learn other languages quickly
    }
}
