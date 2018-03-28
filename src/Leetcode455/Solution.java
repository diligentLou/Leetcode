package Leetcode455;

import java.util.Arrays;

/**
 * 贪心思想
 * Created by DELL on 2018/3/28.
 * 分发饼干
 * 每个孩子都有一个满足度，每个饼干都有一个大小，只有饼干的大小大于一个孩子的满足度，
 * 该孩子才会获得满足。求解最多可以获得满足的孩子数量。
 * 思路:因为最小的孩子最容易得到满足，因此先满足最小孩子。
 * 给一个孩子的饼干应当尽量小又能满足该孩子，这样大饼干就能拿来给满足度比较大的孩子。
 * 假设在某次选择中，贪心策略选择给第 i 个孩子分配第 m 个饼干，并且第 i 个孩子满足度最小，
 * 第 m 个饼干为可以满足第 i 个孩子的最小饼干，利用贪心策略最终可以满足 k 个孩子。
 * 假设最优策略在这次选择中给 i 个孩子分配第 n 个饼干，并且这个饼干大于第 m 个饼干。
 * 我们发现使用第 m 个饼干去替代第 n 个饼干完全不影响后续的结果，因此不存在比贪心策略更优的策略，
 * 即贪心策略就是最优策略。
 *
 * 输入: [1,2,3], [1,1]

    输出: 1

    解释:
    你有三个孩子和两块小饼干，3个孩子的胃口值分别是：1,2,3。
    虽然你有两块小饼干，由于他们的尺寸都是1，你只能让胃口值是1的孩子满足。
    所以你应该输出1。

    输入: [1,2], [1,2,3]

    输出: 2

    解释:
    你有两个孩子和三块小饼干，2个孩子的胃口值分别是1,2。
    你拥有的饼干数量和尺寸都足以让所有孩子满足。
    所以你应该输出2.
 */
public class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g); //(孩子)对一个数组的所有元素进行排序，并且是按从小到大的顺序。
        Arrays.sort(s); //(零食)对一个数组的所有元素进行排序，并且是按从小到大的顺序。
        int i = 0; int j = 0;
        while (i < g.length && j < s.length) {
            if (g[i] <= s[j]){
                i++;
            }
            j++;
        }
        return i;
    }

    public static void main(String[] args) {
        int[] g = {1,2,4};
        int[] s = {1,2,2};
        Solution solution = new Solution();
        System.out.println(solution.findContentChildren(g,s));
    }
}
