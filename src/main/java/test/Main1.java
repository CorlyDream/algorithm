package test;

import java.util.Arrays;

public class Main1 {
	public static void main(String[] args) {
//		System.out.println(countPrimes(3));
		int[] a = {1,2,4,3};
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
	}
	
	public static int countPrimes(int n) {
        boolean[] notPrime = new boolean[n];
        double len = Math.sqrt(n);
        
        for(int i=2; i<len; i++){
            if(!notPrime[i]){
                for(int j=i; j*i<n; j++){
                    notPrime[i*j] = true;
                }
            }
        }
        int result = 0;
        for(int i=2; i<n; i++){
            if(!notPrime[i])
                result++;
        }
        return result;
    }

	
}
