package Examples.Constructor;

public class Floor {

    double width;
    double length;

    public Floor(double width, double length) {
        if (width < 0) {
            this.width = 0;
        } else {
            this.width = width; // 1.40
        }
        if (length < 0) {
            this.length = 0;
        } else {
            this.length = length; // 2.00
        }
    }

    public double getArea() {
        return width * length; //1.40 * 2.00 = 2.8
    }
}