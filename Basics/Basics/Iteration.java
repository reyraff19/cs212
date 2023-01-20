package Basics;

public class Iteration {

	public static void main(String[] args) {
		int x = 10;
		while(x > 0) {
			System.out.println(x);
			x--; //same as x -= 1
		}
		System.out.println(x);
		
		int y = 10;
		do {
			System.out.println(y);
			y--;
		}while(y > 0);
		
		//for(initialization; condition; increment)
		for(int z = 10; z > 0; z--) {
			System.out.println(z);
		}
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				System.out.print("*");
			}
			System.out.println(); // Acts as a cout << endl; in C++ 
		}
	}

}
