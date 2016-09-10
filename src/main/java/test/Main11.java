package test;

/**
 * Created by corly on 2016/9/9.
 */
public class Main11 {
    public static void main(String[] args) {
        String s1 = "abc" + "def";
        String s2 = new String(s1);
        if (s1 == s2) {
            System.out.println(1);
        }
        if (s1.equals(s2)) {
            System.out.println(2);
        }
    }
}
