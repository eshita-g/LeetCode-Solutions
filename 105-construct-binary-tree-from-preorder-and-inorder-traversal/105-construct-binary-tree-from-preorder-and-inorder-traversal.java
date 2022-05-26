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
    TreeNode build(int[] preorder,int[] inorder,int i1,int j1,int i2,int j2,HashMap<Integer,Integer> res)
    {
        if(i1 > j1)
            return null;
        TreeNode root = new TreeNode(preorder[i1]);
        root.left = null;
        root.right = null;
        int i = res.get(preorder[i1]);
        root.left = build(preorder,inorder,i1+1,i1+i-i2,i2,i-1,res);
        root.right = build(preorder,inorder,i1+i-i2+1,j1,i+1,j2,res);
        
        return root;
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int n = preorder.length;
        HashMap<Integer,Integer> res = new HashMap<>();
        for(int i=0;i<n;i++)
        {
            res.put(inorder[i],i);
        }
        TreeNode root = build(preorder,inorder,0,n-1,0,n-1,res);
        
        return root;
        
    }
}