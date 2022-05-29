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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root == null)
        {
            TreeNode ptr = new TreeNode(val);
            ptr.left = null;
            ptr.right = null;
            return ptr;
        }
        TreeNode ptr = root;
        TreeNode parent = null;
        while(ptr != null)
        {
            if(ptr.val < val)
            {
                parent = ptr;
                ptr = ptr.right;
            }
            else
            {
                parent = ptr;
                ptr = ptr.left;
            }
            
        }
        if(parent.val < val)
        {
            TreeNode cpt = new TreeNode(val);
            parent.right = cpt;
            cpt.left = null;
            cpt.right = null;
        }
        else
        {
            
            TreeNode cpt = new TreeNode(val);
            parent.left = cpt;
            cpt.left = null;
            cpt.right = null;
        }
        return root;
    }
}