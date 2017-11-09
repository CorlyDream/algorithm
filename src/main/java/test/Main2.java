package test;


import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int res = -1;
		int count=0;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= m; j++) {
				if ((res = count(i, j)) > 0) {
					count++;
				}
			}
		}
		System.out.println(count);

	}

	public static int count(int a, int b) {
		double res = Math.sqrt(a*b);
//    System.out.println(a+"--"+b+":"+res);
		int ret = (int) res;
		if (ret == res) {
			return ret;
		}
		return -1;
	}

}

