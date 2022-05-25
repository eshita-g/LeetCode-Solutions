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
    public int countNodes(TreeNode root) {
        
        if(root == null)
            return 0;
        int left = findLeft(root.left);
        int right = findRight(root.right);
        
        if(left == right)
        {
            int h = left + 1;
            int ans = getCount(2,h) - 1;
            return ans;
            
        }
        else
        {
            return 1 + countNodes(root.left) + countNodes(root.right);
        }
        
    }
    public int getCount(int x,int y)
    {
        if(y  == 0)
            return 1;
        int p = getCount(x,y/2);
        if(y%2 == 0)
            return p*p;
        
        return p*p*x;
        
    }
    public int findLeft(TreeNode root)
    {
        if(root == null)
            return 0;
        int c = 0;
        while(root != null)
        {
            c++;
            root = root.left;
        }
        return c;
    }
    public int findRight(TreeNode root)
    {
        if(root == null)
            return 0;
        int c = 0;
        while(root!=null)
        {
            c++;
            root = root.right;
        }
        return c;
    }
}