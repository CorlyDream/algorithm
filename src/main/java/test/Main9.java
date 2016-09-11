package test;

import java.util.Scanner;

/**
 * Created by corly on 2016/9/9.
 */
public class Main9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[101];
        int[] res = new int[101];
        int len = 0;
        while (in.hasNextInt()){
            arr[len++] = in.nextInt();
        }
        int j,i;
        int count = 0;
        for(i=0; i<len; i++){
            count = 0;
            for(j=i+1; j<len; j++){
                if (arr[i]>arr[j]){
                    count++;
                }
            }
            res[i] = count;
        }
        for(i=0; i<len; i++){
            if (i == len - 1) {
                System.out.println(res[i]);
            }else {
                System.out.print(res[i]+" ");
            }
        }
    }
}
