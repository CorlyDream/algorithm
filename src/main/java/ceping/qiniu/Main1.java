package ceping.qiniu;

import java.util.Scanner;
<<<<<<< HEAD

/**
 * Created by corly on 2016/9/30.
=======
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**^\s\{
 * Created by corly on 2016/9/24.
>>>>>>> 951833c98ff59861945b3969495d928e6d595de6
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
<<<<<<< HEAD
        int[] a = new int[1000];
        long pre = 1;
        long curr= 1;
        int res  = 0;
        long tmp;
        for(int i=3; i<=1000; i++) {
            tmp = curr;
            curr = pre + curr;
            pre = tmp;
            if (curr % 7 == 0) {
                res++;
            }

        }
        System.out.println(res);
    }
=======
        StringBuilder sb = new StringBuilder();
        String pattern1 = "\"\\w+\": *\"\\w+\",";
        String pattern2 = "\"\\w+\": *\\[(.*)\\]";
        String pattern3 = "\"\\w+\": *\\{\\s";
        Pattern r2 = Pattern.compile(pattern2);
        Pattern r1 = Pattern.compile(pattern1);
        Pattern r3 = Pattern.compile(pattern3);
        while (in.hasNextLine()) {
            String str = in.nextLine();
            Matcher m1 = r1.matcher(str);
            Matcher m2 = r2.matcher(str);
            Matcher m3 = r3.matcher(str);
            if (m1.find()) {
                sb.append(m1.group());
            } else if (m2.find()) {
                sb.append(m2.group());
            } else if (m3.find()) {
                sb.append(m3.group());
            } else if (str.trim().equals("{") || str.trim().equals("}")) {
                sb.append(str);
            }
        }
        System.out.println(sb.toString());
    }


>>>>>>> 951833c98ff59861945b3969495d928e6d595de6
}
