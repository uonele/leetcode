/*
 * @lc app=leetcode.cn id=19 lang=java
 *
 * [19] 删除链表的倒数第 N 个结点
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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null) return null;
        
        ListNode cur = head;

        int i = 0;
        ListNode pre = null;
        ListNode fast = head;
        ListNode low = head;
        while(i < n && fast != null){
            fast = fast.next;
            i++;
        }
        if(fast == null){
            return head.next;
        }
        while(fast != null){
            fast = fast.next;
            pre = low;
            low = low.next;
        }
        pre.next = low.next;
        return head;
    }
}
// @lc code=end

