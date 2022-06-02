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
    static int res = 0;
    static int c = 0;
    public void traverse(TreeNode root,int k)
    {
        if(root == null)
            return;
        traverse(root.left,k);
        c++;
        if(c == k)
        {
            res = root.val;
            return;
        }
        traverse(root.right,k);
        
    }
        
    
    public int kthSmallest(TreeNode root, int k) {
       
        c = 0;
        res = 0;
        traverse(root,k);
        
        return res;
        
    }
}