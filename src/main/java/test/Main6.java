package test;

import java.util.Arrays;

public class Main6 {

	public static void main(String[] args) {
		int[] next = getNext("abaabcac");
		System.out.println(Arrays.toString(next));
	}
	
	public static int kmp(String source, String patten){
		int[] next = getNext(patten);
		int i=0,j=0;
		while(i<source.length() && j<patten.length()){
			if (j==-1 || source.charAt(i) == patten.charAt(j)) {
				i++;j++;
			}else{
				j = next[j];
			}
		}
		return i;
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
