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
    public boolean isEval(TreeNode root,boolean res)
    {
        if(root == null)
            return res;
        boolean left = isEval(root.left,res);
        boolean right = isEval(root.right,res);
        if(root.val == 0)
            return false;
        if(root.val == 1)
            return true;
        if(root.val == 2)
        {
            return left||right;
        }
        return left&&right;
    }
    public boolean evaluateTree(TreeNode root) {
        boolean res = false;
        if(root == null)
            return res;
        return isEval(root,res);
    }
}