package test;

import java.util.Arrays;
import java.util.Random;

public class Main {
	private int[] hotelID = new int[1000];
	public Main() {
	}
	public static void main(String[] args) {
		int[] a = {3,4,1,6,8};
		System.out.println(Arrays.toString(getM(a, 3)));
	}
	
	public static int[] getM(int[] a,int m){
		int[] b = new int[m];
		int i,j,max;
		
		for(i=0; i<m; i++){
			b[i] = a[i];
		}

		for(i=m; i<a.length; i++){
			max = 0;
			for(j=1; j<b.length; j++){
				if (b[max] < b[j]) {
					max = j;
				}			
			}
			if (b[max] > a[i]) {
				b[max] = a[i];
			}
		}
		return b;
	}
}
