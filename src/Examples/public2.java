package Examples;

public class public2 {
    public static void main(String[] args) {
        public_private pp1 = new public_private();
        pp1.a=5;
        pp1.b=6;

        System.out.println("pp1.a: "+pp1.a);//5
        System.out.println("pp1.b: "+pp1.b);//6

        public_private pp2 = new public_private();
        pp1.test1();
        System.out.println("pp2.a: "+pp2.a);//1
        System.out.println("pp2.b: "+pp2.b);//2
        pp2.test1();

        public_private pp3 = new public_private();
        pp3.setC(9);
        pp3.test2();//9+1+2=12 (System.out.println(getC() + a + b);)
    }
}
