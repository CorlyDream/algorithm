package test;

public class Main {
    public static void main(String[] args) {
//        System.out.println(fib(1000));
        System.out.println(0.11+2001299.32);
    }

    public static int fib(int n) {
        int cnt = 0;
        while (n > 0) {
            cnt++;
            n = n & (n - 1);
        }
        return cnt;
    }


}
