package Interfaces;

import java.util.ArrayList;
import java.util.List;

public class SolidTester {

	public static void main(String[] args) {
		List<Solid> solids = new ArrayList<Solid>();
		solids.add(new Cube(3));
		solids.add(new Sphere(3));
		solids.add(new Pyramid(2, 2, 2));

		for (Solid solid : solids) {
			System.out.println(solid.getSurfaceArea());
			System.out.println(solid.getVolume());
		}
	}

}
