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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if(root == null)
            return res;
        
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int r = 0;
        while(!q.isEmpty())
        {
            int p = q.size();
            List<Integer> ans = new ArrayList<>();
            while(p > 0)
            {
                TreeNode ptr = q.remove();
                r = ptr.val;
                ans.add(ptr.val);
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
            res.add(r);
        }
        
        return res;
    }
}