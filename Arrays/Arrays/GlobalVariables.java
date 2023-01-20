package Arrays;

public class GlobalVariables {
	
	public static int globalNum = 0;

	public static void main(String[] args) {
		System.out.println(globalNum);
		increment();
		System.out.println(globalNum);
	}
	
	public static void increment() {
		globalNum++;
	}

}
