package test;

public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head = new ListNode(1);
		head.next = new ListNode(0);
		head.next.next = new ListNode(1);
		System.out.println(isPalindrome(head));
		String string = "abcdefg";
		System.out.println(string.indexOf("abd"));
	}
	public static int reverseBits(int n) {
        String num = Integer.toBinaryString(n);
        StringBuilder sb = new StringBuilder(num);
        sb = sb.reverse();
        
        return Integer.valueOf(sb.toString(), 2);
    }
	public static class ListNode {
	      int val;
	      ListNode next;
	      ListNode(int x) { val = x; }
	 }
	public static boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null)
            return true;
        int count=0;
        ListNode p = head;
        while(p!=null){
            count++;
            p = p.next;
        }
        int half = count/2+count%2;
        ListNode curr,tmp;
        p = head;
        curr = p.next;
        p.next = null;
        int i=1;
        while(i<half){
            i++;
            tmp = curr.next;
            curr.next = p;
            p = curr;
             	
        }
        if(count%2!=0){
            p = p.next;
        }
        while(p!=null){
            if(p.val != curr.val)
                return false;
            p = p.next;
            curr = curr.next;
        }
        return true;
    }
}
