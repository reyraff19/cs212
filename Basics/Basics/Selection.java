package Basics;

public class Selection {

	public static void main(String[] args) {
		int x = 23;
		if(!(x > 10 && x < 20)) {  //equivalent to if(x <= 10 || x >= 20)
			System.out.println("Hello");
		}else if(x > 5){
			System.out.println("Hi there!");
		}else {
			System.out.println("No hello for you!");
		}
		
		//Comparison Operators: >, <, >=, <=, ==, !=
		//Logical Operators: &&, ||, !
		
		//DeMorgan's Laws
		//!(a && b) == !a || !b
		//!(a || b) == !a && !b
		
		//!(x > 10 && x < 20)
		//(!(x > 10) || !(x < 20))
		//(x <= 10 || x >= 20)
	}

}
