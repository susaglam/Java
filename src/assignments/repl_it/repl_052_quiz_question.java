package assignments.repl_it;

public class repl_052_quiz_question {
    public static void main (String[] args) {
        int[] a= {10, 40, 50, 3, 1};
        int[] b= {11, 0, 500, 44, 1101};
        addElements(a,b);
    }

    public static int[] addElements(int[] ints1, int[] ints2) {
        int[] sum = new int[ints1.length];
        for(int i = 0;i<ints1.length;i++)
        {
            sum[i]=ints1[i]+ints2[i];
        }
        return sum;
    }
}
