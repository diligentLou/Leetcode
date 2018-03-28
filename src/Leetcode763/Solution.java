package Leetcode763;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by DELL on 2018/3/28.
 * 分隔字符串使同种字符出现在一起
 * Input: S = "ababcbacadefegdehijhklij"
    Output: [9,7,8]
 Explanation:
 The partition is "ababcbaca", "defegde", "hijhklij".
 This is a partition so that each letter appears in at most one part.
 A partition like "ababcbacadefegde", "hijhklij" is incorrect, because it splits S into less parts.
 */
public class Solution {
    public List<Integer> partitionLabels(String S) {
        List<Integer> ret = new ArrayList<>();
        int[] lastIdxs = new int[26];
        for (int i = 0; i < S.length(); i++) {
            lastIdxs[S.charAt(i) - 'a'] = i;
        }
        int startIdx = 0;
        while (startIdx < S.length()) {
            int endIdx = startIdx;
            for (int i = startIdx; i < S.length() && i <= endIdx; i++) {
                int lastIdx = lastIdxs[S.charAt(i) - 'a'];
                if (lastIdx == i) {
                    continue;
                }
                if (lastIdx > endIdx) {
                    endIdx = lastIdx;
                }
                ret.add(endIdx - startIdx + 1);
                startIdx = endIdx + 1;
            }
        }
        return ret;
    }
}
