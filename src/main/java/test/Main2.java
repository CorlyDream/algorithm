package test;


import java.io.IOException;

public class Main2 {

	private static class A{
		int i=0;

		public A() {
			i = 2;
		}
	}

	public static class B extends A{
		public B(){
			i=4;
		}
		public void print(){
			System.out.println(i);
		}
	}

	public static void main(String[] args) throws IOException {
		System.out.println(maxCommanFactor(2,60));
	}

	public static int maxCommanFactor(int a, int b){
		int i;
		int gap = b/a;
		int[] fac = getFactors(gap);
		i=0;
		while (fac[i]>0){
			i++;
		}

		return (int)(Math.pow(2, i+1)-2);
	}


	public static int[] getFactors(int n){
		int j=0;
		int[] res = new int[100];
		for(int i=2; i<=Math.sqrt(n); i++){
			while(n%i==0){
				res[j++] = i;
				n = n/i;
			}
		}
		return res;
	}

}
