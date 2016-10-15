package ceping.qiniu;

/**
 * Created by corly on 2016/9/24.
 */
public class Main3 {
    //链表结构
    static class Node{
        int value;
        Node next;
    }

    // 存放循环点
    private Node circleNode = null;
    private int circleLen = 0;
    //判断链表是否有环
    public boolean hashCircle(Node head) {
        Node slow,fast;
        slow = fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow) {
                circleNode = fast;
                circleLen(); // 计算环的长度
                return true;
            }
        }
        return false;
    }
    // 计算环的长度
    private void circleLen(){
        Node tmp = circleNode.next;
        while (tmp != circleNode) {
            this.circleLen++;
            tmp = tmp.next;
        }
        this.circleLen++;
    }

    public Node getCircleNode() {
        return circleNode;
    }

    public int getCircleLen() {
        return circleLen;
    }

    public static void main(String[] args) {
        //test
        Main3 m = new Main3();
        Node list = new Node();
        Node p,q;
        p = new Node();
        q = new Node();
        p.next = q;
        q.next = list;
        list.next = p;
        boolean flag = m.hashCircle(list);
        if (flag) {
            System.out.println(m.getCircleLen());
        }else {
            System.out.println("nullptr");
        }
    }
}
