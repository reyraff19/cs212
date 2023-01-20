package Basics;

public class StaticMethods {

	public static void main(String[] args) {
		System.out.println(raise(3, 2));
		System.out.println(raise(10, 5));
	}
	
	// raise is the method/function being called in the main
	
	public static int raise(int base, int exponent) {		// Takes a base, multiplies base by certain amount of times, then returns product
		int product = 1;
		for(int i = 0; i < exponent; i++) {
			product *= base;
		}
		return product;
	}

}
