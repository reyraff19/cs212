package Interfaces;

public class Sphere implements Solid{

	private double radius;

	public Sphere(double radius) {
		this.radius = radius;
	}

	@Override
	public double getVolume() {
		return (4/3) * Math.PI * Math.pow(radius, 3);
	}

	@Override
	public double getSurfaceArea() {
		return 4 * Math.PI * Math.pow(radius, 2);
	}

}
