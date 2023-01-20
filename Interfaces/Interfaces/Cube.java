package Interfaces;

public class Cube implements Solid {
	
	private double sideLength;
	
	public Cube(double sideLength) {
		this.sideLength = sideLength;
	}
	
	public double getSideLength() {
		return sideLength;
	}

	@Override
	public double getVolume() {
		return Math.pow(sideLength, 3);
	}

	@Override
	public double getSurfaceArea() {
		return 6 * sideLength * sideLength;
	}

}
