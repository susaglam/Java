package Examples.Constructor;

public class Carpet {
    double cost;

    public Carpet(double cost) {
        if (cost < 0) {
            this.cost = 0;
        } else {
            this.cost = cost; //25
        }
    }

    public double getCost() {
        return cost; //25
    }
}
