/*
 * @lc app=leetcode.cn id=122 lang=java
 *
 * [122] 买卖股票的最佳时机 II
 */

// @lc code=start
class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length <= 1 || prices == null){
            return 0;
        }
        /*
        int res = 0;
        for(int i = 1; i < prices.length; i++){
            if(prices[i] > prices[i - 1]){
                res += prices[i] - prices[i - 1];
            }
        }
        */
        int dp[] = new int[prices.length];
        dp[0] = 0;
        int res = 0;
        for(int i = 1; i < prices.length; i++){
            dp[i] = Math.max(dp[i - 1], dp[i - 1] + prices[i] - prices[i -1]);
            res = Math.max(res, dp[i]);
        }
        return res;
    }
}
// @lc code=end

