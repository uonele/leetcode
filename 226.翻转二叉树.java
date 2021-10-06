import java.util.LinkedList;
import java.util.Stack;

import javax.swing.tree.TreeNode;

/*
 * @lc app=leetcode.cn id=226 lang=java
 *
 * [226] 翻转二叉树
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
    // 基于BFS翻转  
    public TreeNode invertTree_BFS(TreeNode root) {
        if(root == null) return null;
        LinkedList<TreeNode> q = new LinkedList<TreeNode>();

        q.offer(root);
        while(!q.isEmpty()){
            TreeNode cur = q.poll();
            TreeNode temp = cur.left;
            cur.left = cur.right;
            cur.right = temp;

            if(cur.left != null){
                q.offer(cur.left);
            }
            if(cur.right != null){
                q.offer(cur.right);
            }
            
        }

        return root;
    }
    // 基于先序遍历翻转   没写完，不AC
    public TreeNode invertTree_PreTraversee(TreeNode root) {
        Stack<TreeNode> s = new Stack<>();
        TreeNode cur = root;
        while(cur != null && !s.isEmpty()){
            while(cur.left != null){
                s.add(cur.left);
                cur = cur.left;
            }
            cur = s.pop();
                cur = cur.right;
            
        }

        return root;
    }
    //2:递归法，交换左右孩子，递归交换左孩子、右孩子
    public TreeNode invertTree_2(TreeNode root) {
        if(root == null) return null;
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        root.left = invertTree(root.left);
        root.right = invertTree(root.right);
        return root;
    }

    // 3:递归法
    public TreeNode invertTree_3(TreeNode root) {
        if(root == null) return null;
        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);
        root.left = right;
        root.right = left;
        return root;


        /*   这种方法会覆盖掉left，所以不能使用。
        root.left = invertTree(root.right);
        root.right = invertTree(root.left);
        return root; */
    }
}
// @lc code=end

