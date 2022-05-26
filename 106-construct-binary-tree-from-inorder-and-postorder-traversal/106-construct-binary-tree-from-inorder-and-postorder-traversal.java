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
    TreeNode build(int[] postorder,int[] inorder,int i1,int j1,int i2,int j2,HashMap<Integer,Integer> res)
    {
        if(i1 > j1)
            return null;
        TreeNode root = new TreeNode(postorder[j1]);
        root.left = null;
        root.right = null;
        int i = res.get(postorder[j1]);
        root.left = build(postorder,inorder,i1,i1+i-i2-1,i2,i-1,res);
        root.right = build(postorder,inorder,i1+i-i2,j1-1,i+1,j2,res);
        
        return root;
    }
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        
        int n = postorder.length;
        HashMap<Integer,Integer> res = new HashMap<>();
        for(int i=0;i<n;i++)
        {
            res.put(inorder[i],i);
        }
        TreeNode root = build(postorder,inorder,0,n-1,0,n-1,res);
        
        return root;
        
    }
}