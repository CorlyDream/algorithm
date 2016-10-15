package nowcoder;

import java.util.Scanner;

/**
 * Created by corly on 2016/9/3.
 */
public class Shuffle {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int group = in.nextInt();
        int i,j;
        for (i=0; i<group; i++) {
            int n = in.nextInt();
            int times = in.nextInt();
            int[] poker = new int[2*n];
            int[] tmp = new int[2*n];
            for(j=0; j<2*n; j++) {
                poker[j] = in.nextInt();
            }
            tmp[0] = poker[0];
            tmp[2*n - 1] = poker[2*n - 1];

            boolean flag = true;
            for(j=0; j<times; j++) {
                int k1,k2,k;
                for(k1=n-1,k2=2*n-2,k=2*n-2; k1>0; k1--,k2--){
                    if (flag) {
                        tmp[k--] = poker[k1];
                        tmp[k--] = poker[k2];
                    }else{
                        poker[k--] = tmp[k1];
                        poker[k--] = tmp[k2];
                    }
                }
                flag = !flag;
            }
            poker = flag?poker:tmp;
            for(j=0; j<poker.length; j++){
                if (j==poker.length-1)
                    System.out.println(poker[j]);
                else
                    System.out.print(poker[j]+" ");
            }
        }
    }

}
