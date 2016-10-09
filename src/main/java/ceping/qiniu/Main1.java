package ceping.qiniu;

import java.util.Scanner;

/**
 * Created by corly on 2016/9/30.
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] a = new int[1000];
        long pre = 1;
        long curr= 1;
        int res  = 0;
        long tmp;
        for(int i=3; i<=1000; i++) {
            tmp = curr;
            curr = pre + curr;
            pre = tmp;
            if (curr % 7 == 0) {
                res++;
            }

        }
        System.out.println(res);
    }
}
