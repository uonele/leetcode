/*
 * @lc app=leetcode.cn id=168 lang=java
 *
 * [168] Excel表列名称
 */

// @lc code=start
class Solution {

    // A对应的ASCII码为65，因此num要减1.
    // 记得取reverse
    public String convertToTitle(int num) {
        StringBuffer sb = new StringBuffer();
        while(num > 0){
            num--;
            sb.append((char)(num % 26 + 'A'));
            num = num / 26;
        }
        return sb.reverse().toString();
    }
}
// @lc code=end

