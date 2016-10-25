package ceping.wacai;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by corly on 2016/10/17.
 */
public class Main2 {
    public static void main(String[] args) {
        String test = "this is only a test,hello。hello";
        String[] arr = test.split("[ |,|。]");
        Map<String, Integer> map = new HashMap<>();
        Integer n;
        for(int i=0; i<arr.length; i++) {
            if ((n = map.get(arr[i])) != null) {
                map.put(arr[i], n + 1);
            } else {
                map.put(arr[i], 1);
            }
        }
        for (String str : map.keySet()) {
            System.out.println(str+"--"+map.get(str));
        }
    }
}
