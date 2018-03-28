package Leetcode441;

/**
 * Created by DELL on 2018/3/28.
 * 你总共有 n 枚硬币，你需要将它们摆成一个阶梯形状，第 k 行就必须正好有 k 枚硬币。
    给定一个数字 n，找出可形成完整阶梯行的总行数。
   n 是一个非负整数，并且在32位有符号整型的范围内。

    n = 5

 硬币可排列成以下几行:
 ¤
 ¤ ¤
 ¤ ¤

 因为第三行不完整，所以返回2.

    n = 8

 硬币可排列成以下几行:
 ¤
 ¤ ¤
 ¤ ¤ ¤
 ¤ ¤

 因为第四行不完整，所以返回3.
 返回 h 而不是 l，因为摆的硬币最后一行不能算进去。
 */
public class Solution {
    public int arrangeCoins(int n) {
        int l = 0, h = n;
        while (l <= h) {
            int m = l +(h-1) / 2;
            long x = m * (m+1L) / 2;
            if (x == n) {
                return m;
            }
            else if ( x < n) {
                l = m + 1;
            }else {
                h = m -1;
            }
        }
        return h;
    }
}
