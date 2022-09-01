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
        int cur =  root.val;
        if(p.val < cur && q.val < cur)
        {
         return lowestCommonAncestor(root.left,p,q);
        }
        if(p.val > cur && q.val > cur)
        {
            return lowestCommonAncestor(root.right,p,q);
        }
        
        return root;
    }
}