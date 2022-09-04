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
    int count = 0;
    public void helper(TreeNode root,List<Integer> res,int k)
    {
        if(root == null)
            return;
        res.add(root.val);
        helper(root.left,res,k);
        helper(root.right,res,k);
        long s = 0;
        for(int i= res.size()-1;i>=0;i--)
        {
            s = s + res.get(i);
            if(s  == k)
                count++;
        }
        res.remove(res.size()-1);
    }
    public int pathSum(TreeNode root, int targetSum) {
        
        if(root == null)
            return 0;
        List<Integer> res = new ArrayList<>();
        helper(root,res,targetSum);
        return count;
        
    }
}