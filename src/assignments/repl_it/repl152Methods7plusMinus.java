package assignments.repl_it;

import java.util.Scanner;

public class repl152Methods7plusMinus {
    /*Create a method called plus_minus that gets an array of ints (int[]),
    it outputs how many negative , positive and zero numbers are in the array.
        for example:
        plus_minus (new int[]{1,2,55,-9,-2,0});
        will output:
        positives:3, negatives:2, zeros:1
        */
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int size = inp.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i <= size - 1; i++) {
            arr[i] = inp.nextInt();
        }
        plus_minus(arr);
    }

    public static void plus_minus(int[] arr) {
        int positives = 0, negatives = 0, zeros = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                negatives++;
            } else if (arr[i] == 0) {
                zeros++;
            }
            if (arr[i] > 0) {
                positives++;
            }
        }
        System.out.print("positives:" + positives + ", negatives:" + negatives + ", zeros:" + zeros);
    }
}
