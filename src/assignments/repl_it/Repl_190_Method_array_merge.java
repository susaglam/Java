package assignments.repl_it;

public class Repl_190_Method_array_merge {

    public static void main (String[] args) {
        int[] a = {1, 2, 3};
        int[] b = {4, 5, 6};
        int[] s = mergR(a, b);
        for (int i = 0; i < s.length; i++) {
            System.out.print(s[i] + ((i != s.length - 1) ? "," : ""));
        }

        int[] c = {2, 4};
        int[] d = {6, 8};
        s = mergR(c, d);
        System.out.println("");
        for (int i = 0; i < s.length; i++) {
            System.out.print("" + s[i] + ((i != s.length - 1) ? "," : ""));
        }
    }

    public static int[] mergR (int[] a, int[] b) {
        int[] ret = new int[a.length + b.length];
        int z = 0;
        for (int i = 0; i < a.length; i++) {
            ret[z] = a[i];
            z++;
        }
        for (int i = 0; i < b.length; i++) {
            ret[z] = b[i];
            z++;
        }
        return ret;
    }
}
