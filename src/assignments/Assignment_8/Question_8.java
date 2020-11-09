package assignments.Assignment_8;

import java.util.Scanner;

public class Question_8 {
    public static void main (String[] args) {
        /*
        Question-8

        Complete a method fib() that will compute Fibonacci numbers
        In fibonacci series, next number is the sum of previous two numbers for example 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144,……... The first two numbers of fibonacci series are 0 and 1.
        Given a number num, print n-th Fibonacci Number.
        Input : 2
        Output : 1
        Input : 9
        Output : 21
         */

        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        fib(num);
        scan.close();
    }

    public static void fib (int num) {
        int previousValue = 0, currentValue = 1, nextValue = 0;

        for (int i = 2; i < num; i++) {
            nextValue = currentValue + previousValue;
            previousValue = currentValue;
            currentValue = nextValue;
        }
        System.out.println(nextValue);
    }
}
