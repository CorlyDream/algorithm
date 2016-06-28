package test;

public class Main2 {

	public static void main(String[] args) {
		System.out.println(isPalindrome1(123));
	}
	public static boolean isPalindrome(int x) {
		if(x<0 || (x>0 && x%10==0))
            return false;
        int sum = 0;
        while(x>sum){
            sum = sum*10 + sum%10;
            x /= 10;
        }
        return (sum == x || x == sum/10);
    }
	
	public static boolean isPalindrome1(int x) {
	    if (x<0 || (x!=0 && x%10==0)) return false;
	    int rev = 0;
	    while (x>rev){
	        rev = rev*10 + x%10;
	        x = x/10;
	    }
	    return (x==rev || x==rev/10);
	}
}
