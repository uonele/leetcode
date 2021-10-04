/*
 * @lc app=leetcode.cn id=5 lang=java
 *
 * [5] 最长回文子串
 */

// @lc code=start
class Solution {
    public String longestPalindrome(String s) {
        if(s.length() == 0 || s == null){
            return "";
        }
        String res = "";
        boolean dp[][] = new boolean[s.length() ][s.length() ];
        for(int i = s.length() - 1; i >= 0; i--){
            for(int j = i; j < s.length(); j++){
                if(s.charAt(j) == s.charAt(i) && (j - i < 2 || dp[i + 1][j - 1])){
                    dp[i][j] = true;
                }

                if(dp[i][j] && j - i + 1 > res.length()){
                    res = s.substring(i, j + 1);
                }
            }
        }
        return res;
    }
}
// @lc code=end

