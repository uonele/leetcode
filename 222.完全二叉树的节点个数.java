import java.util.LinkedList;

import javax.swing.tree.TreeNode;

/*
 * @lc app=leetcode.cn id=222 lang=java
 *
 * [222] 完全二叉树的节点个数
 */

// @lc code=start
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    // 递归
    public int countNodes(TreeNode root) {
        if(root == null) return 0;
        int left = countNodes(root.left);
        int right = countNodes(root.right);

        
        return left + right + 1;
    }
    // 层序遍历解法
    public int countNodes_BFS(TreeNode root) {
        if(root == null) return 0;
        LinkedList<TreeNode> q = new LinkedList<>();
        q.offer(root);
        int res = 0;
        while(!q.isEmpty()){
            TreeNode cur = q.poll();
            res++;
            if(cur.left != null){
                q.offer(cur.left);
            }
            if(cur.right != null){
                q.offer(cur.right);
            }
        }
        return res;
    }
}
// @lc code=end

