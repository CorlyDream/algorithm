package test;

import java.util.Scanner;

public class Main7 {

	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    
	    while(in.hasNext()){
	      	int n = in.nextInt();
	      	int times = 1;
	      	int money = 1;
	      	for(int i=2; i<=n; ){
	          if(i+times<=n)
	          	money += times;
	          else{
	        	  money += n-i+1;
	        	  break;
	          }
	          i += times;
	          if(i>n)
	            break;
	          money--;
	          i++;
	          times++;
	        }
	      	System.out.println(money);
	    }
	}

}
