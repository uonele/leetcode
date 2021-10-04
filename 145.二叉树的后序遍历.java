/*
 * @lc app=leetcode.cn id=145 lang=java
 *
 * [145] 二叉树的后序遍历
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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList();
        if(root == null){
            return list;
        }
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur;
        stack.add(root);
        while(!stack.isEmpty()){
            cur = stack.pop();

            // 后序遍历是先把左子树压入栈中，再把右子树压入栈中，这样才能保证出栈时是先右后左
            if(cur.left != null){
                stack.add(cur.left);
            }
            if(cur.right != null){
                stack.add(cur.right);
            }
            list.add(0, cur.val);   // 插入时需要逆序插入

        }
        return list;
    }
}
// @lc code=end

