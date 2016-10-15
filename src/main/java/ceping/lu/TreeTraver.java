package ceping.lu;

import java.util.Stack;

/**
 * Created by corly on 2016/10/11.
 */
public class TreeTraver {
    public static String postTraver(Node p){
        Stack<Node> s = new Stack<>();
        StringBuilder sb = new StringBuilder();//保存遍历的结果
        while (!s.isEmpty() || p != null) {
            if (p != null) {
                s.push(p);
                sb.insert(0, p.val);
                p = p.right;
            }else{
                p = s.pop().left;
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        /**
         * test
         *          1
         *         /
         *        2
         *       /  \
         *      3    4
         */
        Node n3 = new Node("3");
        Node n4 = new Node("4");
        Node n2 = new Node("2", n3, n4);
        Node n1 = new Node("1", n2, null);
        System.out.println(postTraver(n1));
    }

    static class Node{
        String val;
        Node left;
        Node right;

        public Node(String val, Node left, Node right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }

        public Node(String val) {
            this.val = val;
        }
    }
}
