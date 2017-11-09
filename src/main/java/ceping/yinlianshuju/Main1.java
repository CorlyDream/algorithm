package ceping.yinlianshuju;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by corly on 2017/3/23.
 */
public class Main1 {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        Son s = new Son();
        System.out.println(s.getName());
        String str = null;

        FileOutputStream f = new FileOutputStream("test.txt", true);
        byte[] bs = "ABCDE".getBytes();
        try {
            f.write(bs);
        } catch (IOException e) {
            e.printStackTrace();
        }
        f.close();

    }

    public static class Son extends Father {
        private String name = "tes";

    }


    public static class Father{
        private String name = "Fa";

        public String getName() {
            return name;
        }
    }
}
