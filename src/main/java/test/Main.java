package test;

import java.util.Arrays;
import java.util.Random;

public class Main {
	public static void main(String[] args) {
		Integer i1=120,i2=120,i3=128,i4=128;
		System.out.println(i1==i2);
		System.out.println(i1.equals(i2));
		System.out.println(i3==i4);
		System.out.println(i3.equals(i4));

	}
	
	/**
     * 大回环矩阵
     * @param n
     */
    public static void loopMatrix(int n){
        int[][] matrix = new int[n][n];  
        for (int num = 1, x = 0, y = 0, xDir = 0, yDir = 1; num <= n * n; num++) {  
             matrix[x][y] = num;  
             if (x + xDir < 0 || y + yDir < 0 || x + xDir == n || y + yDir == n || matrix[x + xDir][y + yDir] != 0) {
                 if (yDir != 0) {
					xDir = yDir;
					yDir = 0;
				}else {
					yDir = -xDir;
					xDir = 0;
				}
             }  
             x += xDir;  
             y += yDir;  
        }
        System.out.println(Arrays.toString(matrix));
    }
}
