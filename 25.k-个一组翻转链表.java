/*
 * @lc app=leetcode.cn id=25 lang=java
 *
 * [25] K 个一组翻转链表
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
    /*
    Accepted
    62/62 cases passed (3 ms)
    Your runtime beats 5.72 % of java submissions
    Your memory usage beats 37.15 % of java submissions (41.1 MB)
    */
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode res = new ListNode(0);
        ListNode resHead = res;
        ListNode cur = head;
        Stack<ListNode> s = new Stack<ListNode>();
        while(cur != null){
            int i = 0;
            // 这里要记录一下cur节点的位置
            ListNode temp = cur;
            
            while(i < k && cur != null){
                i++;
                s.push(cur);
                cur = cur.next;
            }
			//最后一轮时节点个数小于k，直接把剩余节点的头结点赋值给res即可。
            if(i < k){
                res.next = temp;
                break;
            }
            while(!s.isEmpty()){
                res.next = s.pop();
                res = res.next;
            }
            // 这个必须有，因为 3-》4翻转后变成了4-》3，但3的next还是4，就成了无限循环，会爆超时错误。
            res.next = null;
        }
        return resHead.next;
    
    }
}
// @lc code=end

