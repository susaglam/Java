package Interview_Question;

public class Palindrome_Algorithm {
    public static void main (String[] args) {
        //Palindrome algorithm:
        System.out.println(isPalindrome("test"));//false
        System.out.println(isPalindrome("tet"));//true
    }

    static boolean isPalindrome (String str) {
        int ltr = 0, rtl = str.length() - 1;
        while (ltr < rtl) {
            if (str.charAt(ltr) != str.charAt(rtl))
                return false;
            ltr++;
            rtl--;
        }
        return true;
    }
}
