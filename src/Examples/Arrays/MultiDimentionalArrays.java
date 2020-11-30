package Examples.Arrays;

import java.util.Arrays;

public class MultiDimentionalArrays {
    public static void main (String[] args) {
        //How to create multi-dimensional array
        int mda[][] = new int[3][2];
        //How to print multi dimensional array
        System.out.println(Arrays.deepToString(mda));// [ [0, 0], [0, 0], [0, 0] ]
        //How to assign values to the elements
        mda[0][1] = 2;
        System.out.println(Arrays.deepToString(mda));// [ [0, 2], [0, 0], [0, 0] ]
        mda[2][0] = 5;
        System.out.println(Arrays.deepToString(mda));// [ [0, 2], [0, 0], [5, 0] ]
        mda[0][0] = 1;
        System.out.println(Arrays.deepToString(mda));// [ [1, 2], [0, 0], [5, 0] ]
        mda[1][0] = 3;
        System.out.println(Arrays.deepToString(mda));// [ [1, 2], [3, 0], [5, 0] ]
        mda[1][1] = 4;
        System.out.println(Arrays.deepToString(mda));// [ [1, 2], [3, 4], [5, 0] ]
        mda[2][1] = 6;
        System.out.println(Arrays.deepToString(mda));// [ [1, 2], [3, 4], [5, 6] ]
        Arrays.sort(mda, (a, b) -> Integer.compare(a[0], b[0]));
        System.out.println(Arrays.deepToString(mda));
        System.out.println("-----------------------------------------");


        int maa[][] = { {1}, {3, 4}, {5, 6, 7} };
        System.out.println(Arrays.deepToString(maa));// [ [1], [3, 4], [5, 6, 7] ]

        //How to print a specific inner array
        System.out.println(Arrays.toString(maa[1]));//[3, 4]

        //How to print a specific element in a multidimensional array
        System.out.println(maa[2][1]);//6

        //How to print all elements one by one on the console in the same line with aa "*" at the beginning
        //of every element
        for(int i=0; i<maa.length; i++) {
            for(int k=0; k<maa[i].length; k++) {
                System.out.print("*" + maa[i][k]);
            }
        }

        System.out.println();

        //How to find the product of all elements in the array "maa"
        int product = 1;

        for(int i=0; i<maa.length; i++) {

            for(int k=0; k<maa[i].length; k++) {
                product = product * maa[i][k];
            }

        }
        System.out.println("The product of all elements: " + product);

        //How to find the sum of all elements
        int product2 = 0;

        for(int i=0; i<maa.length; i++) {

            for(int k=0; k<maa[i].length; k++) {
                product2 = product2 + maa[i][k];
            }

        }
        System.out.println("sum of all elements: " + product2);
    }
}
