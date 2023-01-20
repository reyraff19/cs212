package Inheritance;

import java.util.ArrayList;

public class ShapeTester {

	public static void main(String[] args) {
		Shape shape1 = new Shape(6, 3);
		System.out.println(shape1.getArea());
		System.out.println(isBig(shape1));

		Rectangle rec1 = new Rectangle(6, 3);
		System.out.println(rec1.getArea());
		System.out.println(rec1.getBase()); // Instead of declaring Rectangle rec1, if I say Shape rec1, .getBase() does
											// not work since that is not in the shape class
		// System.out.println((Rectangle)rec1).getBase()); // This allows me to do what
		// is in the comment above2e
		System.out.println(isBig(rec1));

		Square square1 = new Square(4);
		System.out.println(square1.getArea());

		ArrayList<Shape> shapes = new ArrayList<Shape>();
		shapes.add(shape1);
		shapes.add(rec1);
		shapes.add(square1);

		double totalArea = 0;
		for (int i = 0; i < shapes.size(); i++) {
			totalArea += shapes.get(i).getArea();
		}
		System.out.println(totalArea);
	}

	public static boolean isBig(Shape shape) {
		return shape.getArea() > 10;
	}

}
