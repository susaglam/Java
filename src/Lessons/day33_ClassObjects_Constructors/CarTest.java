package Lessons.day33_ClassObjects_Constructors;

public class CarTest {

	public static void main(String[] args) {

		Car c1 = new Car(); // it is calling the constructor
							// which constrcutor u want me do execute?
							// i want to you execute, constructor which does not have any arguments
		c1.color = "White";
		Car c2 = new Car("AMG", "Mercedes", 2007, 65000, "White");
		Car c3 = new Car("Corolla", "Toyota", 2015, 32000, "Yellow");
		Car c4 = new Car("Altima", "Nisssan", 2014, 41000, "Black");
		
		c2.color = "Red";
		c3.color = "Blue";
		c4.color = "White";
		
	}

}
