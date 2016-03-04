package leetcode.easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class MaximumDepthOfBinaryTree {

      public class TreeNode {
         int val;
         TreeNode left;
         TreeNode right;
        TreeNode(int x) { val = x; }
     }
      
      public int maxDepth(TreeNode root) {
          return depth(root);
      }
      
    private int depth(TreeNode node){
        if (node == null) {
            return 0;
        }
        return Math.max(depth(node.left), depth(node.right)) +1;
    }
    
    public static int maxDepth1(TreeNode root){
        int depth = 0,max=0;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode p = root;
        stack.push(p);
        while(!stack.isEmpty()){
            while(p.left != null){
                depth++;
                p = p.left;
                stack.push(p);
            }
            if(p.right != null){
                depth++;
                p = p.right;
            }else{
                if (max<depth) {
                    max = depth;
                }
                p =  stack.pop();
                depth--;
            }
        }
        return max;
    }
    
    public static void main(String[] args) {
        
    }

}
