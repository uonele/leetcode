/*
 * @lc app=leetcode.cn id=125 lang=java
 *
 * [125] 验证回文串
 */

// @lc code=start
class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int i = 0;
        int j= s.length() - 1;
        while(i < j){
            if((s.charAt(i) >= '0' && s.charAt(i) <= '9') || (s.charAt(i) >= 'a' && s.charAt(i) <= 'z')){
                if((s.charAt(j) >= '0' && s.charAt(j) <= '9') || (s.charAt(j) >= 'a' && s.charAt(j) <= 'z')){
                    if(s.charAt(i) != s.charAt(j)){
                        return false;
                    }else{
                        i++;
                        j--;
                    }
                }else{
                    j--;
                }
                
            }else{
                i++;
            }
        }
        return true;
    }
}
// @lc code=end

