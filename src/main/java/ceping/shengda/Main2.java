package ceping.shengda;

import java.util.Scanner;

/**
 * Created by corly on 2016/9/21.
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            System.out.println(in.nextInt()+in.nextInt());
        }
    }
}
