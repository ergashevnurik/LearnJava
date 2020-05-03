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

        // Second Lesson
        /*
            Java Unary Operators
        */
        int g = 10;
        int h = -15;
        boolean u = true;
        boolean t = false;

        System.out.println(~g);// -11
        System.out.println(~h);// 14
        System.out.println(!u);// false;
        System.out.println(!t);// true;

        /* Java Arithmetical Operators */

        int i = 10;
        int o = 5;

        System.out.println(i+o);//15
        System.out.println(i-o);//5
        System.out.println(i*o);//50
        System.out.println(i/o);//2
        System.out.println(i%o);//0

        System.out.println(10*10/5+3-1*4/2);//21

        /* Left Shift Operator */

        System.out.println(10<<2);//10*2^2=10*4=40
        System.out.println(5<<5);//5*2^5=5*32=160
        System.out.println(2<<8);//2*2^8=2*256=512
        System.out.println(2<<10);//2*2^10=2*1024=2048

        /* Right Shift Operator */

        System.out.println(10>>2);//10/2^2=10/4=2
        System.out.println(50>>5);//50/2^5=50/32=1
        System.out.println(10>>1);//10/2^1=10/2=5
        System.out.println(100>>2);//100/2^2=25

        /* >> vs >>> */
        // For positive numbers it works same
        System.out.println(20>>2);//20/2^2=20/4=5
        System.out.println(20>>>2);//20/2^2=20/4=5
        System.out.println(512>>>8);//512/2^8=512/256=2
        System.out.println(32>>>-2);//0

        //For negative numbers, >>> changes the parity bit (MSB) to 0
        System.out.println(-20>>2);//-20/2^2=-20/4=-5
        System.out.println(-20>>>2);//1073741819
    }
    public void method() {
        int n = 10; // local variable
    }
}
