package test;

/**
 * Created by corly on 2016/9/21.
 */
public class Main12 {
    public static void main(String[] args) {
        int a = 1534236469;
        System.out.println(reverse(a));
    }
    public static int reverse(int x) {
        int res = 0;
        while(x!=0){
            if(res>Integer.MAX_VALUE/10)
                return 0;
            res = res*10 + x%10;
            x /= 10;
        }
        return res;
    }
}
