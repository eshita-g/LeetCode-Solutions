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
    
    public TreeNode makeTree(int[] nums,int i,int j)
    {
        if(i > j)
            return null;
        int m = (i+j)/2;
        TreeNode root = new TreeNode(nums[m],null,null);
        root.left = makeTree(nums,i,m-1);
        root.right = makeTree(nums,m+1,j);
        
        return root;
        
    }
    public TreeNode sortedArrayToBST(int[] nums) {
        
        
        TreeNode root = makeTree(nums,0,nums.length-1);
            
        return root;
    }
}