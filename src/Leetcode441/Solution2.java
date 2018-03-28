package Leetcode441;

/**
 * Created by DELL on 2018/3/28.
 */
public class Solution2 {
    public int arrangeCoins(int n) {
        int level = 1;
        while ( n > 0 ) {
            n -= level;
            level++;
        }
        return n == 0 ? level-1:level-2;
    }

    public static void main(String[] args) {
        Solution2 solution2 = new Solution2();
        System.out.println(solution2.arrangeCoins(20));
    }
}
