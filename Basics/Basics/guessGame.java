package Basics;

import java.util.Scanner;

public class guessGame{

    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        int num = (int) (Math.random() * 100 + 1);
        int guess = input.nextInt();
        while(num != guess){
            if(guess > num){
                System.out.println("Lower");
            }
            else{
                System.out.println("Higher");
            }
                guess = input.nextInt();
        if(num == guess){
            System.out.println("You got it");
        }
        }
        input.close();
    }
}