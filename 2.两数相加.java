/*
 * @lc app=leetcode.cn id=2 lang=java
 *
 * [2] 两数相加
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1 == null ){
            return l2;
        }
        if(l2 == null){
            return l1;
        }
        ListNode res = new ListNode(0);
        ListNode cur = res;
        int n = 0;  // 余数
        int flag = 0; // 进位
        int sum = 0;
        while(l1 != null || l2 != null){
            int x = l1 == null ? 0: l1.val;
            int y = l2 == null ? 0: l2.val;

            sum = x + y + flag;
            n = sum % 10;
            flag = sum / 10;

            cur.next = new ListNode(n);
            cur = cur.next;
            if(l1 != null){
                l1 = l1.next;
            }
            if(l2 != null){
                l2 = l2.next;
            }
        }
        if(flag == 1){
            cur.next = new ListNode(1);
        }
        return res.next;
    }
}
// @lc code=end

