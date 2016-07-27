package test;

import java.awt.List;
import java.util.HashMap;
import java.util.Map;

/**
 * @author MengShuang 
 * @Date 2016年6月8日 下午12:22:25
 */
public class Main2 {
	
	public static void main(String[] args) {
		System.out.println(wordPattern(args[0], args[1]));
	}
	public static boolean wordPattern(String pattern, String str) {
        Map<Character, Integer> map1 = new HashMap<Character, Integer>();
        Map<String, Integer> map2 = new HashMap<String, Integer>();
        String[] arr = str.split(" ");
        if(arr.length != pattern.length())
            return false;
        for(int i=0; i<arr.length; i++){
        	 if( map1.get(pattern.charAt(i)) != map2.get(arr[i])){
        		 if (map1.get(pattern.charAt(i)) !=null && map2.get(arr[i]) !=null) {
     				if (!map1.get(pattern.charAt(i)).equals( map2.get(arr[i]))) {
     					return false;
     				}
     			}else
     				return false;
             }
        	 
            map1.put(pattern.charAt(i), i+1);
            map2.put(arr[i], i+1);
        }
        return true;
    }
}
