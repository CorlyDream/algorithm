package leetcode.easy;

/**
 * Created by corly on 2016/10/15.
 */
public class GetFactors {
    public static int maxCommanFactor(int a, int b){
        int i,j;
        int gap = b/a;
        int[] fac = getFactors(gap);
        i=0;
        while (fac[i]>0){
            i++;
        }

        return (int)(Math.pow(2, i+1)-2);
    }


    public static int[] getFactors(int n){
        int j=0;
        int[] res = new int[100];
        for(int i=2; i<=Math.sqrt(n); i++){
            while(n%i==0){
                res[j++] = i;
                n = n/i;
            }
        }
        return res;
    }
}
