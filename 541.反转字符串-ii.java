/*
 * @lc app=leetcode.cn id=541 lang=java
 *
 * [541] 反转字符串 II
 */

// @lc code=start
class Solution {
    public String reverseStr(String s, int k) {
        int n = s.length();
        char[] chars = s.toCharArray();
        for(int i = 0; i < n; i += 2 * k){
            reverse(chars, i, Math.min(i + k, n) - 1);
        }
        return new String(chars);
    }
    public void reverse(char[] chars, int i, int j){
        while(i < j){
            char c = chars[i];
            chars[i] = chars[j];
            chars[j] = c;
            j--;
            i++;
        }
    }
}
// @lc code=end

