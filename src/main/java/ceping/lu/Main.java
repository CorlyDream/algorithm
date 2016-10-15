package ceping.lu;

/**
 * Created by corly on 2016/10/10.
 */
public class Main {
    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        a ^= b;
        b ^= a;
        a ^= b;
        System.out.println("a="+a+",b="+b);
        Integer aa = 10;
        long bb = aa;
        int bb2 = aa;
        Long bb4 = (long)aa;
        boolean result = "abcab".replace("ab", "12").equals("abcab".replaceAll("ab", "12"));
        System.out.println("abcab".replace("ab", "12"));
        System.out.println(Math.sqrt(100));
    }
}
