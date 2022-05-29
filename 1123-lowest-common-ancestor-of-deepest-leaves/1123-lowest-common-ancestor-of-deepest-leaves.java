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
    public TreeNode lca(TreeNode root,int maxdepth)
    {
        if(root == null)
            return null;
        
        if(maxdepth == 1)
            return root;
        
        TreeNode left = lca(root.left,maxdepth-1);
        TreeNode right = lca(root.right,maxdepth-1);
        if(left == null)
            return right;
        else if(right == null)
            return left;
        
        return left!=null && right!=null ? root : null;
    }
    public int maxDepth(TreeNode root)
    {
        if(root == null)
            return 0;
        
        return 1 + Math.max(maxDepth(root.left),maxDepth(root.right));
    }
    public TreeNode lcaDeepestLeaves(TreeNode root) {
        
        int maxdepth = maxDepth(root);
        return lca(root,maxdepth);
        
    }
}