package test;

/**
 * Created by corly on 2016/8/7.
 */
public class Test {
    private static int x;
    private int y;
    static {
        x = 1;
    }

    public static void print(){
        System.out.println(x);

    }

    public static void main(String[] args) {
        System.out.println(Test.x);
        print();

    }
}
