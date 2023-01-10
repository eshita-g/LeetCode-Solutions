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
    public boolean areEqual(TreeNode r1, TreeNode r2)
    {
        if(r1 == null && r2==null)
            return true;
        if(r1==null || r2==null)
            return false;
        
        return (r1.val == r2.val) && areEqual(r1.left,r2.left) && areEqual(r1.right,r2.right);
    }
    
    public boolean isSameTree(TreeNode p, TreeNode q) {
        
        if(p==null && q==null)
            return true;
        if(p==null || q==null)
            return false;
        return areEqual(p,q);
        
        
    }
}