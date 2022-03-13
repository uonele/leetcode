/*
 * @lc app=leetcode.cn id=67 lang=java
 *
 * [67] 二进制求和
 */

// @lc code=start
class Solution {
    public String addBinary(String a, String b) {
        StringBuffer res = new StringBuffer();
        int lenA = a.length() - 1;
        int lenB = b.length() - 1;
        int carry = 0;
        int i;
        int j;

        // ASC码48就是'0'，也就是说'0'的值是48，而后依次是'1'到'9'。 
        //这样正好是char型减去48就是它对应的int值。
        while(lenA >= 0 && lenB >= 0){
            int sum = carry;
            i = a.charAt(lenA--) - '0';
            j = b.charAt(lenB--) - '0';
            sum = sum + i + j;
            carry = sum / 2;
            res.append(sum % 2);
        }
        while(lenA >= 0){
            int sum = a.charAt(lenA--) - '0' + carry;
            carry = sum / 2;
            res.append(sum % 2);
        }
        while(lenB >= 0){
            int sum = b.charAt(lenB--) - '0' + carry;
            carry = sum / 2;
            res.append(sum % 2);
        }
        if(carry > 0){
            res.append(carry);
        }
        return res.reverse().toString();
    }
}
// @lc code=end

