package classes;

public class if_Else_Statements {

	public static void main(String[] args) {

		int list = 60;
		if (list >= 70) {
			System.out.println("Good Job");
			System.out.println("Keep working");

		} else {

			System.out.println("Somethings Wrong");
		}

		int sales, bonus;
		double commisionRate, salary;

		sales = 5000;
		salary = 10000;

		if (sales > 5000) {
			bonus = 500;
			commisionRate = 1.12;

		} else {
			bonus = 100;
			commisionRate = 1.10;
		}

		salary = salary * commisionRate + bonus;

		System.out.println("Salary = " + salary);
	}

}
