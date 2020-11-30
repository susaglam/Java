package Interview_Question;

import java.util.Arrays;

public class two_array_concat_method {
    public static void main (String[] args) {
        //Write a return method that can concate two arrays
        int[] nums1 = {1, 2, 3, 4, 5};
        int[] nums2 = {6, 7, 8, 9};
        System.out.println(Arrays.toString(concatArray(nums1, nums2)));//[1, 2, 3, 4, 5, 6, 7, 8, 9]
    }

    public static int[] concatArray (int[] n1, int[] n2) {
        int[] resultArray = new int[n1.length + n2.length];//total two arrays length
        for (int i = 0; i < n1.length; i++) {
            resultArray[i] = n1[i];
        }
        for (int i = 0; i < n2.length; i++) {
            resultArray[n1.length + i] = n2[i];
        }
        return resultArray;
    }

    public static int[] concatArray2 (int[] n1, int[] n2) {
        int[] resultArray = new int[n1.length + n2.length];//total two arrays length
        int i = 0;
        for (int each : n1) {
            resultArray[i] = each;
            i++;
        }
        for (int each : n2) {
            resultArray[i] = each;
            i++;
        }

        return resultArray;
    }
}
