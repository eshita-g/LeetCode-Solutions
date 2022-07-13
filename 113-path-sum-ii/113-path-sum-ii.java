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
    List<List<Integer>> res = new ArrayList<>();
    public void traversal(TreeNode root,int sum,List<Integer> list,int targetSum)
    {
        if(root == null)
            return;
        list.add(root.val);
        sum = sum + root.val;
        if(root.left == null && root.right == null)
        {
            if(sum == targetSum)
            {
                res.add(new ArrayList(list));
            }
        }
        traversal(root.left,sum,list,targetSum);
        traversal(root.right,sum,list,targetSum);
        list.remove(list.size() - 1);
    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        
        traversal(root,0,new ArrayList(),targetSum);
        
        return res;
    }
}