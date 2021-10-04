import java.util.List;
import java.util.Stack;

import javax.swing.tree.TreeNode;

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
    // 通用公式
    public List<Integer> postorderTraversal(TreeNode root){
        List<Integer> res = new ArrayList<>();
        if(root == null){
            return res;
        }
        TreeNode pre = null;
        TreeNode cur = root;
        Stack<TreeNode> s = new Stack<>();
        while(!s.isEmpty() || cur != null){
            while(cur != null){
                s.push(cur);
                cur = cur.left;
            }
            cur = s.pop();
            if(cur.right == null || cur.right == pre){
                res.add(cur.val);
                pre = cur;
                cur = null;
            }else{
                s.add(cur);
                cur = cur.right;
            }
        }
        return res;
    }

    // 另一种取巧法
    public List<Integer> postorderTraversal_2(TreeNode root) {
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

