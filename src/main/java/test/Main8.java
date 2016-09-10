package test;

import java.util.Scanner;

/**
 * Created by corly.cc on 2016/9/2.
 */
public class Main8 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] cost = new int[n];
        int i;
        for (i=0; i<n; i++) {
            cost[i] = in.nextInt();

        }

        int pre2Work = cost[0] + cost[1];
        int preNo = cost[0];
        int prePreNo = cost[1];

        for(i=2; i<n; i++){
            int tNo = pre2Work>preNo?pre2Work:preNo;
            int t2Work = prePreNo + cost[i];
            int tPrePreNo = preNo + cost[i];
            pre2Work = t2Work;
            preNo = tNo;
            prePreNo = tPrePreNo;
        }
        int max = pre2Work>preNo?pre2Work:preNo;
        System.out.println(max>prePreNo?max:prePreNo);
    }
}
