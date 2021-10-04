import java.util.*;

/*
 * @lc app=leetcode.cn id=136 lang=java
 *
 * [136] 只出现一次的数字
 */

// @lc code=start
class Solution {
    public int singleNumber(int[] nums) {
        
        int res = 0;
        for(int num : nums){
            res ^= num;
        }
        return res;
    }
/* 
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> mp = new HashMap<>();
        for (int i : nums) {
            if(mp.containsKey(i)){
                mp.put(i, mp.get(i) + 1);
            }else{
                mp.put(i, 1);
            }
        }
        for(Integer i : mp.keySet()){
            if(mp.get(i) == 1){
                return i;
            }
        }
        return -1;
    } */
}
// @lc code=end

