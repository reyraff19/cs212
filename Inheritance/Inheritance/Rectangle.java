package Inheritance;

public class Rectangle extends Shape { // Can call any method in Shape class

	private double base;
	private double height;

	public Rectangle(double base, double height) {
		super(2 * base + 2 * height, base * height); // gets the perimeter and the area, much like the class in Shape,
														// except uses base and height
		// Uses super() since we are using the Shape class
		// Passes this super to the shape class
		this.base = base;
		this.height = height;
	}

	public double getBase() {
		return base;
	}

	public double getHeight() {
		return height;
	}

}
