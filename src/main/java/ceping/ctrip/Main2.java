package ceping.ctrip;

import java.util.Scanner;

/**
 * Created by corly on 2016/9/17.
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String data = in.nextLine();
        String[] strs = data.split(",");
        int[] prices = new int[strs.length];
        int i,j;
        for (i=0; i<strs.length; i++) {
            prices[i] = Integer.valueOf(strs[i]);
        }
        int max = 0;
        for(i=0; i<prices.length; i++) {
            int maxp = -1;
            for(j = i+1; j<prices.length; j++) {
                if (prices[j] > maxp) {
                    maxp = prices[j];
                }
            }
            max = maxp-prices[i]>max?maxp-prices[i]:max;
        }
        System.out.println(max);
    }

}
