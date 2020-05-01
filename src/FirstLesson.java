public class FirstLesson {
    int f = 50; // instance variable
    static int p = 100; // static variable
    public static void main(String args[]) {
        int a = 10; // narrowing
        float b = (float) a;
        System.out.println(b);
        int x = 10; //widening
        float y = x;
        System.out.println(y);
        int c = 130; // overflow
        byte d = (byte) c;
        System.out.println(d);

        int ab = 10;
        System.out.println(ab++);
        System.out.println(++ab);
        System.out.println(++ab);
        System.out.println(ab++);
        System.out.println(ab++);

    }
    public void method() {
        int n = 10; // local variable
    }
}
