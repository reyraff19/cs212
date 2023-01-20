package Recursion;

public class RecursiveMethods {
    public static void main(String[] args) {
        System.out.println(factorial(4));
        printReverse(123);
        System.out.println(sumDigits(123));
        System.out.println(fib(2));
    }

    public static int factorial(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void printReverse(int n) {
        if (n < 10) {
            System.out.println(n);
        } else {
            System.out.print(n % 10);
            printReverse(n / 10);
            // System.out.print(n % 10); Outputs:32123
        }
    }

    public static int sumDigits(int n) {
        if (n < 10) {
            return n;
        }
        return n % 10 + sumDigits(n / 10);
    }

    public static int fib(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }
}