package nowcoder.wangyi;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by corly on 2017/3/25.
 */
public class Main5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] task = new int[n];
        int i;
        for(i=0; i<n; i++) {
            task[i] = in.nextInt();
        }
        Arrays.sort(task);

    }
}
