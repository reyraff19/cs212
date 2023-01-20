package AbstractClasses;

public class LoudDog extends Dog {

	public String getSound() {
		return super.getSound().toUpperCase();
	}

}
