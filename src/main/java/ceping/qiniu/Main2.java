package ceping.qiniu;

import java.util.Scanner;

/**
 * Created by corly on 2016/9/24.
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); //数组长度
        int[] a =new int[n];  //定义数组
        for(int i=0;i<n;i++){
            a[i]=in.nextInt();
        }
        int maxSum = maxsum(a,n);
        System.out.println(maxSum);
    }
    private static int maxsum(int[] a, int n) {
        int sum=0;
        int c=0;
        for(int i=0;i<n;i++)
        {
            if(c<0)
                c=a[i];
            else
                c+=a[i];
            if(sum<c)
                sum=c;
        }
        return sum;
    }

}
