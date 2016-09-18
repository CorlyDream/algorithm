package test;
import java.util.Scanner;

public class Main{
		
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int start = -90;
        int end = 90;
        int[] res = new int[6];
        int mid;
        for(int i=0; i<res.length; i++){
            mid = (start + end)/2;
            if (n<mid){
                res[i] = 0;
                end = mid;
            }else {
                res[i] = 1;
                start = mid;
            }
        }
        for(int i=0; i<res.length; i++){
            System.out.print(res[i]);
        }
        System.out.println();
    }


}
