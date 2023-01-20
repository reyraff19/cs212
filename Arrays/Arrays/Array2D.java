package Arrays;

public class Array2D {

	public static void main(String[] args) {
		double[][] nums = new double[3][4];	// Rows first then columns
		nums[2][1] = 3.5;
		for(int i = 0; i < nums.length; i++) {		// For each loop
			for(int j = 0; j < nums[i].length; j++) {
				System.out.print(nums[i][j] + " ");
			}
			System.out.println();
		}
		double sum = 0;
		for(double[] subArray : nums) {		// for each loops
			for(double num : subArray) {		// double num means is goes into that subArray of nums and "becomes" each element within the Array
				sum += num;
			}
		}
		System.out.println(sum);
	}

}
