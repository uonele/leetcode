import java.util.ArrayList;
import java.util.Stack;

import javax.swing.tree.TreeNode;

/*
 * @lc app=leetcode.cn id=144 lang=java
 *
 * [144] 二叉树的前序遍历
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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList();
        if(root == null){
            return list;
        }
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur;
        stack.add(root);
        while(!stack.isEmpty()){
            cur = stack.pop();
            list.add(cur.val);

            // 先序遍历是先把右子树压入栈中，再把左子树压入栈中，这样才能保证出栈时是先左后右
            if(cur.right != null){
                stack.add(cur.right);
            }
            if(cur.left != null){
                stack.add(cur.left);
            }

        }
        return list;

    }
}
// @lc code=end

