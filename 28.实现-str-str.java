/*
 * @lc app=leetcode.cn id=28 lang=java
 *
 * [28] 实现 strStr()
 */

// @lc code=start
class Solution {
    // 暴力解法
    public int strStr(String ss, String pp) {
        char[] cs = ss.toCharArray();
        char[] cp = pp.toCharArray();
        for(int i = 0; i <= ss.length() - pp.length(); i++){
            int flag = 1;
            for(int j = 0; j < pp.length(); j++){
                if( cs[i + j] != cp[j]){
                    flag = 0;
                    break;
                }
            }
            if(flag == 1) return i;
        }
        return -1;
    }
}
// @lc code=end

