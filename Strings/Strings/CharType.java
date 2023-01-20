package Strings;

public class CharType {

	public static void main(String[] args) {
		char ltr = 'A';
		System.out.println((int) ltr);	// Prints the ASCII number for char or 'A'
		int num = 77;
		System.out.println((char) num);	// Prints the char based on the number given
		ltr += 32;	// Causes such letter to be lowercase
		System.out.println(ltr);
	}

}
