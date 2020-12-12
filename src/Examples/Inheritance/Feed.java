package Examples.Inheritance;

//           Child         Parent
public class Feed extends Animal {

    public Feed() {
        System.out.println("Feed without parameters");
    }

    public void feedWithMilk() {
        System.out.println("They feed their offspring with milk..");
    }

    public void birth() {
        System.out.println("They give birth.");
    }
}
