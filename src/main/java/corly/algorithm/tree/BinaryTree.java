package corly.algorithm.tree;

import java.util.Stack;

/**
 * Created by corly on 2016/10/11.
 */
public class BinaryTree {
    public static void postOrderStack(Node p){
        Stack<Node> stack=new Stack<Node>();
        Node q=p;//q,is the latest Node that has been visited  
        while(p!=null){
            while(p.left!=null){
                stack.push(p);
                p=p.left;
            }  
            /* 
             while(p!=null){//wrong.when 'while' ends,p=null 
                stack.push(p); 
                p=p.left; 
            } 
             */
            while(p!=null&&(p.right==null||p.right==q)){
                visit(p);
                q=p;
                if(stack.isEmpty())return;
                p=stack.pop();
            }
            stack.push(p);
            p=p.right;
        }
    }

    public static void visit(Node p) {
        System.out.print(p.val+",");
    }

    public static void main(String[] args) {
        Node p3 = new Node(3);
        Node p4 = new Node(4);
        Node p2 = new Node(2, p3, null);
        Node root = new Node(1, p2, null);
        postOrderStack(root);
    }
    
    static class Node{
        int val;
        Node left;
        Node right;

        public Node(int val, Node left, Node right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }

        public Node(int val) {
            this.val = val;
        }
    }
}
