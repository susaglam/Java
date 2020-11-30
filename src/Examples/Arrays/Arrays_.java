package Examples.Arrays;

import java.util.Arrays;

public class Arrays_ {
    int x = 12;

    /*
    1) Arrays can be used to store multiple values.
    2) The data types of the values put in the Arrays must be the same.
    3) While creating the array, we must specify how many elements we will place.
    4) Only a) primitive and b) references can be stored in Arrays.
    5) You cannot store strings in Arrays.
    */
    public static void main (String[] args) {

        int a[] = new int[4]; // Creating an array is done with []. [4] I will store 4 pieces of data.

        // To write Array to console is done with toString.
        System.out.println(java.util.Arrays.toString(a));        //[0, 0, 0, 0]

        // adding elements to the Array
        a[0] = 8;     // to assign 8 to the zeroth index
        System.out.println(java.util.Arrays.toString(a));//[8, 0, 0, 0]
        a[2] = 15;        // index 2 so the 3rd element will be 15
        System.out.println(java.util.Arrays.toString(a));//[8, 0, 15, 0]
        a[3] = 8;        // Assign 8 to the last element, the 4th number
        System.out.println(java.util.Arrays.toString(a));//[8, 0, 15, 8]
        a[1] = 23;        // index (1) so assign 23 to the 2nd element
        System.out.println(java.util.Arrays.toString(a));//[8, 23, 15, 8]

        // Finding how many elements are in the Array
        // str.length(); we use in strings is.
        // arr.length; we use in arrays.

        System.out.println(a.length);        //There are 4 elements.

        // Create a string array. The address of the string is stored, not the string itself.
        // Because the string is not primitive. arrays can only store primitives
        String b[] = new String[3];
        System.out.println(java.util.Arrays.toString(b));//[null, null, null]
        b[0] = "Sukru";
        System.out.println(java.util.Arrays.toString(b));//[Sukru, null, null]
        b[1] = "Hamdullah";
        System.out.println(java.util.Arrays.toString(b));//[Sukru, Hamdullah, null]
        b[2] = "Ayse";
        System.out.println(java.util.Arrays.toString(b));//[Sukru, Hamdullah, Ayse]

        // printing a specific element from an array
        System.out.println(b[2]);//Ayse
        System.out.println(b[0]);//Sukru
        System.out.println(b[1]);//Hamdullah

        // print the elements in the array
        // Let's write the elements of array b to console one under the other
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
            //Sukru
            //Hamdullah
            //Ayse
        }

        // rewrite the elements in an array on the same line by putting "*" in them.
        for (int i = a.length - 1; i >= 0; i--) {
            System.out.print(" *" + a[i]);// *8 *15 *23 *8
        }

        System.out.println();

        // Print the elements in an array with an even index
        for (int i = 0; i < a.length; i++) {
            if (i % 2 == 0) {
                System.out.println(a[i]); // 8
            }
        }

        // Sort the elements in the Array from ascending order

        // Sort the elements in an array from small to large
        java.util.Arrays.sort(a);//[8, 8, 15, 23]
        System.out.println(java.util.Arrays.toString(a)); //[8, 8, 15, 23]

        // Use the sort() method for b array.
        // In string arrays, the sort() method sorts alphabetically.
        // In Java, "Natural Order" is used instead of small to size and alphabetical sorting

        java.util.Arrays.sort(b);
        System.out.println(java.util.Arrays.toString(b)); // [Ayse, Hamdullah, Sukru]

    }
}
