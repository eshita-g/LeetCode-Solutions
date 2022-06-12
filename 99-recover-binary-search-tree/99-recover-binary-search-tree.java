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
    TreeNode prev = null;
    TreeNode n1;
    TreeNode n2;
    TreeNode n3;
    int count = 0;
    public void inorder(TreeNode root)
    {
        if(root == null)
        {
            return;
        }
        inorder(root.left);
        if(prev == null)
            prev = root;
        else
        {
            if(root.val < prev.val)
            {
                count++;
                if(count == 1)
                {
                    n1 = prev;
                    n2 = root;
                }
                else if(count == 2)
                {
                    n3 = root;
                }
            }
            prev = root;
        }
        inorder(root.right);
    }
    public void recoverTree(TreeNode root) {
        TreeNode temp;
        inorder(root);
        if(count == 1)
        {
            int p  = n1.val;
             n1.val = n2.val;
            n2.val = p;
        }
        else if(count == 2)
        {
            int p = n3.val;
            n3.val = n1.val;
            n1.val = p;
        }
    }
}