package nowcoder;

import java.util.Scanner;

/**
 * Created by corly on 2016/9/12.
 */
public class ColorXOR {
    private int[] arr;
    private int[] res;

    public ColorXOR(int[] arr) {
        this.arr = arr;
        this.res = new int[3];
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        int i,j,k;
        for(i=0; i<n; i++) {
            arr[i] = in.nextInt();
        }
        ColorXOR color = new ColorXOR(arr);
        color.buildC(arr.length-1, 2);
    }

    public void buildC(int n, int m) {

        res[m] = arr[n];
        buildC(n-1,m-1);
        buildC(n-1, m);
    }
}
