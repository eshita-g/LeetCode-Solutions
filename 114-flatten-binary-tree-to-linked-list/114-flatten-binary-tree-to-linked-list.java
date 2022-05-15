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
    TreeNode ptr = null;
    public void recurse(TreeNode root)
    {
        
        if(root.right!=null)
            recurse(root.right);
        if(root.left!=null)
            recurse(root.left);
        root.right = ptr;
        ptr = root;
        root.left = null;
        
    }
    public void flatten(TreeNode root) {
        
        if(root == null)
            return;
        
        recurse(root);
        
        
        
    }
}