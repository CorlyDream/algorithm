package nowcoder.wangyi;

import java.util.Scanner;

/**
 * Created by corly on 2016/9/12.
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        System.out.println(rev(rev(x)+rev(y)));
    }
    public static int rev(int x)    {
        int result = 0;

        while (x != 0)
        {
            int tail = x % 10;
            int newResult = result * 10 + tail;
            if ((newResult - tail) / 10 != result){
                return 0;
            }
            result = newResult;
            x = x / 10;
        }

        return result;
    }
}
