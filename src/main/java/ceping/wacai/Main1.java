package ceping.wacai;

/**
 * Created by corly on 2016/10/17.
 */
public class Main1 {
    public class B{}
    public static void main(String[] args) {
        String s = "hello";
        String t = "hello";
        char c[] = {'h', 'e', 'l', 'l', 'o'};

        System.out.println(t.equals(c));

        String str1 = "hello";
        String str2 = "he" + new String("llo");
        String str3 = "he" + "llo";
        System.out.println(str1 == str2);
        System.out.println(str1 == str3);
    }
}
