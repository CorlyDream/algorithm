package test;

import java.util.Arrays;

public class Main6 {

	public static void main(String[] args) {
		int[] next = getNext("abaabcac");
		System.out.println(Arrays.toString(next));
	}
	
	public static int[] getNext(String str){
		char[] cs = str.toCharArray();
		int[] next = new int[cs.length+1];
		int i=1,j=0;
		while(i<cs.length){
			if (j==0 || cs[i]==cs[j]) {
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
