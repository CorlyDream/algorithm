package nowcoder.microsoft;

import java.util.Scanner;

/**
 * Created by corly on 2017/4/8.
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        int q = in.nextInt();
        int pre=Integer.MAX_VALUE,curr=Integer.MAX_VALUE;
        int rob = 1;
        int robTime = 0;
        while (pre >= curr) {
            pre = curr;
            curr = (int) (robTime + Math.ceil(((double) n)/((double) rob)));
            rob *= 2;
            robTime += q;
        }
        System.out.println(pre);
    }
}
