package Inheritance;

public class Circle extends Shape {
    double radius;

    public Circle(double radius) {
        super(2 * Math.PI * radius, Math.PI * radius * radius);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getCircumference() {
        return getPerimeter(); // Inherits get perimeter from Shape class
    }
}