package ceping.feixun;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by corly on 2016/10/15.
 */
public class Main2 {
    public static int exam(String ptrn, String str) {
        char[] aPtrn = ptrn.toCharArray();
        String[] aStr = str.split(" ");
        if (aPtrn.length != aStr.length) {
            return 0;
        }
        int[] posPtr = new int[255];
        Map<String, Integer> posStr = new HashMap<>();
        int i;
        for(i=1; i<aPtrn.length; i++) {
            if (posStr.get(aStr[i]) == null) {
                posStr.put(aStr[i], 0);
            }
            if (posPtr[aPtrn[i]] != posStr.get(aStr[i])) {
                return 0;
            }
            posPtr[aPtrn[i]] = i+1;
            posStr.put(aStr[i], i + 1);
        }
        return 1;
    }

    public static void main(String[] args) {
        String ptrn = "okko";
        String str = "apple pear pear apple";
        System.out.println(exam(ptrn, str));
    }
}
