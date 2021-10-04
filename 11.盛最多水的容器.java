/*
 * @lc app=leetcode.cn id=11 lang=java
 *
 * [11] 盛最多水的容器
 */

// @lc code=start
class Solution {
    public int maxArea(int[] height) {
        if(height.length < 3){
            return 0;
        }
        
        int res = 0;
        int i = 0;
        int j = height.length - 1;
        int min = Math.min(height[i], height[j]);
        while(i < j){
            if(height[i] < height[j]){
                i++;
                if(height[i] < min){
                    res += min - height[i];
                }else{
                    min = Math.min(height[i], height[j]);
                    
                }
            }else{
                j--;
                if(height[j] < min){
                    res += min - height[j];
                }else{
                    min = Math.min(height[i], height[j]);
                }
            }
        }
        return res;
    }
}
// @lc code=end

