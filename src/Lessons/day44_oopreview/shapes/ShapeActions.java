package Lessons.day44_oopreview.shapes;

import static Lessons.day44_oopreview.shapes.ShapeManager.*;

import java.util.ArrayList;
import java.util.List;

public class ShapeActions {
	
	public static void main(String[] args) {
		
		drawSquare((Square)buildShape("square"));
		
		drawShape(buildShape("shape"));
		
		System.out.println("-------------");
		
		List<Shape> myList = new ArrayList<>();
		myList.add(new Shape()); 
		myList.add(new Square());
		myList.add(new Shape());
		myList.add(new Square());
		myList.add(new Diamond());
		
		drawShape(myList);
		
		
		
	}

}
