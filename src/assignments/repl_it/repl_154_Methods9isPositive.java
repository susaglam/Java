package assignments.repl_it;

import java.util.Scanner;
public class repl_154_Methods9isPositive {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int size = inp.nextInt();

        int[] arr = new int[size];
        for(int i=0 ;i<=size-1;i++)
        {
            arr[i]=inp.nextInt();
            isPos(arr[i]);
        }
    }

    public static void isPos(int num)
    {
        if (num<=0)
            System.out.println("not positive");
        else
            System.out.println("positive");
    }
}
