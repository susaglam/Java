package assignments.repl_it;

import java.util.Scanner;

//In Fibonacci series, next number is the sum of previous two numbers
// for example 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55,  89,  144,……...
// The first two numbers of the Fibonacci series are 0 and 1.

public class repl_162_Methods_17_FibonacciNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        fib(num);
    }

    public static void fib(int num) {
        int previousValue = 0, currentValue = 1, nextValue = 0;

        for (int i = 1; i < num; i++) {
            nextValue = currentValue + previousValue;
            previousValue = currentValue;
            currentValue = nextValue;
        }
        System.out.println(nextValue);
    }
}
