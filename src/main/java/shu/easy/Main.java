package shu.easy;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			int n = in.nextInt();
			int k = in.nextInt();
			int[] data = new int[n];
			int i,j;
			for(i=0; i<n; i++){
				data[i] = in.nextInt();
			}
			Arrays.sort(data);
			int nums = n-k+1;
			double sum=0.0;
			double[] avg = new double[nums];
			for(j=0; j<k; j++){
				sum += data[j];
			}
			avg[0] = sum/(double)k;
			for(i=0; i<n-k; i++){
				sum = sum - data[i] + data[i+k];
				avg[i+1] = sum/(double)k;
			}
			double min = 99999999;
			for(i=0; i<nums; i++){
				sum = 0;
				for(j=i; j<i+k; j++){
					sum += (data[j]-avg[i])*(data[j]-avg[i]);
				}
				if (sum < min) {
					min = sum;
				}
			}
			System.out.println(String.format("%.2f", min/(double)k));
		}
	}

}
