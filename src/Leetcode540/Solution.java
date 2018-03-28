package Leetcode540;

/**
 * Created by DELL on 2018/3/28.
 * 有序数组中的单一元素
 * 给定一个只包含整数的有序数组，每个元素都会出现两次，唯有一个数只会出现一次，找出这个数。
 *
 * 输入: [1,1,2,3,3,4,4,8,8]
   输出: 2

   输入: [3,3,7,7,10,11,11]
   输出: 10
 */
public class Solution {
    public int singleNonDuplicate(int[] nums) {
        int l = 0, h = nums.length - 1;
        while (l < h) {
            int m = l + (h - 1) / 2;
            if (m % 2 == 1) {
                m--;  //保证l/h/m 都在偶数位, 使得查找区间大小一直都是奇数
            }
            if ( nums[m] == nums[m+1] ) {
                l = m + 2;
            } else {
                h = m;
            }
        }
        return nums[l];
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] a ={1,1,2,3,3,4,4,8,8};
        System.out.println(solution.singleNonDuplicate(a));
    }
}
