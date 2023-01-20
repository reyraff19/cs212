package Lists;

import java.util.ArrayList;

public class Lists {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Hello");	// In index 0
		list.add("world");	// In index 1
		list.add(1, "newElement");		// newElement is put in index 1 and everything else is shifted
		System.out.println(list);
		System.out.println(list.get(2));
		System.out.println(list.indexOf("world"));
		System.out.println(list.indexOf("World"));
		list.remove(0);
		System.out.println(list);
		System.out.println(list.size());
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		for(String s : list) {
			System.out.print(s.charAt(0));
		}
		System.out.println();
		
		ArrayList<Integer> numArray = new ArrayList<Integer>();
		for(int i = 0; i < 10; i++) {
			numArray.add(i);
		}
		System.out.println(numArray);
		//Using this list wraps it, convert from objects to primitives
		//boolean -> Boolean
		//int -> Integer
		//double -> Double
		//char -> Character
		
		//String[] arr = {"Hello", "world"};
		//for(String s : arr) {
			//System.out.print(s + " ");
		//}
		System.out.println();
	}
	
	public static void removeEvens1(ArrayList<Integer> list) {
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i) % 2 == 0) {
				list.remove(i);
				i--;
			}
		}
	}
	
	public static void removeEvens2(ArrayList<Integer> list) {
		for(int i = list.size() - 1; i >= 0; i--) {
			if(list.get(i) % 2 == 0) {
				list.remove(i);
			}
		}
	}

}
