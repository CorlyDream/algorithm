package test;

import java.util.Arrays;

public class Main6 {

	public static void main(String[] args) {
		String source = "abcabaaabaabcac";
		String patten = "abaabcac";
		int[] next = getNext(patten);
		System.out.println(Arrays.toString(next));
		System.out.println(kmp(source, patten));
	}
	
	public static int kmp(String source, String patten){
		System.out.println(source.indexOf(patten));
		int[] next = getNext(patten);
		int i=0,j=0;
		while(i<source.length() && j<patten.length()){
			if (j==-1 || source.charAt(i) == patten.charAt(j)) {
				i++;j++;
			}else{
				j = next[j];
			}
		}
		return j==patten.length()?i-j:-1;
	}
	
	public static int[] getNext(String str){
		char[] cs = str.toCharArray();
		int[] next = new int[cs.length];
		int i=0,j=-1;
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
