package Basics;

public class Primitives {

	public static void main(String[] args) {
		//boolean
		boolean a = true;
		System.out.println(a);
		a = !a;
		System.out.println(a);
		
		//int
		int x = Integer.MAX_VALUE;
		System.out.println(x);
		x = x + 1;
		System.out.println(x);
		x /= -2;
		System.out.println(x);
		//System.out.println(x / 0);
		
		int y = 2;
		int z = -2;
		System.out.println(y * z);
		
		//double
		double n = 10; // Converts 10 from an int to a double
		System.out.println(n);	// Prints 10.0
		n /= 3;	// 10/3 = 3.333335 which rounds because it is a double
		System.out.println(n);
		double m = Double.MAX_VALUE;
		System.out.println(m);	// Doubles store a lot larger than ints since the output is 1.7976931348623157 * 10^308
		m = m * 2;
		System.out.println(m); // Gives infinity since it it a very large number
		m = Double.MIN_VALUE;
		System.out.println(m);	// 4.9 * 10 ^-324
		m = m / 2;
		System.out.println(m);	// Gives 0
		
		//converting between int and double
		int b = 3;
		double c = b;
		System.out.println(c);
		
		double d = 3.8;
		int e = (int) d;
		System.out.println(e);
		System.out.println(d);
		
		//=, +=, *=, -=, /=, %=
	}

}
