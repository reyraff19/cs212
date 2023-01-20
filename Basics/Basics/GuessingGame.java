package Basics;

import java.util.Scanner;

public class GuessingGame {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number = (int)(Math.random() * 100 + 1);
		int guess = input.nextInt();
		while(number != guess) {
			if(guess > number) {
				System.out.println("Too high!");
			}else {
				System.out.println("Too low!");
			}
			guess = input.nextInt();
		}
		System.out.println("You got it!");
		input.close();
	}

}
