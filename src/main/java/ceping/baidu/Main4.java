package ceping.baidu;

import java.util.Scanner;

/**
 * Created by corly on 2017/4/27.
 三维空间中有N个点，每个点可能是三种颜色的其中之一，三种颜色分别是红绿蓝，分别用'R', 'G', 'B'表示。
 现在要找出三个点，并组成一个三角形，使得这个三角形的面积最大。
 但是三角形必须满足：三个点的颜色要么全部相同，要么全部不同。
 输入描述:
 首先输入一个正整数N三维坐标系内的点的个数.(N <= 50)

 接下来N行，每一行输入 c x y z，c为'R', 'G', 'B' 的其中一个。x，y，z是该点的坐标。(坐标均是0到999之间的整数)
 
 输出描述:
 输出一个数表示最大的三角形面积，保留5位小数。

 输入例子:
 5
 R 0 0 0
 R 0 4 0
 R 0 0 3
 G 92 14 7
 G 12 16 8

 输出例子:
 6.00000
 */
public class Main4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Point[] points = new Point[n];
        int i,j;
        for(i=0; i<n; i++) {
            points[i] = new Point(in.next().charAt(0), in.nextInt(), in.nextInt(), in.nextInt());
        }
        System.out.println(points);
        
    }
    
    public static class Point{
        public char color;
        public int x;
        public int y;
        public int z;

        public Point(char color, int x, int y, int z) {
            this.color = color;
            this.x = x;
            this.y = y;
            this.z = z;
        }

    }
}
