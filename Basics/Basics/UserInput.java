package Basics;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		System.out.println("The product is " + a * b);
		input.close();
	}

}
