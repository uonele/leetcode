/*
 * @lc app=leetcode.cn id=409 lang=java
 *
 * [409] 最长回文串
 */

// @lc code=start
class Solution {
    public int longestPalindrome(String s) {
        int[] map = new int[256];
        int res = 0;
        for(char ch : s.toCharArray()){
            map[ch]++;
        }
        for(int num : map){
            res += (num % 2 == 0) ? num : num  - 1;
        }
        return res == s.length() ? res : res + 1;
    }
}
// @lc code=end
