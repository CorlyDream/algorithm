package test;

import java.util.Scanner;

/**
 * Created by corly on 2016/9/9.
 */
public class Main10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String[] strs = str.split(" ");
        int j,i;
        for(j=0; j<3; j++){
            String del = in.nextLine();
            StringBuilder sb = new StringBuilder();

            for(i=0; i<strs.length; i++){
                if (!del.equals(strs[i])){
                   sb.append(strs[i]+" ");
                }
            }
            sb.deleteCharAt(sb.length()-1);
            System.out.println(sb.toString());
        }

    }
}


