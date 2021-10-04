import java.util.HashSet;

/*
 * @lc app=leetcode.cn id=3 lang=java
 *
 * [3] 无重复字符的最长子串
 */

// @lc code=start
class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s == null || s.length() == 0 ){
            return 0;
        }
        int start = 0;
        int i = 0;
        int res = 0;
        HashSet<Character>  hs = new HashSet<Character>();
        while(i < s.length()){
            if( !hs.contains(s.charAt(i))){
                hs.add(s.charAt(i++));
                res = Math.max(res, i - start);
            }else{
                hs.remove(s.charAt(start++));
            }
        }
        return res;
    }
}
// @lc code=end

