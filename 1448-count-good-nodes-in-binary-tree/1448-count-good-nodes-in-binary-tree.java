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
    int res = 0;
    
    public int goodNodes(TreeNode root) {
        
        if(root == null)
            return 0;
        help(root,root.val);
        
        return res;
        
    }
    public void help(TreeNode root,int seen)
    {
        if(root == null)
            return;
        if(root.val >= seen)
        {
            res++;
        }
        seen = Math.max(root.val,seen);
        help(root.left,seen);
        help(root.right,seen);
    }
}