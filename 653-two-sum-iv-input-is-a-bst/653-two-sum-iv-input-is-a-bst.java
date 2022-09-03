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
    public void moveLeft(Stack<TreeNode> stk1)
    {
        TreeNode n = stk1.peek();
        stk1.pop();
        TreeNode temp = n.right;
        while(temp!=null)
        {
            stk1.push(temp);
            temp = temp.left;
            
        }
    }
    public void moveRight(Stack<TreeNode> stk2)
    {
        TreeNode n = stk2.peek();
        stk2.pop();
        TreeNode temp = n.left;
        while(temp != null)
        {
            stk2.push(temp);
            temp = temp.right;
        }
    }
    public boolean findTarget(TreeNode root, int k) {
        
        Stack<TreeNode> stk1 = new Stack<>();
        Stack<TreeNode> stk2 = new Stack<>();
        TreeNode node = root;
        while(node != null)
        {
            stk1.push(node);
            node = node.left;
        }
        node = root;
        while(node != null)
        {
            stk2.push(node);
            node = node.right;
        }
        while(stk1.peek() != stk2.peek())
        {
            int x = stk1.peek().val;
            int y = stk2.peek().val;
            if(x + y == k)
                return true;
            
            else if(x+y < k)
            {
              moveLeft(stk1);   
            }
            else
            {
                moveRight(stk2);
            }
        }
        
        return false;
        
    }
}