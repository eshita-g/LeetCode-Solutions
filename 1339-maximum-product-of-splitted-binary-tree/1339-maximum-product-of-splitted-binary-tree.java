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
    long maxSum = 0;
    public long getProd(TreeNode root,long total)
    {
        if(root == null)
            return 0;
        
        long left = getProd(root.left,total);
        long right = getProd(root.right,total);
        long subtree = root.val + left + right;
        
        System.out.println(subtree);
        maxSum = Math.max(maxSum,(total - subtree) * subtree);
        
        return subtree;
    }
    public long getAllSum(TreeNode root)
    {
        if(root == null)
            return 0;
        
        return root.val + getAllSum(root.left) + getAllSum(root.right); 
    }
    public int maxProduct(TreeNode root) {
        
        long total = getAllSum(root);
        getProd(root,total);
        long mod = 1000000007;
        
        int res =(int)(maxSum % mod);
        
        
        return res;
        
    }
}