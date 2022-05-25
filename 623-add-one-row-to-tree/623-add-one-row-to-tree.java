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
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if(depth == 1)
        {
            TreeNode n = new TreeNode(val);
            n.left = root;
            return n;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int d = 1;
        while(d < depth - 1)
        {
            Queue<TreeNode> temp = new LinkedList<>();
            while(!q.isEmpty())
            {
                TreeNode ptr = q.remove();
                if(ptr.left != null)
                {
                    temp.add(ptr.left);
                }
                if(ptr.right != null)
                {
                    temp.add(ptr.right);
                }
            }
            q = temp;
            d++;
        }
        while(!q.isEmpty())
        {
            TreeNode ptr = q.remove();
            TreeNode temp = ptr.left;
            ptr.left = new TreeNode(val);
            ptr.left.left = temp;
            temp = ptr.right;
            ptr.right = new TreeNode(val);
            ptr.right.right = temp;
        }
        return root;
    }
}