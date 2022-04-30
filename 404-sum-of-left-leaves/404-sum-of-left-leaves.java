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
    int sum  = 0;
    public int sumOfLeftLeaves(TreeNode root) {
        
        sumOfLeft(root);
        
        return sum;
        
        
    }
    void sumOfLeft(TreeNode root)
    {
        if(root == null)
            return;
        if(root.left != null && root.left.left == null && root.left.right == null)
        {
            sum = sum + root.left.val;
        }
        sumOfLeft(root.left);
        sumOfLeft(root.right);
    }
}