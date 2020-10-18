package Lessons.day03_variables_dataTypes;

public class variables {
public static void main(String[] args) {
		
		/*
		 Variable is the name of reserved area in memory.
		 To create a variable you need to type 
		 
		 1)Data type 
		 2)Variable name 
		 3)Semi colon
		 
		 a)int stands for integer
		 b)After creating a variable if you put a value for it, we will tell
		   we "assigned a value" or we will tell "initialized the variable"
		*/
		int age = 23;
		
		//Create a variable whose name is weight and value is 83
		int weight = 83;
		
		//Create a String variable whose name will be first name and
		//the value will be your own first name
		String firstName = "Daulet";
		
		//Typing codes short is very important in coding area
		//	int height = 11;
		//	int length = 12;
		//	int money = 13;
		//	int salary = 14;
		
		//instead of typing like that do like the followings
		int height = 11, length = 12, money = 13, salary = 14;
		
		/*
		 Data Types: There are 2 main data types 
		 				1)Primitive Data Types
		                2)Non-Primitive Data Types
		                                         
		 Primitive Data Types: 
		 					   a)boolean: It is used for just "true" and "false" options
		                                  boolean retired = false; 
		                                  boolean data types use just 1 bit in memory
		                                  
		                       b)char:	It is used just/only for single characters ==> A, c, 1, !, ?
		                               When you use char as data type, you have to put 
		                               value between single quotes ==> ''
		                               char initial = 'A';
		                               char number = '3';
		                               char num = '2';
		                               DO NOT Forget space is a character in Java
		                               char num2 = ' ';
		                               char can be used single characters so if you do not
		                               put anything between the single quotes you will 
		                               get error
		                               char num3 = ''; ==> Do not do that one
		                               Every char variable uses 16 bits/2 bytes in memory
		                               
		                       c)byte: It is used for the integer values from 
		                               -128(inclusive) to 127(inclusive) 
		                               byte age = 72;
		                               byte length = 12;
		                               byte debt = -100;
		                               byte uses 8 bits from memory
		                               
		                       d)short:It is used for the integers from -32768 to 32767
		                               short population = 23000;
		                               short uses 16 bits from memory
		                               
		                       e)int: It is used from -2,147,483,648 to 2,147,483,647
		                              It uses 32 bits for every integer variable.
		                              
		                       f)long:It is used from -9,223,372,036,854,755,808 to 
		                              9,223,372,036,854,755,807
		                              It uses 64 bits from memory
		                              
		                       g)float:It is used for decimal numbers. It uses 32 bits.
		                               If you want to use float, you have to put 'f' or 'F'
		                               at the end of the number.
		                               float num = 3.2f; (or F)
		                               For floats in decimal part you can use 7 digits at most
		                               float num2 = 1.1234567f
		                               
		                       h)double:It is used for decimal numbers.It uses 64 bits.
		                               double salary = 2345.43; 
		                               In decimal part you can use 16 digits at most  
		                               
		 Non-Primitive Data Types: String is a non-primitive data type. It is used for words, sentence, 
		                           paragraphs, or single or multiple characters which are put 
		                           between double quotes.  
		                           String name = "Ali"; 
		                           String sentence = "Ali went to the school.";   
		                           String initial = "A";  
		                           String num = "12";  
		                           String str = " ";  ==> It is okay   
		                           String str2 = "";  ==> It is okay  
		                           
		What is the difference between "primitive" and "non-primitive" data types? 
		
		     1)Primitive data type names can be typed by using lower cases but
		       the initial of the non-primitive data types must be uppercase.
		     2)Primitive data types use different amount of memory but all non-primitive data types use
		       same amount of memory. 
		     3)Primitive data types are created by Java, we cannot create a new primitive data types.
		       We can create new non-primitive data types.
		     4)In primitive data types we have just values, but for non-primitive ones we have value and
		     methods inside the reserved area
		     5)Primitive data types are stored in "Stack" memory and Non-Primitive data types are stored in 
		     "Heap" memory.  
		     
		What is the difference between "Stack" and "Heap" memory?
		
		     1)Stack is small, Heap is Huge
		     2)Stack can store a)Primitive data types b)Address(Reference) of the non-primitive data types
		       Heap can store just non-primitive data types          
		*/
		
		System.out.println("Java is easy");
		System.out.println("Sukru SAGLAM");
		System.out.println("The Netherland");
		System.out.println("I am so tired");
		
		char ch = 'a';
		System.out.println(ch);//To print the value of a variable on the console, just put its name
		                       //inside the parenthesis
		
		String fullName = "Sukru SAGLAM";
		System.out.println(fullName);// Sukru SAGLAM

	}
}
