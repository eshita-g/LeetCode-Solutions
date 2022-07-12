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
    public int maxLevelSum(TreeNode root) {
      
        Queue <TreeNode> q = new LinkedList<>();
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        int level = 1;
        int maxLevel = 1;
        
        q.add(root);
        while(!q.isEmpty())
        {
            int p = q.size();
            sum = 0;
            while(p > 0)
            {
                TreeNode ptr = q.remove();
                sum = sum + ptr.val;
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
            if(sum > maxSum)
            {
                maxSum = sum;
                maxLevel = level;
                System.out.println(maxSum);
            }
            level++;
        }
        
        return maxLevel;
        
    }
}