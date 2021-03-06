/*
 * @lc app=leetcode.cn id=206 lang=java
 *
 * [206] 反转链表
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
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }

        /*
        循环法
        ListNode pre = null;
        ListNode n = null;
        ListNode cur = head;
        while(cur != null){
            n = cur.next;
            cur.next = pre;
            pre = cur;
            cur = n;

        }
        return pre;
        */
        // 递归法
        ListNode res = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return res;


    }
}
// @lc code=end

