/*
 * @lc app=leetcode.cn id=88 lang=java
 *
 * [88] 合并两个有序数组
 */

// @lc code=start
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int length = m + n - 1;
        int i = n - 1;
        int j = m - 1;
        while(j >= 0 && i >= 0){
            if( nums2[i] > nums1[j]){
                nums1[length--] = nums2[i--];
            }else{
                nums1[length--] = nums1[j--];
            }
        }
        while(i >= 0){
            nums1[length--] = nums2[i--];
        }

    }
}
// @lc code=end

