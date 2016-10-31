package ceping.wacai;

/**
 * Created by corly on 2016/10/17.
 */
public class Main2  {
    static boolean out(char c) {
        System.out.print(c);
        return true;
    }
    public static void main(String[] argv) {
        int i = 0;
        for (out('A'); out('B') && (i < 2); out('C')) {
            i++;
            out('D');
        }
    }
}
