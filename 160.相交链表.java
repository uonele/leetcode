/*
 * @lc app=leetcode.cn id=160 lang=java
 *
 * [160] 相交链表
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {

    
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode a = headA;
        ListNode b = headB;
        while(a != b){
            a = a == null ? headB : a.next;
            b = b == null ? headA : b.next;
        }
        return a;
    }
    public ListNode getIntersectionNode_2(ListNode headA, ListNode headB) {
        if(headA == null){
            return headB;
        }
        if(headB == null){
            return headA;
        }
        int lengthA = 0;
        int lengthB = 0;
        ListNode A = headA;
        ListNode B = headB;
        while(A!= null){
            lengthA++;
            A = A.next;
        }
        while(B != null){
            lengthB++;
            B = B.next;
        }
        int i = 0;
        if(lengthA > lengthB){
            while(i < lengthA - lengthB){
                i++;
                headA = headA.next;
            }
        }else{
            while(i < lengthB - lengthA){
                i++;
                headB = headB.next;
            }
        }

        while(headA != null && headB != null){
            if(headA == headB){  // 这里比较的不是headA.val == headB.val，不清楚为啥。
                return headA;
            }
            headA = headA.next;
            headB = headB.next;
        }
        return null;
    }
}
// @lc code=end

