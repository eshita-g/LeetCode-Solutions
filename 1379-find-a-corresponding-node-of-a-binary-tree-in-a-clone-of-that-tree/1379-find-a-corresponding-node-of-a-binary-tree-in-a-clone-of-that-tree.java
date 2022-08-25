/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode helper(TreeNode p1,TreeNode p2,TreeNode target)
    {
        if(p1 == null)
            return null;
        if(p1 == target)
            return p2;
        
        TreeNode left = helper(p1.left,p2.left,target);
        if(left != null)
            return left;
        TreeNode right = helper(p1.right,p2.right,target);
        if(right!= null)
            return right;
        
        return null;
    }
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        
        return helper(original,cloned,target);
        
    }
}