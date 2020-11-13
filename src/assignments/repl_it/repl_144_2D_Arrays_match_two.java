package assignments.repl_it;

/*
Like in a match 3 game but not.

You get a 2d array and you need to find how many two matches there are.
and return the number(int) of matches you found.
For example : 1 and 2 are not a match, 2 and 2 are a match.
a match in this case is two numbers in a row that are equal .

for example:
[2,2,1,3,4,5]
[5,2,3,3,4,5]
[3,2,3,1,4,5]
print
matches: 2
This 2d array has 2 matches (the 2,2 in the first row and 3,3 in the second).

hint: you will need a nested for loop to loop all the array.
 the if check the if the current number is equal to the next
 (or previous it doesn't matter), check for array boundaries
 before so you won't get an error.
 */

import java.util.Scanner;

public class repl_144_2D_Arrays_match_two {
    public static void main (String[] args) {
        Scanner inp = new Scanner(System.in);
        int rows = inp.nextInt(), cols = inp.nextInt();
        int[][] arr = new int[rows][cols];
        for (int i = 0; i <= rows - 1; i++) {
            for (int j = 0; j <= cols - 1; j++) {
                arr[i][j] = inp.nextInt();
            }//end for cols
        }//end for rows

        //your code here
        int matches = 0;
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (c + 1 < cols) {
                    if (arr[r][c] == arr[r][c + 1]) {
                        matches++;
                    }
                }
            }
        }
        System.out.print("matches: " + matches);
        inp.close();
    }//end main
}
