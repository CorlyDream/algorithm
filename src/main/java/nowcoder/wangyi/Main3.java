package nowcoder.wangyi;

import java.util.Scanner;

/**
 * Created by corly on 2016/9/12.
 */
public class Main3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
//        System.out.println( countNotForbidden(n));
        long[] r = new long[32];
        long[] t = new long[32];
        if (n==1)
            System.out.println(3);
        else if (n==2)
            System.out.println(9);
        else{
            r[2] = 3;
            t[2] = 6;
            for (int i=3; i<=n; i++){
                r[i] = r[i - 1] + t[i - 1];
                t[i] = t[i-1] + r[i-1]*2;
            }

            System.out.println(r[n]+t[n]);
        }
    }
    public static long count(int n)
    {
        if (n == 0) return 0;
        if (n == 1) return 3;
        long dp[] = new long[3];
        dp[1] = 3;
        for (int i = 1; i < n; i++) {
            long nDp[] = new long[3];
            nDp[1] = dp[1] + dp[2];
            nDp[2] = dp[1]*2 + dp[2];
            dp = nDp;
        }

        return dp[1] + dp[2];
    }
}
