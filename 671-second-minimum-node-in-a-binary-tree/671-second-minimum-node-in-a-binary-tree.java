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
    public void traverse(TreeNode root,ArrayList<Integer> res)
    {
        if(root == null)
            return;
        traverse(root.left,res);
        res.add(root.val);
        traverse(root.right,res);
    }
    public int findSecondMinimumValue(TreeNode root) {
        ArrayList<Integer> res = new ArrayList<>();
        traverse(root,res);
        Collections.sort(res);
        int n = res.size();
        int a = res.get(0);
        for(int i=0;i<n;i++)
        {
            if(a!=res.get(i))
            {
                return res.get(i);
            }
        }
        
        
        return -1;
        
    }
}