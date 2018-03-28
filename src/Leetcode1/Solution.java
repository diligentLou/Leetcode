package Leetcode1;

/**
 * Created by DELL on 2018/3/22.
 * 给定一个整数数组和一个值target，求两个下标i、j，使得a[i] + a[j] = target，返回下标。
 * 例:
 * 给定nums = [2,7,11,15]，目标= 9，
 * 由于nums [ 0 ] + nums [ 1 ] = 2 + 7 = 9，
 * 返回[ 0，1 ]。
 * 解法两个for循环
 */
public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length; j++) {
                int num = nums[i] + nums[j];
                if (num == target) {
                    res[0] = i;
                    res[1] = j;
                    break;
                }
            }
        }
        return res;
    }
}