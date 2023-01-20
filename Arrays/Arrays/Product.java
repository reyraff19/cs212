package Arrays;

import java.util.Scanner;

public class Product{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        input.close();
        int[][] arr = new int [a][b];
        pro(arr);       // When inputting array into a method, there is no need for the size of the array
    }
    public static void pro(int [][] array){
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                array [i][j] = i * j;
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }
}