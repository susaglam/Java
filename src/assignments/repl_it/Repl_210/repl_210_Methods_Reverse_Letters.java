package assignments.repl_it.Repl_210;

public class repl_210_Methods_Reverse_Letters {
    public static void main (String[] args) {
        String result = Utils.reverseLetters("..zxcv..d");
        System.out.println(result.equals("..dvcx..z")); //true
        System.out.println(result);

        String result2 = Utils.reverseLetters("---abmkl.o-");
        System.out.println(result2.equals("---olkmb.a-")); //true
        System.out.println(result2);

        String result3 = Utils.reverseLetters("---abmkl.o-");
        System.out.println(result3.equals("-o.lkmba---")); //false
        System.out.println(result3);
        result.length();
    }
}
