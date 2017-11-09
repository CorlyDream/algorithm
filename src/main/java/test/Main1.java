package test;

import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
	   	int m = in.nextInt();
	   	int res = -1;
	   	int count=Math.min(n, m);
	   	int min = count;
        int max = Math.max(n, m);
        for (int i = 1; i <= min; i++) {
			for (int j = i+1; j <= max; j++) {
				if ((res = count(i, j)) > 0) {
				    if(j<= min)
				        count += 2;
				    else
				        count++;
				}
			}
//			System.out.println("count="+count);
		}
		System.out.println(count);

	}

	public static int count(long a, long b) {
		double res = Math.sqrt(a*b);
//		System.out.println(a+"--"+b+":"+res);
		int ret = (int) res;
		if (ret == res) {
			return ret;
		}
		return -1;
	}
	
}

