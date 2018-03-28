package Leetcode452;

import java.util.Arrays;

/**
 * Created by DELL on 2018/3/28.
 * 气球在一个水平数轴上摆放，可以重叠，飞镖垂直射向坐标轴，
 * 使得路径上的气球都会刺破。求解最小的投飞镖次数使所有气球都被刺破。
 * 输入:
   [[10,16], [2,8], [1,6], [7,12]]
   输出:
   2
   解释:
   对于该样例，我们可以在x = 6（射爆[2,8],[1,6]两个气球）和 x = 11（射爆另外两个气球）。

    从左往右投飞镖，并且在每次投飞镖时满足以下条件：

    左边已经没有气球了；
    本次投飞镖能够刺破最多的气球。
 */
public class Solution {
    public int findMinArrowShots(int[][] points) {
        if (points.length == 0) {
            return 0;
        }
        Arrays.sort(points,(a,b) -> (a[1] - b[1]));
        int curPos = points[0][1];
        int ret = 1;
        for (int i = 1; i < points.length ; i++) {
            if (points[i][0] <= curPos) {
                continue;
            }
            curPos = points[i][1];
            ret++;
        }
        return ret;
    }
}
