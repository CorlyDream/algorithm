package ceping.baidu;

import java.util.Arrays;

/**
 * Created by corly on 2016/9/29.
 */
public class Main2 {

    public static void main(String[] args) {
        int[][] res = transposeMultMatrix(1, 3, 3);

        int i = res.length;
        for(i=0; i<res.length; i++) {
            System.out.println(Arrays.toString(res[i]));
        }

    }

    public static int[][] transposeMultMatrix(int initialValue,int rows,int columns)
    {
        // INSERT YOUR CODE HERE
        int[][] ori = new int[rows][columns];
        int[][] orit = new int[columns][rows];
        int[][] res = new int[rows][rows];
        int i,j;
        for(i=0; i<rows; i++) {
            for(j=0; j<columns; j++) {
                ori[i][j] = initialValue;
                orit[j][i] = initialValue;
                initialValue++;
            }
        }
        int xi,yj;
        for(i=0; i<rows; i++) {
            for(j=0; j<rows; j++) {
                for(xi=0,yj=0; xi<columns&&yj<columns; xi++,yj++) {
                    res[i][j] += ori[i][xi]*orit[yj][j];
                }
            }
        }
        return res;
    }
}
