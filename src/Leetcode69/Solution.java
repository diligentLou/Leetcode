package Leetcode69;

/**
 * Created by DELL on 2018/3/28.
 * 算法思想:二分查找
 * public int search(int key, int[] array) {
   int l = 0, h = array.length - 1;
   while (l <= h) {
   int mid = l + (h - l) / 2;
   if (key == array[mid]) return mid;
   if (key < array[mid])  h = mid - 1;
   else l = mid + 1;
  }
  return -1;
  }
 * 实现 int sqrt(int x) 函数。
 *计算并返回 x 的平方根。
 *x 保证是一个非负整数。
 *
 * 输入: 4
   输出: 2

 输入: 8
 输出: 2
 说明: 8 的平方根是 2.82842..., 由于我们想返回一个整数，小数部分将被舍去。

 思路:一个数 x 的开方 sqrt 一定在 0 ~ x 之间，并且满足 sqrt == x / sqrt 。可以利用二分查找在 0 ~ x 之间查找 sqrt。
 */
public class Solution {
    public int mySqrt(int x) {
        if (x <= 1) {
            return x;
        }
        int l = 1, h = x;
        while ( l <= h ) {
            int mid = l + (h-l) / 2;
            int sqrt = x / mid;
            if (sqrt == mid) {
                return mid;
            }else if (sqrt < mid) {
                h = mid - 1;
            }else {
                l = mid + 1;
            }
        }
        return h;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.mySqrt(10));
    }
}
