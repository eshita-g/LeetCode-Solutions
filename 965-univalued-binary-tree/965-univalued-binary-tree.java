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
    boolean res = true;
    public void isbool(TreeNode root,int p)
    {
        if(root == null)
            return;
        if(root.val != p)
        {
            res = false;
            return;
            
        }
        isbool(root.left,p);
        isbool(root.right,p);
    }
    
    public boolean isUnivalTree(TreeNode root) {
        
        if(root == null)
            return true;
        
        int p = root.val;
        isbool(root,p);
        return res;
        
    }
}