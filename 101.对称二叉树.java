import javax.swing.tree.TreeNode;

/*
 * @lc app=leetcode.cn id=101 lang=java
 *
 * [101] 对称二叉树
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
    public boolean isSymmetric(TreeNode root) {
        if(root == null){
            return true;
        }
        return isDuichen(root.left, root.right);
    }
    public boolean isDuichen(TreeNode l, TreeNode r){
        if(l == null && r ==null){
            return true;
        }
        if(l == null || r == null){
            return false;
        }

        if(l.val == r.val){
            return isDuichen(l.left, r.right) && isDuichen(l.right, r.left);
        }else{
            return false;
        }
    }
}
// @lc code=end

