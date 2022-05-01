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
    
    public int maxHeight(TreeNode root)
    {
        if(root == null)
            return 0;
        
        int left = maxHeight(root.left);
        int right = maxHeight(root.right);
        
        return 1 + Math.max(left,right); 
        
    }
    
    public int maxDepth(TreeNode root) {
        
        if(root == null)
            return 0;
        
        int res = maxHeight(root);
        
        return res;
        
        
        
    }
}