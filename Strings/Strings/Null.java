package Strings;

public class Null {

	public static void main(String[] args) {
		String a = "null";
		String b = "";		// References variable b which has a value of zero
		String c = null;	// Does not reference anything, empty variable, still prints null but is not the same as printing the word null
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		System.out.println(a.equals(b));
		System.out.println(b.equals(c));
		System.out.println(a.equals(c));
		
		System.out.println(c != null && c.equals(a));		// Can get around the null pointer exception using short-circuiting, since it checks only first parameter before the "&&"
		System.out.println(b.length() >= 2 && b.substring(0,2).equals("nu"));	// Another instance of short-circuiting since the parameter after the "&&" would give an error since b contains nothing
	}

}
