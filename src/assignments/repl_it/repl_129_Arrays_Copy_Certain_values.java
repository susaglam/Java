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
        for (String s : arr) {
            if (s.contains("e")) {
                str += s + "#";
            }
        }
        String[] arrStr = str.split("#");
        String[] fewValues = new String[arrStr.length];
        for (int i = 0; i < arrStr.length; i++) {
            fewValues[i] = arrStr[i];
        }

        //System.arraycopy(arrStr, 0, fewValues, 0, arrStr.length);
        //YOUR CODE ENDS HERE -----------------------
        return fewValues;
    }
}
