package ceping.cmbcc;

import java.util.Scanner;

/**
 * Created by corly on 2016/9/19.
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum = 0;
        int p = 1;
        for(int i=1; i<=n; i++) {
            p *= i;
            sum += p;
        }
        System.out.println(sum);
    }
}
