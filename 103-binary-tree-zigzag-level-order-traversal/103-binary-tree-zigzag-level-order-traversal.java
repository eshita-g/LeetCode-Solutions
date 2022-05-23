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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        
        List<List<Integer>> res = new ArrayList<>();
        if(root == null)
            return res;
        Queue<TreeNode> q = new LinkedList<>();
        int level = 0;
        q.add(root);
        while(!q.isEmpty())
        {
            int p = q.size();
            List<Integer> l = new ArrayList<>();
            while(p > 0)
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
              p = p-1;  
            }
            if(level %2 != 0)
            {
                Collections.reverse(l);
                res.add(l);
            }
            else
            {
                res.add(l);
            }
            level = level + 1;
        }
        
        return res;
    }
}