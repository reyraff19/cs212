package Arrays;

import java.util.Scanner;

public class diagonalSum{
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        input.close();
        int[][] arr = new int [a][b];
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                arr[i][j] = (int) (Math.random() * 9 + 1);
                System.out.print(arr[i][j]); 
            }
            System.out.println();
        }
        sum(arr);
        System.out.println(sum(arr));
    }
    public static int sum(int [][] array){
        int add = 0;
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                if(i == j){
                    add+= array[i][j];
                }
            }
        }
       
        return add;
    }
}