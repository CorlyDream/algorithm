package test;
import java.util.Scanner;

public class Main{
		
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
        	StringBuffer stringBuffer = new StringBuffer();
        	int n = in.nextInt();
        	for(int i=0; i<n; i++){
        		int k = in.nextInt();
        		if(k%2==0){
        			stringBuffer.append(reverse(k)+" ");
        		}else{
        			stringBuffer.append(k+" ");
        		}
        	}
        	stringBuffer.deleteCharAt(stringBuffer.length()-1);
        	System.out.println(stringBuffer.toString());
        }
    }
    
    public static int reverse(int a){
        int res = 0;
        while(a>0){
            res = res<<1;
            res += a&1;
            a = a>>1;
        }

        return res;
    }
}