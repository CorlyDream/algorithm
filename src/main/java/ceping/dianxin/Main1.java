package ceping.dianxin;

import java.util.Scanner;

/**
 * Created by corly on 2016/11/6.
 */
public class Main1 {


    public static boolean isPrime(int n){
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        while(in.hasNext()){
            int n=in.nextInt();
            int count=0;
            int i=0;
            for( i=2;i<=100000;i++){
                if(isPrime(i)){
                    count++;
                }
                if(count==n) break;
            }
            System.out.println(i);

        }
    }
}
