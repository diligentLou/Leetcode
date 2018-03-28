package Leetcode1;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by DELL on 2018/3/22.
 */
public class Solution2 {
    public int[] twoSum(int[] nums, int target) {
        int [] res = new int[2];
        Map map = new HashMap();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i],i);
        }
        for (int i = 0; i < nums.length; i++) {
            int gap = target - nums[i];
            if (map.get(gap) != null || (int)map.get(gap) != i) {
                res[0] = i;
                res[1] = (int)map.get(gap) ;
                break;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int [] nums = {2,7,11,15};
        int target = 9;
        Solution solution = new Solution();
        for (int i = 0; i < solution.twoSum(nums,target).length; i++) {
            System.out.println(solution.twoSum(nums,target)[i]);
        }
    }
}
