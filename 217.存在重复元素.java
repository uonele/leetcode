import java.util.HashSet;

/*
 * @lc app=leetcode.cn id=217 lang=java
 *
 * [217] 存在重复元素
 */

// @lc code=start
class Solution {
    public boolean containsDuplicate(int[] nums) {
        if(nums.length < 2){
            return false;
        }
        Set<Integer> set = new HashSet<>();
        for(int num: nums){
            if(!set.add(num)){
                return true;
            }
        }
        return false;
    }
}
// @lc code=end

