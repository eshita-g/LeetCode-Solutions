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
    boolean res = false;
    public void isPath(TreeNode root, int targetSum,int k)
    {
        if(root.left == null && root.right == null)
        {
            k = root.val + k;
            if( k == targetSum)
            {
                res = true;
                return;
            }
        }
        if(root.left != null)
            isPath(root.left,targetSum,k+root.val);
        if(root.right != null)
        {
            isPath(root.right,targetSum,k+root.val);
        }
        
    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        
        if(root == null)
            return false;
        
        isPath(root,targetSum,0);
        
        return res;
        
        
    }
}