package ceping.morgan;

/**
 * Created by corly on 2016/10/30.
 */
public class IkmTest {
    public static void main (String [] args) {
        Storage s1 = new Storage(2, 4);
        Storage s2 = new Storage(6, 8);
        System.out.println(s1.data1 + ", " + s1.data2);
        System.out.println(s2.data1 + ", " + s2.data2);
        s1.modify(s1.data1);
        s2.modify(s1.data1);
        System.out.println(s1.data1 + ", " + s1.data2);
        System.out.println(s2.data1 + ", " + s2.data2);
        int modifier = 2;
        s1.modify(modifier);
        s2.modify(modifier);
        System.out.println(s1.data1 + ", " + s1.data2);
        System.out.println(s2.data1 + ", " + s2.data2);
    }
}
