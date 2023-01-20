package AbstractClasses;

public class Dog extends Animal {

	public Dog() {
		super("Dog");
	}

	@Override
	public String getSound() {
		return "bark";
	}

	public String atBirth() {
		return getSound();
	}

}
