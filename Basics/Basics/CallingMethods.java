package Basics;

public class CallingMethods {

	public static void main(String[] args) {
		System.out.println(StaticMethods.raise(3, 2));	// className.methodName
		System.out.println(Math.pow(3, 2)); // Class is math and pow is the method
		System.out.println(Math.random()); //random number in range [0, 1)
		System.out.println((int)(Math.random() * 10) + 1); //random int from 1 to 10
		
		//[0, 1)
		//[0, 10)
		//{0, 1, 2, 3, 4, 5, 6, 7, 8, 9}
		//{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}
	}

}
