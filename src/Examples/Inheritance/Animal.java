package Examples.Inheritance;
public class Animal {
    // Animal() is class. public Animal() {} is constructor.
    public Animal() {
        System.out.println("Animal constructor without parameters");
    }

    public void move() {
        System.out.println("It moves.");
    }

    public void eat() {
        System.out.println("It eats.");
    }

    public void drink() {
        System.out.println("It drinks.");
    }
}
