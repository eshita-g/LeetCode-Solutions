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
    public List<Integer> inorderTraversal(TreeNode root) {
        
        Stack<TreeNode> stk = new Stack<>();
        List<Integer> res = new ArrayList<>();
        if(root == null)
            return res;
        TreeNode p = root;
        while(p != null)
        {
            stk.push(p);
            p = p.left;
        }
        while(!stk.empty())
        {
            TreeNode temp = stk.peek();
            stk.pop();
            res.add(temp.val);
            TreeNode r = temp.right;
            while(r!= null)
            {
                stk.push(r);
                r = r.left;
            }
        }
        
        return res;
    }
}