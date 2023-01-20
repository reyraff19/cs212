package Arrays;

public class Array1D {

	public static void main(String[] args) {
		int[] intArray = new int[5];
		int[] intArray2 = intArray;
		intArray2[4] = 10;
		System.out.println(intArray[4]);
		intArray[2] = 1;
		System.out.println(intArray[2]);
		System.out.println(intArray.length);
		for(int i = 0; i < intArray.length; i++) {
			intArray[i] = i + 1;
		}
		System.out.println();
		for(int x : intArray) {
			System.out.print(x + " ");
		}
		System.out.println();
		int total = 0;
		for(int x : intArray) {
			total += x;
		}
		System.out.println(total);
		
		String[] stringArray = {"Hello", "world!"};
		for(String s : stringArray) {
			System.out.print(s + " ");
		}
		System.out.println();
		changeArray(stringArray);
		//String[] arr = stringArray;
		//arr[1] = "NewValue";
		for(String s : stringArray) {
			System.out.print(s + " ");		// Prints Hello NewValue
		}
		System.out.println();
	}
	
	public static void changeArray(String[] arr) {
		// arr = new String[2];		If this were not commented out, it would make a new array called newString of size 2 that has the null character and NewValue within it
		arr[1] = "NewValue";		// arr references the same array, stringArray
	}

}
