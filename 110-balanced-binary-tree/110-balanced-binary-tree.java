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
    int ans = 0;
    public int getBal(TreeNode root)
    {
        if(root == null)
            return 0;
        
        int left = getBal(root.left);
        int right = getBal(root.right);
        
        if(Math.abs(left - right) > 1)
            ans = 1;
        
        return 1+Math.max(left,right);
    }
    
    
    public boolean isBalanced(TreeNode root) {
        
        if(root == null)
            return true;
        
        getBal(root);
        if(ans == 1)
            return false;
        
        
        return true;
        
        
    }
}