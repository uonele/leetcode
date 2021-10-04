/*
 * @lc app=leetcode.cn id=234 lang=java
 *
 * [234] 回文链表
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
   // 思路：找到链表的中间节点 mid，将mid之后的节点翻转，然后判断是否相等就行
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null){
            return true;
        }
        // 找到翻转点
        ListNode fast = head;
        ListNode low = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            low = low.next;
        }
        // 链表个数为奇数时，fast为最后一个节点，low为翻转点，需要从low之后开始翻转
        // 链表个数为偶数时，fast为空，low此时本身就在翻转点之后的一个节点
        if(fast != null){
            low = low.next;
        }

        // 从low开始翻转，得到pre为翻转后的链表的首个节点
        ListNode pre = null;
        ListNode nextNode;
        while(low != null){
            nextNode = low.next;
            low.next = pre;
            pre = low;
            low = nextNode;
        } 

        // 判断是否相等即可
        while(pre != null){
            if(head.val != pre.val){
                return false;
            }
            pre = pre.next;
            head = head.next;
        }
        return true;

    }
}
// @lc code=end

