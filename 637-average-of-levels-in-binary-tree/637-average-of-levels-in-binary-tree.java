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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> res = new ArrayList<>();
        if(root == null)
            return res;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty())
        {
            int p = q.size();
            List<Double> ans = new ArrayList<>();
            while(p > 0)
            {
                TreeNode ptr = q.remove();
                ans.add((double)ptr.val);
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
            double d = 0.0;
            int i =0;
            int s = ans.size();
            while(i < s)
            {
                d = d + ans.get(i);
                i++;
            }
            d = d / s;
            res.add(d);
        }
        
        return res;
        
    }
}