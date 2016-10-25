package leetcode.midium;

/**
 * Created by corly on 2016/10/19.
 */
public class VerifySerializationBinaryTree {

    public static void main(String[] args) {
        String preorder = "9,#,#,1,#,#";
        String[] arr = preorder.split(",");
//        System.out.println(valid(arr, 0, arr.length-1));
        System.out.println(isValidSerialization(preorder));
    }

    public static boolean isValidSerialization(String preorder) {
        String[] nodes = preorder.split(",");
        int diff = 1;
        for (String node: nodes) {
            if (--diff < 0) return false;
            if (!node.equals("#")) diff += 2;
        }
        return diff == 0;
    }

    public static boolean valid(String[] arr, int start, int end){
        if (start > end || arr[start].equals("#")) {
            return start == end;
        }
        int mid = 0;
        int i=0,j=0,k;
        for(k=start+1; k<=end; k++){
            if(arr[k].equals("#")){
                j++;
            }else{
                i++;
            }
            if(i+1 == j){
                mid = k;
                break;
            }
        }
        if(mid==0){
            return false;
        }
        return valid(arr, start+1, mid) && valid(arr,mid+1, end);
    }
}
