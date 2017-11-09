package nowcoder.wangyi;

import java.util.Scanner;

/**
 * Created by corly on 2017/3/25.
 */
public class Main4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        char[] cs = line.toCharArray();
        int count = 0;
        int i=1,j=cs.length-1;
        while (i < j) {
            while (i < j && cs[i] == cs[0]) {
                i++;
            }
            while (i < j && cs[0] != cs[j]) {
                j--;
            }
            count+=j-i;
            i++;j--;
        }
        int count1 = 0;
        i=0;
        j=cs.length-2;
        while (i < j) {
            while (i < j && cs[cs.length-1] == cs[j]) {
                j--;
            }

            while (i < j && cs[i] != cs[cs.length-1]) {
                i++;
            }

            count1+=j-i;
            i++;j--;
        }
        count = count<count1?count:count1;
        System.out.println(count);
    }
}
