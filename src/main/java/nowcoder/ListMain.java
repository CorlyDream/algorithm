package nowcoder;

public class ListMain {

    public static void main(String[] args) {
        ListNode root = new ListNode(1);
        root.next = new ListNode(2);
        root.next.next  = new ListNode(3);
        System.out.println(postPrint(10, root));
    }

    public static String postPrint(int n, ListNode root) {
        StringBuilder sb = new StringBuilder();
        int i=0;
        ListNode p = root;
        while (i < n && p != null) {
            sb.insert(0, ","+p.value);
            p = p.next;
            i++;
        }
        if (sb.length() > 0) {
            return sb.deleteCharAt(0).toString();
        }
        return "";
    }

    public static class ListNode {
        int value;
        ListNode next;
        ListNode(int x) { value = x; }
    }
}
