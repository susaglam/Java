package Examples;

public class public_private {
    int a;
    public int b;
    private int c;

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public public_private() {
        a = 1;
        b = 2;
        c = 3;
    }

    public public_private(int a, int b) {
        System.out.println("called parameter's constructor. ");
    }

    public void test1() {
        System.out.println(a + b);
    }

    public void test2() { //int a1, int b1, int c1
        System.out.println(getC() + a + b);
    }
}



