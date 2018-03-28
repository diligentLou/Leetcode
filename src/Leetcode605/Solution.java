package Leetcode605;

/**
 * Created by DELL on 2018/3/28.
 * Input: flowerbed = [1,0,0,0,1], n = 1
   Output: True

   Input: flowerbed = [1,0,0,0,1], n = 2
   Output: False
   题目描述：花朵之间至少需要一个单位的间隔。
 */
public class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int cnt = 0;
        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 1) {
                continue;
            }
            int pre = i == 0 ? 0 :flowerbed[i-1];
            int next = i == flowerbed.length-1 ? 0 : flowerbed[i+1];
            if (pre == 0 && next == 0) {
                cnt++;
                flowerbed[i] = 1;
            }
        }
        return cnt >= n;
    }
}
