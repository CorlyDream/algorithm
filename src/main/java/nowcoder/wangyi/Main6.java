package nowcoder.wangyi;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by corly on 2017/3/25.
 */
public class Main6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        int k = in.nextInt();
//        int[] arr = new int[n];

        System.out.println(get(2));
    }


    public static List<Integer> get(int k) {
        List<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(1);
        int i,j;
        while (k > 1) {
            k--;
            j = list.size();
            for(i=1; i<j-1; i++) {
                list.add(i, list.get(i - 1) + list.get(i));
            }
        }
        return list;
    }
}
