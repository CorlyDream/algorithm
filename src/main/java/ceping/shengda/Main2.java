package ceping.shengda;

import java.util.Scanner;

/**
 * Created by corly on 2016/9/28.
 */
public class Main2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        String[] tmp;
        int pre = -1;
        int prepre = -1;
        int curr = 0;
        while (in.hasNextLine()) {
            tmp = in.nextLine().split(" ");
            if (tmp[0].equals("1"))
                break;
            curr = tmp.length-1;
            if (pre < curr) {
                sb.append(tmp[curr]+"(");
            } else if (pre == curr){
                sb.deleteCharAt(sb.length() - 1);
                sb.append(","+tmp[curr]+")");
            }else {
                if (pre > prepre && pre > curr) {
                    sb.deleteCharAt(sb.length() - 1);
                    sb.append("),"+tmp[curr] + "(");
                }else
                    sb.append("," + tmp[curr] + "(");
            }
            prepre = pre;
            pre = curr;
        }
        while (pre>0){
            sb.deleteCharAt(sb.length() - 1);
            sb.append(")");
            pre--;
        }
        System.out.println(sb.toString());
    }

}

