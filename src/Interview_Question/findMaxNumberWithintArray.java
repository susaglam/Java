package Interview_Question;

import java.util.Arrays;

public class findMaxNumberWithintArray {
    public static void main (String[] args) {
        /*
        Write a method that can find the maximum number from an int Array
         */
        int[] numbers = new int[] {1, 7, 3, 99, 34};
        System.out.println(findMaxNumber(numbers));
        System.out.println(findMaxNumber2(numbers));
    }

    public static int findMaxNumber (int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int findMaxNumber2 (int[] arr) {
        Arrays.sort(arr);
        return arr[arr.length-1];
    }
}
