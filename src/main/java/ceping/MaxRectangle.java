package ceping;

import java.util.Scanner;

/**
 * Created by corly.cc on 2016/9/11.
 */
public class MaxRectangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String dataStr = in.nextLine();
        String[] arrStr = dataStr.split(" ");
        int max = 0;
        int[] stack = new int[arrStr.length];
        int top = -1;
        stack[++top] = Integer.parseInt(arrStr[0]);
        int min = stack[top];
        for(int i=1; i<arrStr.length; i++){
            int high = Integer.parseInt(arrStr[i]);
            if (stack[top]<=high){
                stack[++top] = high;
            }else{
                int area = min*(top+1);
                if (max < area) {
                    max = area;
                }
                while (stack[top]>high){
                    top--;
                }
            }
        }
        System.out.println(max);
    }
}
