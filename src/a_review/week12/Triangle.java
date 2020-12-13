package a_review.week12;

public class Triangle extends Shape {

    public double aSide, bSide, cSide, base, height;

    /**
     * Right Angle Triangle
     * Also Isosceles triangle
     *
     * @param base   Right Angle Triangle base line width
     * @param height Right Angle Triangle height
     */
    public Triangle(double base, double height) {
        super("Right Angle Triangle");
        this.base = base;
        this.height = height;
        area = calculateArea();
        perimeter = calculatePerimeter();
    }

    /**
     * Scalene Triangle
     *
     * @param aSide Scalene Triangle a side width
     * @param bSide Scalene Triangle b side width
     * @param cSide Scalene Triangle c side width
     */
    public Triangle(double aSide, double bSide, double cSide) {
        super("Scalene Triangle");
        this.aSide = aSide;
        this.bSide = bSide;
        this.cSide = cSide;
        area = calculateArea();
        perimeter = calculatePerimeter();
    }

    /**
     * Equilateral Triangle
     *
     * @param aSide Equilateral Triangle a side width
     */
    public Triangle(double aSide) {
        super("Equilateral Triangle");
        this.aSide = aSide;
        area = calculateArea();
        perimeter = calculatePerimeter();
    }

    /**
     * Obtuse Angle Triangle
     *
     * @param aSide  Obtuse Angle Triangle a side width
     * @param base   Obtuse Angle Triangle base width
     * @param cSide  Obtuse Angle Triangle c side width
     * @param height Obtuse Angle Triangle height (for base line)
     */
    public Triangle(double aSide, double base, double cSide, double height) {
        super("Obtuse Angle Triangle");
        this.aSide = aSide;
        this.base = base;
        this.cSide = cSide;
        this.height = height;
        area = calculateArea();
        perimeter = calculatePerimeter();
    }

    @Override
    public double calculateArea() {
        double result = 0;
        switch (name) {
            case "Right Angle Triangle", "Obtuse Angle Triangle":
                result = (base * height) / 2;
                break;
            case "Scalene Triangle":
                double s = (aSide + bSide + cSide) / 2;
                result = Math.sqrt(s * (s - aSide) * (s - bSide) * (s - cSide));
                break;
            case "Equilateral Triangle":
                result = Math.sqrt(3) / 4 * aSide * aSide;
                break;
            default:
                break;
        }
        return result;
    }

    @Override
    public double calculatePerimeter() {
        double result = 0;
        switch (name) {
            case "Right Angle Triangle":
                result = (base + height + Math.sqrt(height * height + base * base));
                break;
            case "Scalene Triangle", "Obtuse Angle Triangle":
                result = aSide + bSide + cSide;
                break;
            case "Equilateral Triangle":
                result = 3 * aSide;
                break;
            default:
                break;
        }
        return result;
    }
}