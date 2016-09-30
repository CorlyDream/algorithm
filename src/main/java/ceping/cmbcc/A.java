package ceping.cmbcc;

/**
 * Created by corly on 2016/9/19.
 */
public class A {
    public static int a = print(1);


    public int aa = print(2);

    static {
        print(3);
    }


    {


        print(4);


    }


    public A(String str) {


        System.out.println(5);


    }


    public static int print(int i) {


        System.out.println(i);


        return i;


    }

}
