package test;

/**
 * Created by corly on 2016/9/9.
 */
import java.util.Scanner;
public class Main11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        String[] strs = new String[n];
        int i;
        for(i=0; i<n; i++){
            strs[i] = in.nextLine();
        }
        boolean dic = dicSort(strs);
        boolean len = lenSort(strs);
        if(dic && len){
            System.out.println("both");
        }else if(dic){
            System.out.println("lexicographically");
        }else if(len){
            System.out.println("lengths");
        }else{
            System.out.println("none");
        }
    }

    public static boolean dicSort(String[] strs){
        int i;
        for(i=1; i<strs.length; i++){
            if(strs[i-1].compareTo(strs[i]) > 0)
                return false;
        }
        return true;
    }

    public static boolean lenSort(String[] strs){
        for(int i=1; i<strs.length; i++){
            if(strs[i-1].length()>strs[i].length())
                return false;
        }
        return true;
    }
}
