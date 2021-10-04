/*
 * @lc app=leetcode.cn id=69 lang=java
 *
 * [69] Sqrt(x)
 */

// @lc code=start
class Solution {
    // 标准的二分计算过程
    // 注意返回值为j（假设x为8，代入计算一下就知道）
    // 二分查找的时候，返回值是j + 1
    public int mySqrt(int x) {
        if(x <= 1){
            return x;
        }
        int i = 0;
        int j = x;
        int mid;
        while(i <= j){
            mid = i + (j - i) / 2;
            if(mid < x / mid){
                i = mid + 1;
            }else if(mid > x / mid){
                j = mid - 1;
            }else{
                return mid;
            }
        }
        return j;
    }
}
// @lc code=end

