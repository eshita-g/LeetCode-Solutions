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
    public TreeNode makeBst(int i,int j,int[] preorder,int[] next)
    {
        if(i > j)
            return null;
        TreeNode root = new TreeNode(preorder[i],null,null);
        root.left = makeBst(i+1,next[i]-1,preorder,next);
        root.right = makeBst(next[i],j,preorder,next);
        
        return root;
    }
    public TreeNode bstFromPreorder(int[] preorder) {
        
        int n = preorder.length;
        Stack<Integer> stk = new Stack<>();
        int[] next = new int[n];
        stk.push(0);
        for(int i=1;i<n;i++)
        {
            while(!stk.empty() && preorder[i] > preorder[stk.peek()])
            {
                next[stk.peek()] = i;
                stk.pop();
            }
            stk.push(i);
            
        }
        while(!stk.empty())
        {
            next[stk.peek()] = n;
            stk.pop();
        }
     
        TreeNode root = makeBst(0,n-1,preorder,next);
        
        return root;
        
    }
}