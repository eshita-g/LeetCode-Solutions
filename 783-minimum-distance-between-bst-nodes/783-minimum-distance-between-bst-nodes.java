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
    int minVal = Integer.MAX_VALUE;
    int prev = -1;
    public void inorder(TreeNode root)
    {
        if(root == null)
            return;
        inorder(root.left);
        if(prev >= 0)
        {
            minVal = Math.min(minVal, Math.abs(prev - root.val));
        }
        prev = root.val;
        inorder(root.right);
    }
    public int minDiffInBST(TreeNode root) {
        
        if(root == null)
            return 0;
        
        inorder(root);
        return minVal;
    }
}