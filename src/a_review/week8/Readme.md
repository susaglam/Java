Week 8 - Nov 7 2020
Arrays 
================================
Summary

Arrays: a data strucutre that holds multipe values

- Syntax: 
	dataType [] varName = new dataType[size];

Example: 
	int [] nums = new int[3]; // 0, 0, 0

	-> In order to make an array you have to know the size

- Store elements 

	nameOfArray[index] = value

	nums[0] = 5;
	nums[1] = 10;
	nums[2] = -13;

- Read elements

	nameOfArray[index]  --> give us a value, based on the index

	nums[0]  --> 5
	nums[1]  --> 10
	nums[2]  --> -13

- Alterantaive way to make an array, which gives initial values

	dataType [] varName = {data1, data2, data3, etc..}

	int [] numbers = {1,2,3};

	String [] words = {"apple", "tree", "yard"}

-------------------------------------------------------------

Looping through arrays

- How many iterations do we need to go through the array
	-> length 
		- length not a method like it is for Strings 
				String: length()
				Array: length -> propertiy 

- dynamic storing and read elements in the loops

	Storing: 
		nums[i] = value

	Reading: 
		nums[i]  --> give each element 

- For each loop

	- This loop can only be used for collections
	- This loop is designed to go from the beginning of the colletion to the end	
		-> Will check each element 
	- This loop is READ only: you can use and evaulate the elements, but you can NEVER change them -> You can't alter the array in a for each loop

-- Syntax:

	for (dataTypeOfTheElements nameOfEachElement:  collectionName){


	}

	int [] num = {1,2,3};

	- Traditional Loop
		for(int i=0; i < num.length; i++) {
			System.out.println(num[i]);
		}

	- For each loop
		for(int each : num) {
			System.out.println(each);
		}

-------------------------------------------------------------

Arrays class
	-> in java.util package

	-> This class has some useful utility methods for arrays

Arrays.toString(arr) -> Print an array

Arrays.sort(arr) -> Sort the elements into ascending order 

Arrays.equals(arr1, arr2) -> Compare two arrays and check if they are the same

-------------------------------------------------------------

String method

	- toCharArray() -> Takes: nothing, Returns: char []

	Convert your String to a char array where all the characters are separate elements

	Ex: String s = "java";
		char [] chars = s.toCharArray() -> ['j', 'a', 'v', 'a']

	- split("") -> Takes: String, Return: String []

	Convert the String into parts based on the given argument and those parts are stored as different elements in a String array

	Ex: String str = "fox ran down the hill";
		str.split(" ") -> ["fox", "ran", "down", "the", "hill"]

		String str = "fox ran down, the hill";
		str.split(", ") -> ["fox ran down", "the hill"]

		String str = "fox ran down, the hill";
		str.split("down") -> ["fox ran ", ", the hill"]

-------------------------------------------------------------

Multi dimensional array 
	
	- An array which holds other arrays

-- Syntax for declaration
	
	datatType [][] varName = new datetype[size][]

	int [][] numbers = new int[4][5];
		> 2d array called numbers
		> can store 4 1D arrays and those 1D arrays have a size of 5

	new int[4][5]  vs  new int[4][]

	new int[4][] -> 2D array with 4 elements, but the array elements' size can be different 

-- Syntax for initializing:
	
	int [][] table = {
		{1,2,3},
		{4,5,6},
		{7,8,9}
	};

	int [][] table = { {1,2,3}, {4,5,6}, {7,8,9} };

- Print to multidimensional arrays:
	Arrays.deepToString(arr)

- For each use

	for (int [] eachArray : table ) {

		for(int eachNum : eachArray) {
			System.out.println(eachNum);
		}

	}

-------------------------------------------------------------

Random class

	- Allows us to get a random number

	- Steps to use the class
		1. Make object of Random class  -> import java.util.Random 
											import java.util.*
			Random number = new Random();
		2. User nextInt() method
			number.nextInt(bound)
				bound is limit that the number can be
				Ex: nextInt(10)
						Range -> 0 - 10, not including 10
					nextInt(10) + 1
						Range -> 1 - 10

-------------------------------------------------------------

- Create a method that will accept a number and returns an int array. The size of the array will be based on the given number. Fill each element with a random number (range: 1-100). Print the array


- Create a method that will accept an int array and return the average of the elements
	Ex: [10, 15, 5, 6] -> 9

- Create a method that will accept a String array and return a String which is the biggest word in the whole array. The words will all have different lengths 
	Ex: [ "Monday", "Apple", "Banana", "Strawberry", "Lion" ]	-> Strawberry


- Create a method that will accept an int array and return an int array of two elements. The two elements will be the min and max numbers from the array. 
	Ex: [31,4,1,-9, 300,3] -> [-9, 300]

- Create a method that will accept a number of how many coin flips you want to have. Return a String array with the result of the coin flips (Head - H or Tails - T). The coin flip will be random so use the Random class and some additional logic to get the result.
	Ex: 5 -> ["H", "T", "T", "T", "H"]
	Ex: 3 -> ["T", "T", "H"]
	Ex: 3 -> ["H", "T", "T"]


- Create a method that will accept an int array and print out the unique elements 
	Ex: [1,2,3,1,2,4] -> 3, 4

- Create a method that will accept a String and return the sentence with each word reversed 
	Ex: "I love learning java" -> I evol gninrael avaj


- Create a method that will accept a 2D int array. Find the biggest number from each inner array and put them into a separate int array that holds all the biggest values. Return that array with the biggest values from each inner array of the 2D array
	Ex: [ [ 3,12,3,34,12], [13,7,456,34,3], [-5, -24, -2, -10, -4]] -> [34, 456, -2]

	
- Create a method that will accept two Strings and determine if they are Anagrams of each other (return boolean)