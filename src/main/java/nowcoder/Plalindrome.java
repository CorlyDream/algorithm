package nowcoder;

import java.util.Scanner;

/**
 * Created by corly on 2016/9/12.
 */
public class Plalindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StringBuilder a = new StringBuilder(in.nextLine());
        String b = in.nextLine();
        int i;
        int count = 0;
        for(i=0;i<=a.length(); i++) {
            a.insert(i, b);
            if (a.toString().equals(a.reverse().toString())){
                count++;
            }else
                a.reverse();
            a.delete(i, b.length()+i);
        }
        System.out.println(count);
    }
}
