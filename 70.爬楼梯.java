/*
 * @lc app=leetcode.cn id=70 lang=java
 *
 * [70] 爬楼梯
 */

// @lc code=start
class Solution {
    public int climbStairs(int n) {
        if(n <= 2){
            return n;
        }
        int a = 1;
        int b = 1;
        int c = 0;
        for(int i = 2; i <= n; i++){
            c = a + b;
            a= b;
            b = c;
        }
        return c;
    }

/*     public int climbStairs(int n) {

        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        for(int i = 2; i <= n; i++){
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];

    } */
}
// @lc code=end

