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
    public void inorder(TreeNode root,List<Integer> l1)
    {
        if(root==null)
            return;
        inorder(root.left,l1);
        l1.add(root.val);
        inorder(root.right,l1);
    }
    public int rangeSumBST(TreeNode root, int low, int high) {
        
        List<Integer> l1 = new ArrayList<Integer>();
        inorder(root,l1);
        int n = l1.size();
        int i;
        for(i=0;i<n;i++)
        {
            if(l1.get(i) == low)
            {
                break;
            }
        }
        int sum = 0;
        while(i<n)
        {
            sum = sum + l1.get(i);
            if(l1.get(i) == high)
            {
                break;
            }
            i++;
        }
        return sum;
        
    }
}