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
    int ans = 0;
    public int maxHeight(TreeNode root)
    {
        if(root == null)
            return 0;
        return 1 + Math.max(maxHeight(root.left),maxHeight(root.right));
    }
    
    public void maxSum(TreeNode root, int d,int max )
    {
        if(root == null)
            return;
        
        if( d == max)
            ans = ans + root.val;
        
        maxSum(root.left,d+1,max);
        maxSum(root.right, d+1,max);
        
        
    }
    
    public int deepestLeavesSum(TreeNode root) {
        if(root == null)
            return 0;
        int max = maxHeight(root);
        maxSum(root,1,max);
        
        return ans;
    }
}