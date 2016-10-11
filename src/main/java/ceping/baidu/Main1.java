package ceping.baidu;

import java.util.Arrays;

/**
 * Created by corly on 2016/9/29.
 */
public class Main1 {

    public static void main(String[] args) {


    }

    public static int isTree(int[][] grid)
    {
        // INSERT YOUR CODE HERE
        int i,j;
        int edges[][];
        for(i=0; i<grid.length; i++) {
            for(j=i+1;j<grid[i].length; j++) {

            }
        }
        return 1;
    }

    public static boolean validTree(int n, int[][] edges) {
        // initialize n isolated islands
        int[] nums = new int[n];
        Arrays.fill(nums, -1);

        // perform union find
        for (int i = 0; i < edges.length; i++) {
            int x = find(nums, edges[i][0]);
            int y = find(nums, edges[i][1]);

            // if two vertices happen to be in the same set
            // then there's a cycle
            if (x == y) return false;

            // union
            nums[x] = y;
        }

        return edges.length == n - 1;
    }

    static int find(int nums[], int i) {
        if (nums[i] == -1) return i;
        return find(nums, nums[i]);
    }
}
