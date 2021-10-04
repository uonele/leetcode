/*
 * @lc app=leetcode.cn id=322 lang=java
 *
 * [322] 零钱兑换
 */

// @lc code=start
class Solution {
    public int coinChange(int[] coins, int amount) {
        if(amount == 0 || coins.length == 0){
            return 0;
        }
        int[] dp = new int[amount + 1];
        dp[0] = 0 ;
        for(int i = 1; i <= amount; i++){
            dp[i] = amount + 1;
            for(int j = 0; j < coins.length; j++){
                if(i >= coins[j]){
                    dp[i] = Math.min(dp[i], dp[i - coins[j]] + 1);
                }
            }
        }
        
        return dp[amount] == amount + 1 ? -1 : dp[amount];
    }
}
// @lc code=end

