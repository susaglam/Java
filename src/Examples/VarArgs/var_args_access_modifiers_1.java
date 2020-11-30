package Examples.VarArgs;

public class var_args_access_modifiers_1 {
    public static void main (String[] args) {
        sum(1, 2, 3, 4, 5, 6, 7);
        sum(1, 5, 6, 7);
        sum(1, 2);
        sum(1, 7, 3, 4);
        sum(2, 3, 4, 5, 6, 7);
        sum(1, 2, 5, 6, 7);
        sum(9, 6, 7);
    }

    public static void sum (int... numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println(sum);
    }
}
