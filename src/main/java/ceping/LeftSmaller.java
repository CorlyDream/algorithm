package ceping;

import java.util.Scanner;

/**
 * Created by corly.cc on 2016/9/10.
 */
public class LeftSmaller {

    private int[] nums;
    private int[] segTree;

    public LeftSmaller(int n) {
        this.nums = new int[n];
    }

    public void readNums(Scanner in){
        for(int i=0; i<nums.length; i++) {
            nums[i] = in.nextInt();
        }
    }

    private void build(int start, int end) {

        int mid = (start+end)>>1;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        LeftSmaller ls = new LeftSmaller(n);
        ls.readNums(in);
        int i,j;
        for (i=0; i<n; i++) {

        }

    }
}
