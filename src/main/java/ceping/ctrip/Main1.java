package ceping.ctrip;

import java.util.Scanner;

/**
 * Created by corly on 2016/9/17.
 */
public class Main1 {
    public static int num;
    public static int[] arr;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        num = in.nextInt();
        int n = in.nextInt();
        arr = new int[n];
        int i,j;
        for (i=0; i<n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(serach(0,n));

    }

    public static int serach(int start, int end) {
        if (start >= end) {
            if (start>=arr.length)
                return -1-start;
            return arr[start]==num?start:-1-start;
        }
        int mid = (start+end)/2;
        if (arr[mid] == num)
            return mid;
        else if (arr[mid] < num) {
            return serach(mid + 1, end);
        }else{
            return serach(start, mid - 1);
        }
    }
}
