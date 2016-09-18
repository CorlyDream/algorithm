package test;


import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] x = new int[n];
		int[] y = new int[n];
		int i;
		for(i=0; i<n; i++) {
			x[i] = in.nextInt();
		}
		for(i=0; i<n; i++) {
			y[i] = in.nextInt();
		}
		int min = 3000;
		for(i=0; i<n; i++) {
			int tmp = x[i]+y[i]-2;
		    min = min>tmp?tmp:min;
		}
		System.out.println(min);
	}

}
