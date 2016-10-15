package ceping.shengda;

import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by corly on 2016/10/8.
 */
public class Main22 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {

            int k = in.nextInt();
            for (int i = 0; i < k; i++) {
                int m = in.nextInt();
                int n = in.nextInt();
                System.out.println(fun(m, n));
            }
        }
    }

    public static int fun(int m, int n) {
        int sum = 0;
        if (m == 1 || m == 0 || n == 1)
            return 1;
        if (m < n)
            n = m;
        for (int i = 1; i <= n; i++) {
            if (i == 1)
                sum += 1;
            else
                sum += fun(m - i, i);
        }
        return sum;
    }
}
