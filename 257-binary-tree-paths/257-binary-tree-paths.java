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
    public void printPaths(TreeNode root, List<String> res,List<String> path)
    {
        if(root == null)
            return;
        path.add(root.val + "");
        if(root.left == null && root.right == null)
        {
            res.add(String.join("->",path));
            
        }
        else
        {
            printPaths(root.left,res,path);
            printPaths(root.right,res,path);
        }
        path.remove(path.size() - 1);
        
    }
    
    public List<String> binaryTreePaths(TreeNode root) {
        
        List<String> res = new ArrayList<>();
        List<String> path = new ArrayList<>();
        if(root == null)
            return res;
        
        printPaths(root,res,path);
        return res;
        
        
    }
}