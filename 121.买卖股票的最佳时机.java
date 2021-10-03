/*
 * @lc app=leetcode.cn id=121 lang=java
 *
 * [121] 买卖股票的最佳时机
 */

// @lc code=start

/*

记录【今天之前买入的最小值】
计算【今天之前最小值买入，今天卖出的获利】，也即【今天卖出的最大获利】
比较【每天的最大获利】，取最大值即可
*/
class Solution {
    public int maxProfit(int[] prices) {
        
/*         int max = 0;
        int min = prices[0];

        for(int i = 1; i < prices.length; i++){
            min = Math.min(prices[i], min);
            max = Math.max(max,prices[i] - min);
        }
        return max; */


//动态规划 前i天的最大收益 = max{前i-1天的最大收益，第i天的价格-前i-1天中的最小价格}
        int max = 0;
        int min = prices[0];
        int[] dp = new int[prices.length + 1]; 
        dp[0] = 0;
        for(int i = 1; i < prices.length; i++){
            min = Math.min(prices[i], min);
            dp[i] = Math.max(dp[i - 1], prices[i] - min);
            max = Math.max(max,dp[i]);
        }
        return max;
       
    }
}
// @lc code=end

