package nowcoder.wangyi;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by corly on 2016/9/12.
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int n = scanner.nextInt();
            int [] a = new int[n];
            for (int i=0;i<n;i++){
                a[i] = scanner.nextInt();
            }

            Arrays.sort(a);
            if (n<3){
                int res = 1;
                for (int i=0;i<n;i++){
                    res *= a[i];
                }
                System.out.println(res);
                return;
            }

            int max = Integer.MIN_VALUE;
            if(max<a[0]*a[n-1]*a[n-2]){
                max = a[0]*a[n-1]*a[n-2];
            }
            if(max < a[0]*a[1]*a[n-1]) {
                max = a[0]*a[1]*a[n-1];
            }
            if(max < a[0]*a[1]*a[2]){
                max = a[0]*a[1]*a[2];
            }
            if(max < a[n-1]*a[n-2]*a[n-3]) {
                max = a[n-1]*a[n-2]*a[n-3];
            }
            System.out.println(max);

//            if (a[n-1]<0){
//                System.out.println(a[n-1]*a[n-2]*a[n-3]);
//            }else if (a[0]>0){
//                System.out.println(a[n-1]*a[n-2]*a[n-3]);
//            }else{
//                int max = Integer.MIN_VALUE;
//                if(max<a[0]*a[n-1]*a[n-2]){
//                    max = a[0]*a[n-1]*a[n-2];
//                }
//                if(max < a[0]*a[1]*a[n-1]) {
//                    max = a[0]*a[1]*a[n-1];
//                }
//                if(max < a[0]*a[1]*a[2]){
//                    max = a[0]*a[1]*a[2];
//                }
//                if(max < a[n-1]*a[n-2]*a[n-3]) {
//                    max = a[n-1]*a[n-2]*a[n-3];
//                }
//                System.out.println(max);
//
//            }
        }
    }
}
