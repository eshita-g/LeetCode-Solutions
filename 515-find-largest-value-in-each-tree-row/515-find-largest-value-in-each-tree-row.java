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
    public List<Integer> largestValues(TreeNode root) {
        
        List<Integer> res = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if(root == null)
            return res;
        q.add(root);
        while(!q.isEmpty())
        {
            int maxVal = Integer.MIN_VALUE;
            int p =q.size();
            while( p > 0)
            {
                TreeNode ptr = q.remove();
                maxVal = Math.max(maxVal,ptr.val);
                if(ptr.left != null)
                {
                    q.add(ptr.left);
                }
                if(ptr.right != null)
                {
                    q.add(ptr.right);
                }
                p--;
            }
            res.add(maxVal);
        }
        
        return res;
    }
}