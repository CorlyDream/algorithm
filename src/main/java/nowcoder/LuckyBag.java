package nowcoder;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by corly on 2016/9/12.
 */
public class LuckyBag {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int i, j;
        int[] nums = new int[n];
        for (i=0; i<n; i++) {
            nums[i] = in.nextInt();
        }
        Arrays.sort(nums);
        int sum = 0;
        int multi = 1;
        for(i=0; i<n; i++) {
            sum += nums[i];
            multi *= nums[i];
        }
        int res = 0;
        for (i=n-1; i>0; i--) {
            if (sum>multi)
                res++;
            sum -= nums[i];
            multi /= nums[i];
        }
        System.out.println(res);
    }
}
