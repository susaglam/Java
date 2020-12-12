package a_review.week12;

public class Shape {

    public String name;
    public double area, perimeter;

    public Shape(String name) {
        this.name = name;
    }

    public double calculateArea(){
        return 0;
    }

    public double calculatePerimeter(){
        return 0;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "name='" + name + '\'' +
                ", area=" + area +
                ", perimeter=" + perimeter +
                '}';
    }


}

/*
Shape:
	variables:
			 name, area, perimeter

	methods:
			calculateArea()	, calculatePerimeter(), toString()
 */
