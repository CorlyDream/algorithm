package leetcode.easy;

public class AddDigits {
    
    public static int addDigits(int num) {
        return ((num-1) % 9 )+1;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println(addDigits(38));
    }

}
