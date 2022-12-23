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
    public TreeNode lcaFind(TreeNode root,int p,int q)
    {
        if(root == null)
            return null;
        
        if(root.val == p || root.val == q)
            return root;
        
        TreeNode left = lcaFind(root.left,p,q);
        TreeNode right = lcaFind(root.right,p,q);
        
        if(left == null)
            return right;
        
        if(right == null)
            return left;
        
        return root;
    }
    public TreeNode findPath(TreeNode root,int p,StringBuilder s)
    {
        if(root == null)
            return null;
        if(root.val == p)
            return root;

        s.append('L');
        
        TreeNode left = findPath(root.left,p,s);
        if(left != null)
            return left;
        
        s.setLength(s.length() - 1);
        
        s.append('R');
        TreeNode right = findPath(root.right,p,s);
        
        if(right != null)
            return right;
        
        s.setLength(s.length() - 1);
        return null;
        
        
        
    }
    public String getDirections(TreeNode root, int startValue, int destValue) {
        
        TreeNode lcaNode = lcaFind(root,startValue,destValue);
        
        System.out.println(lcaNode.val);
        
        StringBuilder s1 = new StringBuilder();
        
        findPath(lcaNode,startValue,s1);
        
        StringBuilder s2 = new StringBuilder();
        
        findPath(lcaNode,destValue,s2);
        
      // System.out.println(s1);
       System.out.println(s2);
        
        for(int i=0;i<s1.length();i++)
        {
            s1.setCharAt(i,'U');
        } 
        
        return s1.append(s2).toString();
    }
    
}