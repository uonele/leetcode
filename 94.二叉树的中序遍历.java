import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import javax.swing.tree.TreeNode;

/*
 * @lc app=leetcode.cn id=94 lang=java
 *
 * [94] 二叉树的中序遍历
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


    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        TreeNode cur = root;
        Stack<TreeNode> s = new Stack<>();
        while( cur != null || !s.isEmpty()){
            if(cur != null ){
                s.push(cur);
                cur = cur.left;
            }else{
                cur = s.pop();
                res.add(cur.val);
                cur = cur.right;
            }
        }
        return res;
    }
/*
    // 另一种写法
    public List<Integer> inorderTraversal_2(TreeNode root) {
        List<Integer> list = new ArrayList();
        if(root == null){
            return list;
        }
        TreeNode p = root;
        
        Stack<TreeNode> s = new Stack<>();
        s.push(root);
        while(!s.isEmpty()){
            if(p != null && p.left != null){
                s.add(p.left);
                p = p.left;
            }else{
                p = s.pop();
                list.add(p.val);
                if(p.right != null){
                    s.add(p.right);
                    p = p.right;
                }else{
                    p = null;
                }
            }
        }
        return list;
    }
*/
}
// @lc code=end

