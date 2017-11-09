package ceping.oracle;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by corly on 2016/11/3.
 */
public class Main1 {
    public static void main(String[] args) throws IOException {
        int x;
        x = -4>>1;
        x = x>>>2;
        System.out.println(x);
        x = x<<2;
        String s = new String("ggg");
        s += "ss";
        byte buffer[] = {'a', 'b', 'c'};
        InputStream inputStream = new ByteArrayInputStream(buffer);
        inputStream.read();
        inputStream.skip(1);
        System.out.println((char)inputStream.read());
    }
}
