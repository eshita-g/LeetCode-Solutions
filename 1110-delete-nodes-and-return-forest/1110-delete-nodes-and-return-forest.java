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
    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        
        List<TreeNode> forest = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<to_delete.length;i++)
        {
            set.add(to_delete[i]);
        }
        delete(root,forest,set);
        if(!set.contains(root.val))
        {
            forest.add(root);
        }
        
        return forest;
    }
    
    public TreeNode delete(TreeNode node,List<TreeNode> forest,Set<Integer> set)
    {
        if(node == null)
            return null;
        
        node.left = delete(node.left,forest,set);
        node.right = delete(node.right,forest,set);
        
        if(set.contains(node.val))
        {
            if(node.left != null)
            {
                forest.add(node.left);
            }
            if(node.right  != null)
            {
                forest.add(node.right);
            }
            return null;
        }
        
        return node;
    }
}