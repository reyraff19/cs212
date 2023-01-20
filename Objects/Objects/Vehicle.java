package Objects;

public class Vehicle {	// Allows to make the vehicle objects

	private int numWheels;
	private int numDoors;
	private String color;
	private double currentSpeed;
	
	public Vehicle(int numWheels, int numDoors, String color) {		// How to write a constructor
		this.numWheels = numWheels;	// Must include this.(field) since the field is within the method
		this.numDoors = numDoors;
		this.color = color;
	}	// Since the currentSpeed is not within this constructor, it is defaulted to 0.0 since it is a double
	
	public int getNumWheels() {		// accessor methods
		return numWheels;
	}
	
	public int getNumDoor() {
		return numDoors;
	}
	
	public String getColor() {
		return color;
	}
	
	public double getSpeed() {
		return currentSpeed;
	}
	
	public void repaint(String newColor) {		// mutator methods
		color = newColor;
	}
	
	public void changeSpeed(double change) {
		currentSpeed += change;
	}
	
	public String toString() {		// When you print an object of the class, using System.out.println(), it will refer to this because of the toString() method
		return "This " + color + " vehicle has " + numWheels + " wheels and " + numDoors + " doors.";
	}
	
}
