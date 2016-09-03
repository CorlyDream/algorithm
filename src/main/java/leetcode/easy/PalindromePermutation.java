package leetcode.easy;

import java.util.Scanner;

/**
 * T266
 *
 */
public class PalindromePermutation 
{
    public static void main( String[] args )
    {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String string = in.nextLine();
            if (isPalindrome(string)) {
                System.out.println("Y");
            }else {
                System.out.println("N");
            }
        }
        System.out.println(isPalindrome("abcb"));
    }
    
    public static boolean isPalindrome(String str){
        char[] ch = str.toCharArray();
        int i = 0, j=ch.length-1;
        while(i<j){
            if (ch[i] != ch[j]) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
