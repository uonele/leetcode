/*
 * @lc app=leetcode.cn id=53 lang=java
 *
 * [53] 最大子序和
 */

// @lc code=start
class Solution {
    public int maxSubArray(int[] nums) {
        if(nums.length == 0){
             return 0;
        }
        /*int sum = 0;
        int max = nums[0];
        for(int i = 0; i < nums.length; i++){
            if(sum < 0){
                sum = nums[i]; 
            }else{
                sum += nums[i];
            }
            max = Math.max(sum, max);
        }
        return max;
        */
        
        int[] dp = new int[nums.length + 1];
        dp[0] = nums[0];
        int max = nums[0];
        for(int i = 1; i < nums.length; i++){
            dp[i] = nums[i] + Math.max(dp[i - 1], 0);
            max = Math.max(max, dp[i]);
        }
        return max;

        
    }
}
// @lc code=end

