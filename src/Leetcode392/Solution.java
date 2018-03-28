package Leetcode392;

/**
 * Created by DELL on 2018/3/28.
 * 判断是否为子串
 * s = "abc", t = "ahbgdc"
   Return true.
 */
public class Solution {
    public boolean isSubsequence(String s, String t) {
        for (int i = 0, pos = 0;i < s.length(); i++, pos++) {
            pos = t.indexOf(s.charAt(i),pos);
            if (pos == -1) {
                return false;
            }
        }
        return true;
    }
}
