package assignments.repl_it;

public class repl_168_Methods_with_return_6_water_tax {
    public static void main(String[] args) {
        System.out.println(waterTax(50));
        System.out.println(waterTax(55));
        System.out.println(waterTax(101));
        System.out.println(waterTax(151));
    }

    public static double waterTax(double units) {
        double bill = 0.0;
        //your code here
        if (units <= 50) {
            bill = units * 0.60;
        } else if (units >= 150) {
            bill = units * 0.90 + 100.0;
        } else if (units >= 100) {
            bill = units * 0.90 + 50.0;
        } else {
            bill = units * 0.90;
        }
        //end your code here
        return bill;
    }//end waterTax
}
