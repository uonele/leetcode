/*
 * @lc app=leetcode.cn id=69 lang=java
 *
 * [69] Sqrt(x)
 */

// @lc code=start
class Solution {
    public int mySqrt(int x) {
        int l = 0, r = x;

        int res = -1;
        while(l <= r){
            int mid = l + (r - l)/2;
            if((long) mid * mid <= x){
                res = mid;
                l = mid + 1;
            }else{
                r = mid - 1;
            }     
        }
        return res;

    }
}
// @lc code=end

