package nowcoder;

import java.util.Scanner;

/**
 * Created by corly on 2016/9/3.
 */
public class ArrayQueue {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int times = in.nextInt();
        int i,j;
        int front,end;
        for (i = 0; i <times ; i++) {
            int n = in.nextInt();
            int[] queue = new int[n];
            for(j=0; j<n; j++){
                queue[j] = j + 1;
            }
            front = 0;
            end = n-1;
            while(front != end){
                
            }
        }


    }
}
