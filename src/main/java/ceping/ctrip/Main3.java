package ceping.ctrip;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by corly on 2016/9/17.
 */
public class Main3 {
    public static final int INF = Integer.MAX_VALUE;
    public static int[][] g;
    public static int maxv;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        maxv = n;
        int i,j;
        g = new int[n][n];
        in.nextLine();
        for (i=0; i<n; i++) {
            String[] strs = in.nextLine().split(",");
            for(j=0; j<n; j++) {
                g[i][j] = Integer.valueOf(strs[j]);
            }
        }

        System.out.println(Arrays.toString(dijkstra(0)));

    }


    public static int[] dijkstra(int v){
        int[] dis = new int[maxv];
        int path[] = new int[maxv];
        int s[] = new int[maxv];
        int mindis,i,j,u = 0;
        for(i=0; i< g.length;i++) {
            dis[i] = g[v][i];
            s[i] = 0;
            path[i] = -1;
        }
        s[v] = 1;
        path[v]= 0;
        for (i=0; i<g.length; i++) {
            mindis = INF;
            for(j=0; j<g.length; j++) {
                if (s[j] == 0 && dis[j] < mindis) {
                    u = j;
                    mindis = dis[j];
                }
            }
            s[u] = 1;
            for(j=0; j<g.length; j++) {
                if (s[j] == 0) {
                    if (g[u][j]<INF && dis[u]+g[u][j]<dis[j]){
                        dis[j] = dis[u] + g[u][j];
                        path[j] = u;
                    }
                }
            }
        }
        return path;
    }
}
