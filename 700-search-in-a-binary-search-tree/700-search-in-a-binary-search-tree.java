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
    TreeNode search(TreeNode cur,int val)
    {
        if(cur == null)
            return null;
        if(cur.val == val)
            return cur;
        if(cur.val > val)
        {
            return search(cur.left,val);
        }
        else
        {
            return search(cur.right,val);
        }
    }
    
    public TreeNode searchBST(TreeNode root, int val) {
        
        return search(root,val);
        
    }
}