package nowcoder.wangyi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by corly on 2016/9/12.
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        List<Integer> list = new ArrayList<>(n);
        int i,j;
        for(i=0; i<n; i++) {
            list.add(in.nextInt());
        }
        int count = 0;
        i = 0;
        j = n-1;
        while (i<j){
            if (list.get(i)>list.get(j)) {
                list.set(j - 1, list.get(j) + list.get(j - 1));
                list.remove(j);
                count++;

            } else if (list.get(i)<list.get(j)) {
                list.set(i + 1, list.get(i) + list.get(i + 1));
                list.remove(i);
                count++;
            }else{
                i++;
            }
            j--;
        }
        System.out.println(count);
    }
}
