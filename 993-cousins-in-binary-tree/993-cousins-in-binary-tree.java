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
    public boolean isCousins(TreeNode root, int x, int y) {
        if(root == null)
            return false;
        
        HashMap<TreeNode,TreeNode> child = new HashMap<>();
        child.put(root, null);  
        
        Queue<TreeNode> q = new LinkedList<>();      
        q.add(root);   
        
        while(q.isEmpty() == false)
        {
            TreeNode parX = null;
            TreeNode parY = null;
            boolean isX = false;
            boolean isY = false;
            
            int p= q.size();
            
            while(p > 0)
            {
                TreeNode ptr = q.poll();
                
                if(ptr.val == x)
                {
                    isX = true;
                    parX = child.get(ptr);
                }
                if(ptr.val == y)
                {
                    isY = true;
                    parY = child.get(ptr);
                }
                if(ptr.left != null)
                {
                    child.put(ptr.left,ptr);
                    q.add(ptr.left);
                }
                if(ptr.right != null)
                {
                    child.put(ptr.right,ptr);
                    q.add(ptr.right);
                }
                p = p-1;
            }
            if(isX == true && isY == true && parX != parY)
                return true;
            
        }
        return false;
    }
}