package assignments.repl_it;

import java.util.ArrayList;

public class repl_201_Methods_with_ArrayList_10_appendPosSum {
    public static void main (String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(4);
        numbers.add(-6);
        numbers.add(3);
        numbers.add(-8);
        numbers.add(0);
        numbers.add(4);
        numbers.add(3);
        System.out.println(appendPosSum(numbers));
    }

    public static ArrayList<Integer> appendPosSum (ArrayList<Integer> pNumbers) {
        ArrayList<Integer> positive = new ArrayList<>();
        int sum = 0;
        for (int p : pNumbers) {
            if (p > 0) {
                positive.add(p);
                sum += p;
            }
        }
        positive.add(sum);
        return positive;
    }
}
