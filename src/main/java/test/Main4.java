package test;

import java.util.Scanner;

public class Main4 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] strs = {"a","b"};
//		System.out.println(longestCommonPrefix(strs));
		String aString = "11";
		String bString = "1";
		int a = Integer.valueOf(aString, 2);
		int b = Integer.valueOf(bString, 2);
		System.out.println(Integer.toBinaryString(a+b));
	}
	public static String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0)    return "";
        String pre = strs[0];
        StringBuffer sb = new StringBuffer();
        int i = 1;
        while(i < strs.length){
            while(strs[i].indexOf(pre) != 0)
                pre = pre.substring(0,pre.length()-1);
            i++;
        }
        return pre;
    }
}
