package ceping.qiniu;

import java.util.Scanner;

/**
 * Created by corly on 2016/9/18.
 */
public class Permutation {
    public static String[] data;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        data = in.nextLine().split(",");
        perm(0,data.length-1);
    }

    public static void perm(int start, int end) {
        int i;
        if (start > end) {
            StringBuilder sb = new StringBuilder();
            for(i=0; i<data.length; i++) {
                sb.append(data[i] + ",");
            }
            System.out.println(sb.deleteCharAt(sb.length()-1));
        }else {
            for(i=start; i<=end; i++) {
                swap(start,i);
                perm(start+1, end);
                swap(start,i);
            }
        }
    }

    public static void swap( int i, int j) {
        String tmp = data[i];
        data[i] = data[j];
        data[j] = tmp;
    }
}
