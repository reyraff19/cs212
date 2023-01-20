package Objects;

import java.util.ArrayList;

public class Fleet {
	
	private ArrayList<Vehicle> vehicles;		// The field
	
	public Fleet() {
		vehicles = new ArrayList<Vehicle>();
	}
	
	public Fleet(ArrayList<Vehicle> vehicles) {
		this.vehicles = vehicles;		// Sets vehicles given to the list of vehicles
	}
	
	public void addVehicle(Vehicle vehicle) {
		vehicles.add(vehicle);
	}
	
	public int getSize() {
		return vehicles.size();
	}
	
	public int getTotalNumWheels() {
		int total = 0;
		for(Vehicle vehicle : vehicles) {
			total += vehicle.getNumWheels();
		}
		return total;
	}
	
	public int countMovingVehicles() {
		int total = 0;
		for(int i = 0; i < vehicles.size(); i++) {
			if(vehicles.get(i).getSpeed() > 0) {
				total++;
			}
		}
		return total;
	}
	
	public void paintAll(String color) {
		for(Vehicle vehicle : vehicles) {
			vehicle.repaint(color);
		}
	}

}
