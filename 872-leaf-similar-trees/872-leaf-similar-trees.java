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
    public void genLeaves(TreeNode root, List<Integer> res)
    {
        if(root == null)
            return;
        if(root.left == null && root.right == null)
        {
            res.add(root.val);
            return;
        }
        genLeaves(root.left,res);
        genLeaves(root.right,res);
    }
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        
        if(root1 == null && root2 == null)
            return true;
        
        if(root1 == null)
            return false;
        if(root2 == null)
            return false;
        List<Integer> res1 = new ArrayList<>();
        List<Integer> res2 = new ArrayList<>();
        genLeaves(root1,res1);
        genLeaves(root2,res2);
        
        if(res1.equals(res2))
            return true;
        return false;
        
        
        
    }
}