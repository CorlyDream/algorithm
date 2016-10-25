package ceping.feixun;

import java.util.*;

/**
 * Created by corly on 2016/10/15.
 */
public class Main2 {
    public static int exam(String ptrn, String str) {
        char[] aPtrn = ptrn.toCharArray();
        String[] aStr = str.split(" ");
        if (aPtrn.length != aStr.length) {
            return 0;
        }
        int[] posPtr = new int[255];
        Map<String, Integer> posStr = new HashMap<>();
        int i;
        for(i=1; i<aPtrn.length; i++) {
            if (posStr.get(aStr[i]) == null) {
                posStr.put(aStr[i], 0);
            }
            if (posPtr[aPtrn[i]] != posStr.get(aStr[i])) {
                return 0;
            }
            posPtr[aPtrn[i]] = i+1;
            posStr.put(aStr[i], i + 1);
        }
        return 1;
    }

    public static void main(String[] args) {
//        String ptrn = "okko";
//
//        String str = "apple pear pear apple";
//        StringBuilder sb = new StringBuilder(ptrn);
//        sb.delete(sb.lastIndexOf("kk"),sb.lastIndexOf("kk")+2 );
//        System.out.println(sb);
//        System.out.println(System.getProperty("user.dir"));
//        System.out.println(exam(ptrn, str));
        TreeNode a = new TreeNode("A");
        TreeNode b = new TreeNode("B");
        TreeNode c = new TreeNode("C");
        a.left = b;
        a.right = c;
        List<String> res  =rightSideView(a);
        for (String str : res) {
            System.out.println(str);
        }
    }

      public static class TreeNode {
          String val;
          TreeNode left;
          TreeNode right;
          TreeNode[] childs;
          TreeNode(String x) { val = x; }
      }


    public static List<String> rightSideView(TreeNode root) {
        List<String> res = new LinkedList<>();
        if(root == null)
            return res;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int i,n;
        while(!queue.isEmpty()){
            n = queue.size();
            for(i=0; i<n; i++){
                TreeNode p = queue.poll();
                if(p.left != null){
                    queue.offer(p.left);
                }
                if(p.right != null){
                    queue.offer(p.right);
                }
                if(i==0)
                    res.add(p.val);
            }
        }
        return res;
    }
}
