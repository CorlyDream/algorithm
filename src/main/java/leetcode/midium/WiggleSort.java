package leetcode.midium;

/**
 * Created by corly on 2016/10/22.
 * 给你一个没有排序的数组，请将原数组就地重新排列满足如下性质
 *  nums[0] <= nums[1] >= nums[2] <= nums[3]....
 *  注意事项
 *  请就地排序数组，也就是不需要额外数组
 */
public class WiggleSort {
    public void wiggleSort(int[] nums) {
        for (int i=1; i<nums.length; i++) {
            int a = nums[i-1];
            if ((i%2 == 1) == (a > nums[i])) {
                nums[i-1] = nums[i];
                nums[i] = a;
            }
        }
    }
}
