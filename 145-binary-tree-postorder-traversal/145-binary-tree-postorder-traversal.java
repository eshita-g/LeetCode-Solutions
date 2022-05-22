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
    public List<Integer> postorderTraversal(TreeNode root) {
        
        Stack<TreeNode> stk = new Stack<>();
        List<Integer> res = new ArrayList<>();
        if(root == null)
            return res;
        stk.push(root);
        while(!stk.empty())
        {
            TreeNode p = stk.peek();
            stk.pop();
            res.add(p.val);
            if(p.left != null)
            {
                stk.push(p.left);
            }
            if(p.right != null)
            {
                stk.push(p.right);
            }
        }
        Collections.reverse(res);
        
        return res;
        
        
    }
}