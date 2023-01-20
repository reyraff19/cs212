package Interfaces;

public class Pyramid implements Solid {
    private double length;
    private double height;
    private double width;

    public Pyramid(double length, double width, double height) {
        this.length = length;
        this.height = height;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    @Override
    public double getVolume() {
        return (length * width * height) / 3;
    }

    @Override
    public double getSurfaceArea() {
        return (length * width) + (length * Math.sqrt(Math.pow(width / 2, 2) + Math.pow(height, 2)))
                + (width * Math.sqrt(Math.pow((length / 2), 2) + Math.pow(height, 2)));
    }
}
