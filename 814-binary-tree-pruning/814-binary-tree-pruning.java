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
    public boolean contains(TreeNode root)
    {
        if(root == null)
            return false;
        
        boolean left = contains(root.left);
        if(left == false)
        {
            root.left = null;
        }
        boolean right = contains(root.right);
        if(right == false)
        {
            root.right = null;
        }
        
        return root.val == 1 || left || right;
    }
    public TreeNode pruneTree(TreeNode root) {
        
        return contains(root) ? root : null;
    }
}