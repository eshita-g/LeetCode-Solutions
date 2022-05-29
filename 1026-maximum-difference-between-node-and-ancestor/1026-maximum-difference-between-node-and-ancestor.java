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
    public int findValue(TreeNode root,int maxVal,int minVal)
    {
        if(root == null)
            return maxVal-minVal;
        
        maxVal = Math.max(maxVal,root.val);
        minVal = Math.min(minVal,root.val);
        int left = findValue(root.left,maxVal,minVal);
        int right = findValue(root.right,maxVal,minVal);
        
        return Math.max(left,right);
    }
    
    public int maxAncestorDiff(TreeNode root) {
        if(root == null)
            return 0;
        
        return findValue(root,root.val,root.val);
        
    }
}