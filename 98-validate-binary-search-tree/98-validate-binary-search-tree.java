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
    long pre = Long.MIN_VALUE;
    boolean res = true;
    public void isValid(TreeNode root)
    {
        if(root == null)
            return;
        isValid(root.left);
        if(pre < root.val)
        {
            pre = root.val;
        }
        else
        {
            res = false;
            return;
        }
        isValid(root.right);
        
    }
    public boolean isValidBST(TreeNode root) {
       
          isValid(root);
        
        return res;
        
        
    }
}