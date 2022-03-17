/*
 * @lc app=leetcode.cn id=459 lang=java
 *
 * [459] 重复的子字符串
 */

// @lc code=start
class Solution {
    public boolean repeatedSubstringPattern(String s) {
        String res = s + s;
        // 注意substring 是[) 做包右不包的
        return res.substring(1, res.length() - 1).contains(s);
    }
}
// @lc code=end

