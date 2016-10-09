package ceping.shengda;

import java.util.Scanner;

/**
 * Created by corly on 2016/9/21.
 */
public class Main3 {
    public static final int N = 99999;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        boolean[] notPrime = new boolean[N];
        int i,j;
        for(i=2; i<N; i++) {
            if (!notPrime[i]) {
                for(j=i; j*i < N && j*i>1; j++) {
                    notPrime[j*i] = true;
                }
            }
        }
        int count = 0;
        i=1;
        while (++i < N) {
            if (!notPrime[i])
                count++;
            if (count == k)
                break;
        }
        System.out.println(i);
    }
}
