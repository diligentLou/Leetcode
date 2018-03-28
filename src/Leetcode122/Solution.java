package Leetcode122;

/**
 * Created by DELL on 2018/3/28.
 * 假设有一个数组，它的第 i 个元素是一个给定的股票在第 i 天的价格。
   设计一个算法来找到最大的利润。你可以完成尽可能多的交易（多次买卖股票）。
   然而，你不能同时参与多个交易（你必须在再次购买前出售股票）。

   思路:对于 [a, b, c, d]，如果有 a <= b <= c <= d ，那么最大收益为 d - a。
        而 d - a = (d - c) + (c - b) + (b - a) ，因此当访问到一个 prices[i]
        且 prices[i] - prices[i-1] > 0，那么就把 prices[i] - prices[i-1] 添加加到收益中，
        从而在局部最优的情况下也保证全局最优。
 */
public class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i-1]) {
                profit += (prices[i] - prices[i-1]);
            }
        }
        return profit;
    }
}
