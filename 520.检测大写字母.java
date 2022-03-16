/*
 * @lc app=leetcode.cn id=520 lang=java
 *
 * [520] 检测大写字母
 */

// @lc code=start
class Solution {
    public boolean detectCapitalUse(String word) {
        int up = 0;
        // 统计大写字母的数量
        for(int i = 0; i < word.length() ; i++){
            if(Character.isUpperCase(word.charAt(i))){
                up++;
            }
        }
        // 全为大写的时候的可以，此时up等于word.length()
        // 全为小写的时候的可以，此时up为0
        // 只有一个大写，且位置在首字母，也可以，此时up为1，首字母为大写。
        if(up == 0 || up == 1 && Character.isUpperCase(word.charAt(0)) || up == word.length()){
            return true;
        }
        return false;
    }
}
// @lc code=end

