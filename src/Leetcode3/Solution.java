package Leetcode3;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * Created by DELL on 2018/3/22.
 * 给定一个字符串，找到最长的子字符串的长度而不重复字符。
 * 给定"abcabcbb"的答案是"abc"，长度是3。
 *给定"bbbbb"的答案是"b"，长度为1。
 *给定"pwwkew"的答案是"wke"，长度为3.请注意，答案必须是一个子字符串，"pwke"是一个子序列，而不是一个子字符串。
 */
public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int answer = 0;
        Map<String, Integer> map = new HashMap<String, Integer>();
        List<String> list = new LinkedList<String>();
        for (int i = 0; i < s.length(); i++) {
            String k = s.substring(i, i + 1);
            if (map.get(k) != null) {
                int n = map.get(k) - map.get(list.get(0)) + 1;
                for (int j = 0; j < n; j++) {
                    map.remove(list.get(0));
                    list.remove(0);
                }
            }
            map.put(k, i);
            list.add(k);
            if (list.size() > answer) {
                answer = list.size();
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.lengthOfLongestSubstring("abkfefmnbvadew"));
    }
}