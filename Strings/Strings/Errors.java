package Strings;

public class Errors{

	public static void main(String[] args){
		System.out.println(halveString("abracadabra"));
		System.out.println(reverseString("abracadabra"));
		System.out.println(countA("abracadabra"));
		System.out.println(findSingletons("abracadabra"));
	}
// Syntax error since length is spelled incorrectly
	public static String halveString(String original){
		return original.substring(0, original.length() / 2);		
	}
// Runtime error
	public static String reverseString(String original){		
		String reversed = "";
		for (int i = original.length() - 1; i >= 0; i--){
			reversed += original.substring(i, i + 1);
		}
		return reversed;
	}
// Logic error
	public static int countA(String str){		
		int count = 0;
		for (int i = 0; i < str.length(); i++){
			if (str.substring(i, i + 1).equals("a") || str.substring(i, i + 1).equals("A")){
				count++;
			}
		}
		return count;
	}
	public static String findSingletons(String str){
		String singletons = "";
		for (int i = 0; i < str.length(); i++){
			String letter = str.substring(i, i + 1);
			int count = 0;
			for (int j = 0; j < str.length(); j++){
				if (str.substring(j, j + 1).equalsIgnoreCase(letter)){
					count++;
				}
			}
			if (count == 1){
				singletons += letter;
			}
		}
		return singletons;
	}
}
