package test;

import java.util.Arrays;

public class Main6 {

	public static void main(String[] args) {
		int[] next = getNext("abaabcac");
		System.out.println(Arrays.toString(next));
		System.out.println(Math.sqrt(3));
	}
	
	public static int[] getNext(String str){
		char[] cs = str.toCharArray();
		int[] next = new int[cs.length];
		int i=1,j=-1;
		next[0] = -1;
		while(i<cs.length-1){
			if (j==-1 || cs[i]==cs[j]) {
				i++;
				j++;
				next[i] = j;
			}else {
				j = next[j];
			}
		}
		return next;
	}

}
