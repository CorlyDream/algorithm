package ceping.shengda;

import java.util.Scanner;

/**
 * Created by corly on 2016/10/8.
 */
public class LongCommon {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String x =in.nextLine();
        String y = in.nextLine();
        int[][] f = new int[x.length()+1][y.length()+1];
        int i,j;
        //填充矩阵
        for ( i = 1; i <= x.length(); i++)
        {
            for ( j = 1; j <= y.length(); j++)
            {
                //相等的情况
                if (x.charAt(i - 1) == y.charAt(j-1))
                {
                    f[i][j] = f[i - 1][j - 1] + 1;
                }
                else
                {
                    //比较“左边”和“上边“，根据其max来填充
                    if (f[i - 1][j] >= f[i][j - 1])
                        f[i][j] = f[i - 1][j];
                    else
                        f[i][j] = f[i][j - 1];
                }
            }
        }
        System.out.println(f[x.length()][y.length()]);
    }

//    public static int same(int[][] f, int i, int j) {
//        if(i<0 || j<0)
//            return 0;
//        if(f[i][j] != 0)
//            return f[i][j];
//
//    }
}
