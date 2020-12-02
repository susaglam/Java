package Examples.Constructor;

public class carpetTest {
    public static void main(String[] args) {
        //Calculator(Floor floor, Carpet carpet)
Calculator c1 = new Calculator(
                new Floor(1.40, 2.00),
                new Carpet(25));
        double Price = c1.getTotalCost();
        System.out.println(Price); //70
    }
}