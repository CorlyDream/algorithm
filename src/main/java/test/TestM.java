package test;

/**
 * Created by corly.cc on 2016/9/11.
 */
public class TestM {

    private static int count = 0;
    public static int foo(int x){
        System.out.println(count++);
        if (x<=2){
            return 1;
        }
        return foo(x-2)+foo(x-4)+1;
    }
    public static void main(String[] args) {
        foo(12);
        System.out.println(count);
    }
}
