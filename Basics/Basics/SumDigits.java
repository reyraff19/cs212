package Basics;

public class SumDigits{

    public static void main(String [] args){
        System.out.println(add(24));
        System.out.println(add(1123));
        
    }

    public static int add(int i){
        int sum= 0;
        while(i > 0){
            int num;
            num = i % 10;
            i = i / 10;
            sum += num;
        }
        return sum;
    }
}