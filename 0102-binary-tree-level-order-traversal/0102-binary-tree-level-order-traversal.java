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
    public List<List<Integer>> levelOrder(TreeNode root) {
        
        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> res = new ArrayList<>();
        if(root == null)
            return res;
        
        q.add(root);
        while(!q.isEmpty())
        {
            int p = q.size();
            List<Integer> l = new ArrayList<>();
            for(int i=0;i<p;i++)
            {
                TreeNode ptr = q.remove();
                l.add(ptr.val);
                if(ptr.left != null)
                {
                    q.add(ptr.left);
                }
                if(ptr.right != null)
                {
                    q.add(ptr.right);
                }
            
            }
            res.add(l);
        }
        
        return res;
        
    }
}