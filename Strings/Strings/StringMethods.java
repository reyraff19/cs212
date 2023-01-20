package Strings;

public class StringMethods {

	public static void main(String[] args) {
		String x = "HelloWorld";
		System.out.println(x);
		char ltr = x.charAt(5);		// Prints capital W since it takes the index of the letter in string "HelloWorld"
		//character indices in Strings begin at 0, so index 5 is 'W'
		System.out.println(ltr);
		String y = "Hello";
		String z = y + "World";
		
		//x and z are different String objects but have the same sequence of characters
		System.out.println(x == z);		// Works only for primitives but if comparing objects, returns false because the values are from different places in memory
		System.out.println(x.equals(z));	// ".equals" works only for objects, if done with primitives, returns an error
		
		System.out.println(x.indexOf("loW"));	// Returns the index of the first character it is looking for that has the same pattern
		
		System.out.println(x.length());		// Gives number of characters in the string
		
		//count instances of 'l' in the string
		int count = 0;
		for(int i = 0; i < x.length(); i++) {
			if(x.charAt(i) == 'l') {
				count++;
			}
		}
		System.out.println(count);	// Prints 3 due to 3 "l's" in the string
		
		String part = x.substring(4, 7);		// Inclusive of the first parameter, 4 and exclusive of the second parameter 7, so ends at 6
		System.out.println(part);
		String otherPart = x.substring(7);		// Starts at index 7 and goes to the end of the stringin
		System.out.println(otherPart);
	}

}
