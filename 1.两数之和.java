import java.util.HashMap;

/*
 * @lc app=leetcode.cn id=1 lang=java
 *
 * [1] 两数之和
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] nums, int target) {
        if(nums.length == 0){
            return new int[]{};
        }
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i = 0; i < nums.length; ++i){
            if( hm.containsKey(target - nums[i])){
                return new int[]{i ,hm.get(target - nums[i]) };
            }
            hm.put(nums[i], i);
        }
        return new int[]{};
    }
}
// @lc code=end

