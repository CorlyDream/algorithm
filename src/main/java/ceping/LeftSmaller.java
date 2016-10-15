package ceping;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by corly.cc on 2016/9/10.
 */
public class LeftSmaller {

    private int[] nums;
    private int[] segTree;

    public LeftSmaller(int n) {
        this.nums = new int[n+1];
        this.segTree = new int[3*n];
    }

    private void build(int root, int start, int end) {

        if (start == end) {
            segTree[root] = nums[start];
            return;
        }

        int mid = (start+end)>>1;
        build(2*root, start, mid);
        build(2*root + 1,mid+1, end);
        segTree[root] = Math.min(segTree[2 * root], segTree[2 * root+ 1]);
    }

    public void readNums(Scanner in){
        for(int i=1; i<nums.length; i++) {
            nums[i] = in.nextInt();
        }
        build(1, 1, nums.length-1);
    }

    public void print() {
        System.out.println(Arrays.toString(segTree));
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        LeftSmaller ls = new LeftSmaller(n);
        ls.readNums(in);
        ls.print();
        int i,j;
        for (i=0; i<n; i++) {

        }

    }
}
