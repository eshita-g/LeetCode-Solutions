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
    int sum = 0;
    public void help(TreeNode cur)
    {
        if(cur.left != null)
        {
            if(cur.left.left != null)
            {
                sum = sum + cur.left.left.val;
            }
            if(cur.left.right != null)
            {
                sum = sum + cur.left.right.val;
            }
        }
        if(cur.right != null)
        {
            if(cur.right.left != null)
            {
                sum = sum+ cur.right.left.val;
            }
            if(cur.right.right != null)
            {
                sum = sum + cur.right.right.val;
            }
        }
    }
    
    public int sumEvenGrandparent(TreeNode root) {
        
        if(root == null)
            return 0;
        
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        
        while(!q.isEmpty())
        {
            TreeNode ptr = q.remove();
            if(ptr != null && ptr.val % 2 == 0)
            {
                help(ptr);
            }
            if(ptr.left != null)
            {
                q.add(ptr.left);
            }
            if(ptr.right !=  null)
            {
                q.add(ptr.right);
            }
        }
        
        return sum;
        
        
    }
}