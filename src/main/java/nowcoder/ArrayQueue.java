package nowcoder;

/**
 * Created by corly on 2016/9/3.
 */
public class ArrayQueue {
    public static void main(String[] args) {


        int f1 = 1;
        int f2 = 2;
        int f3 = 4;
        int result = 0;
        for (int i = 4; i <= 10; i++) {
            result = f1 + f2 + f3;
            f1 = f2;
            f2 = f3;
            f3 = result;
        }
        System.out.println(result);
    }

}

