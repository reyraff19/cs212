package AbstractClasses;

import java.util.ArrayList;
import java.util.List;

public class Farm {

	private List<Animal> animals = new ArrayList<Animal>();

	public void addAnimal(Animal animal) {
		animals.add(animal);
	}

	public void playSong() {
		for (Animal animal : animals) {
			System.out.println("Old McDonald had a farm. EIEIO");
			System.out.println("And on that farm he had a " + animal.getType() + ". EIEIO");
			System.out.println("With a " + animal.getSound());
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Farm farm = new Farm();
		farm.addAnimal(new Dog());
		farm.addAnimal(new LoudDog());
		farm.addAnimal(new Chick());
		farm.playSong();
	}

}
