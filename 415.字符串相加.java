/*
 * @lc app=leetcode.cn id=415 lang=java
 *
 * [415] 字符串相加
 */

// @lc code=start
class Solution {
    public String addStrings(String num1, String num2) {
        StringBuffer res = new StringBuffer();
        int len1 = num1.length() - 1;
        int len2 = num2.length() - 1;

        int carry = 0;
        while(len1 >= 0 && len2 >= 0){
            int sum = carry;
            int a = num1.charAt(len1--) - '0';
            int b = num2.charAt(len2--) - '0';
            sum = sum + a + b;
            carry = sum / 10;
            res.append(sum % 10);
        }
        while(len1 >= 0){
            int sum = num1.charAt(len1--) - '0' + carry;
            carry = sum / 10;
            res.append(sum % 10);
        }
        while(len2 >= 0){
            int sum = num2.charAt(len2--) - '0' + carry;
            carry = sum / 10;
            res.append(sum % 10);
        }
        if(carry > 0){
            res.append(carry);
        }
        return res.reverse().toString();


    }
}
// @lc code=end

