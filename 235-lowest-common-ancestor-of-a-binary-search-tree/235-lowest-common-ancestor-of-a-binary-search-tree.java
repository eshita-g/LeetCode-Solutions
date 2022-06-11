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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null)
            return null;
        if(root.val == p.val || root.val == q.val)
            return root;
        int max1 = Math.max(p.val,q.val);
        int min1 = Math.min(p.val,q.val);
        if(min1 < root.val && root.val < max1)
        {
            return root;
        }
        if(root.val < min1 && root.val < max1)
        {
            return lowestCommonAncestor(root.right,p,q);
        }
         return lowestCommonAncestor(root.left,p,q);
        
    }
}