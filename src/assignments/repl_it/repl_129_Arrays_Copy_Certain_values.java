package assignments.repl_it;

import java.util.Arrays;

public class repl_129_Arrays_Copy_Certain_values {
    public static void main (String[] args) {
        System.out.println("-----EXAMPLE RUN ---------");
        String[] numbers = {"zero", "one", "two", "three", "four"};
        System.out.println(Arrays.toString(getWithE(numbers)));
    }

    public static String[] getWithE (String[] arr) {
        //TODO : YOUR CODE GOES HERE ----------------------
        String str = "";
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].contains("e")) {
                str += arr[i] + "#";
            }
        }
        String[] arrStr = str.split("#");
        String[] fewValues = new String[arrStr.length];
        for (int i = 0; i < arrStr.length; i++) {
            fewValues[i] = arrStr[i];
        }
        //YOUR CODE ENDS HERE -----------------------
        return fewValues;
    }
}
