package assignments.Assignment_4;

public class Question_2_Tax_Calculate {
    public static void main (String[] args) {
        System.out.println(taxCalculator(1_500));//375
        System.out.println(taxCalculator(1_200_000));//300_000
        System.out.println(taxCalculator(200_000_000));//50_000_000
    }

    public static double taxCalculator (double income) {
        double bill = 0.0;
        System.out.println("Your Income : " + income);
        if (income <= 150_000_000) {
            bill = income * 0.25;
        } else if (income <= 300_000_000) {
            bill = income * 0.30 + 50.0;
        } else if (income <= 600_000_000) {
            bill = income * 0.35 + 50.0;
        } else if (income <= 1_200_000_000) {
            bill = income * 0.40 + 50.0;
        } else if (income > 1_200_000_000) {
            bill = income * 0.50 + 50.0;
        }
        return bill;
    }
}
