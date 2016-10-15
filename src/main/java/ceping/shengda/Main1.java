package ceping.shengda;

import java.util.Scanner;

/**
 * Created by corly on 2016/9/21.
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        if (k < 3) {
            System.out.println(1);
            return;
        }
        int i=0;
        int pre = 1;
        int res = 1;
        int tmp;
        for(i=3; i<=k; i++) {
            tmp = res;
            res = res + pre;
            pre = tmp;
        }
        System.out.println(res);
    }
}
