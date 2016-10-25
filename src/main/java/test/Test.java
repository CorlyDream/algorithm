package test;

/**
 * Created by corly on 2016/8/7.
 */
public class Test {
    private static int x;
    private int y;
    static {
        x = 1;
    }

    public static void print(){
        System.out.println(x);

    }

    public static void main(String[] args) {
//        int a = 0xa;
//        int i = 2;
//        System.out.println(i&0xa);
//        int num = 131072;
//        boolean b = (i & 0xaaaa) == 0 ?true:false;
//        System.out.println();
//        ArrayList<Integer> list = new ArrayList<>();
//        list.add(3);
//        System.out.println(list.get(1));
        int i = 3;
        i = 2<<i;
        System.out.println(i);
    }
}
