import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=169 lang=java
 *
 * [169] 多数元素
 */

// @lc code=start
class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
   
    }

    public int majorityElement_2(int[] nums) {

        int count = 1;
        int x = nums[0];
        for(int num : nums){
            if(x == num){
                count++; 
            }else{
                count--;
            }
            if(count == 0){
                x = num;
                count = 1;
            }
        }
        return x;
    }
}
// @lc code=end

