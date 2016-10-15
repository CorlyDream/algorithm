package nowcoder.didi;

import java.util.Scanner;


/**
 * Created by corly on 2016/9/18.
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int num = 0;
        for(int i=1; i<=n; i++) {
            int j = i;
            while (j % 5 == 0) {
                num++;
                j/=5;
            }
        }
        System.out.println(num);
    }
}
