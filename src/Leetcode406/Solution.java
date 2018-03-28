package Leetcode406;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Created by DELL on 2018/3/28.
 *  Input:
    [[7,0], [4,4], [7,1], [5,0], [6,1], [5,2]]
    Output:
    [[5,0], [7,0], [5,2], [6,1], [4,4], [7,1]]
    题目描述：一个学生用两个分量 (h, k) 描述，h 表示身高，
    k 表示排在前面的有 k 个学生的身高比他高或者和他一样高。

    为了在每次插入操作时不影响后续的操作，身高较高的学生应该先做插入操作，
    否则身高较小的学生原先正确插入第 k 个位置可能会变成第 k+1 个位置。

    身高降序、k 值升序，然后按排好序的顺序插入队列的第 k 个位置中。
 */
public class Solution {
    public int[][] reconstructQueue(int[][] people) {
        if (people == null || people.length == 0 || people[0].length == 0) {
            return new int[0][0];
        }
        Arrays.sort(people, new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                if (a[0] == b[0]) {
                    return a[1] - b[1];
                }
                return b[0] -a[0];
            }
        });
        int n = people.length;
        List<int[]> tmp = new ArrayList<>();
        for (int i = 0; i < n ; i++) {
            tmp.add(people[i][1],new int[]{people[i][0],people[i][1]});
        }

        int[][] ret = new int[n][2];
        for (int i = 0; i < n; i++) {
            ret[i][0] = tmp.get(i)[0];
            ret[i][1] = tmp.get(i)[1];
        }
        return ret;
    }
}
