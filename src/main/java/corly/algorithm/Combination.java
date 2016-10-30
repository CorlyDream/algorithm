package corly.algorithm;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by corly on 2016/10/28.
 */
public class Combination {
    public static void main(String[] args) {
        long s = System.currentTimeMillis();
        System.out.println(combine(1000, 100));
        System.out.println(-s+System.currentTimeMillis());
    }
    public static List<List<Integer>> combine(int n, int k) {
        if (k == n || k == 0) {
            List<Integer> row = new LinkedList<>();
            for (int i = 1; i <= k; ++i) {
                row.add(i);
            }
            return new LinkedList<>(Arrays.asList(row));
        }
        List<List<Integer>> result = combine(n - 1, k - 1);
        result.forEach(e -> e.add(n));
        result.addAll(combine(n - 1, k));
        return result;
    }
}
