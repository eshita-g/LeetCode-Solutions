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
    private void preorder(TreeNode ptr,StringBuilder sb)
    {
        if(ptr == null)
        {
            sb.append("null");
            return;
        }
        sb.append('#' + ptr.val);
        preorder(ptr.left,sb);
        preorder(ptr.right,sb);
    }
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        
        StringBuilder sb = new StringBuilder();
        preorder(root,sb);
        String main = sb.toString();
        sb = new StringBuilder();
        preorder(subRoot,sb);
        String sub = sb.toString();
        boolean res = main.indexOf(sub) >= 0;
        
        return res;
        
    }
}