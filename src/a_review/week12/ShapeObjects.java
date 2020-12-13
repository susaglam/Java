package a_review.week12;

public class ShapeObjects {

    public static void main(String[] args) {
        //Shape{name='Rectangle', area=200.00, perimeter=60.00}
        Rectangle rectangle = new Rectangle(10, 20);
        System.out.println(rectangle.toString());

        // Shape{name='Square', area=25.00, perimeter=20.00}
        Square square = new Square(5);
        System.out.println(square.toString());

        // Shape{name='Circle', area=201.06, perimeter=50.27}
        Circle circle = new Circle(8);
        System.out.println(circle.toString());

        // Shape{name='Right Angle Triangle', area=25.00, perimeter=26.18}
        Triangle triangle = new Triangle(10, 5);
        System.out.println(triangle.toString());

        // Shape{name='Scalene Triangle', area=14.70, perimeter=18.00}
        Triangle triangle1 = new Triangle(5, 6, 7);
        System.out.println(triangle1.toString());

        // Shape{name='Equilateral Triangle', area=43.30, perimeter=30.00}
        Triangle triangle2 = new Triangle(10);
        System.out.println(triangle2.toString());

        // Shape{name='Obtuse Angle Triangle', area=15.00, perimeter=18.00}
        Triangle triangle3 = new Triangle(5, 6, 7, 5);
        System.out.println(triangle3.toString());
    }
}
