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
        while(i <= j){
            mid = i + (j - i) / 2;
            if( target > nums[mid]){
                i = mid + 1;
            }else if(target < nums[mid]){
                j = mid - 1;
            }else{
                return mid;
            }
        }
        return j + 1;

    }
     
}
// @lc code=end

