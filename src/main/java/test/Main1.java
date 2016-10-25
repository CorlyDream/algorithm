package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main1 {

	protected String main1 = "main1";

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
	    int i,j;
		boolean[] arrTemp = new boolean[1000];
		for (i=2; i<100; i++){
			if(!arrTemp[i]){
				for(j=i; j*i<arrTemp.length; j++){
					arrTemp[i*j] = true;
				}
			}
		}
		List<Integer> primes = new ArrayList<>();
		for(i=0; i<arrTemp.length; i++){
			if(!arrTemp[i])
				primes.add(i);
		}
		int count = 0;
		for(i=0; i<primes.size(); i++){
			for(j=0; j<primes.size(); j++){
				if (primes.get(i)+primes.get(j)==n){
					count++;
				}
			}
		}
		System.out.println((int)(Math.ceil(count/2.0)));
	}
	


	
}

