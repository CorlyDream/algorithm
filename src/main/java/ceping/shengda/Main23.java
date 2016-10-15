package ceping.shengda;

import java.util.Scanner;

/**
 * Created by corly on 2016/10/8.
 */
public class Main23 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int i,n,len;
        String l;
        for(i=0; i<m; i++) {
            in.nextLine();
            l = in.nextLine();
            len = l.length();
            n = in.nextInt();
            n = n%len;
            System.out.println(l.substring(len-n,len)+l.substring(0, len-n));
        }
    }
}
