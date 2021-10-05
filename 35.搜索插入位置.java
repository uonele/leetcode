/*
 * @lc app=leetcode.cn id=35 lang=java
 *
 * [35] 搜索插入位置
 */

// @lc code=start
class Solution {
    
    // 二分查找
    public int searchInsert(int[] nums, int target) {

        int i = 0;
        int j = nums.length - 1;
        int mid;
        while(i <= j){  // 这里必须选择等于
            mid = i + (j - i) / 2;   // 防止溢出
            if( target > nums[mid]){
                i = mid + 1;
            }else if(target < nums[mid]){
                j = mid - 1;
            }else{
                return mid;
            }
        }
        return j + 1;  // case (1 4 6)找2，试一下就知道了

    }
     
}
// @lc code=end

