/*
 * @lc app=leetcode.cn id=203 lang=java
 *
 * [203] 移除链表元素
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
    // 解法一
    public ListNode removeElements_2(ListNode head, int val) {
        if(head == null){
            return null;
        }
        ListNode tempHead = new ListNode(0); // 相同点：都使用了一个临时节点
        tempHead.next = head;   
        ListNode cur = tempHead;
        while(cur != null && cur.next != null){   // 不同点在于这里
            if(cur.next.val == val){
                cur.next = cur.next.next;  // 和这里
            }else{
                cur = cur.next;
            }
        }
        return tempHead.next;
    }

    // 解法二
    public ListNode removeElements(ListNode head, int val) {
        if(head == null){
            return null;
        }
        ListNode tempHead = new ListNode(0);
        tempHead.next = head;
        ListNode pre = tempHead;
        ListNode cur = head;

        while(cur != null){
            if(cur.val == val){
                pre.next = cur.next;
            }else{
                pre = cur;
            }
            cur = cur.next;
        }
        return tempHead.next;
    }
}
// @lc code=end

