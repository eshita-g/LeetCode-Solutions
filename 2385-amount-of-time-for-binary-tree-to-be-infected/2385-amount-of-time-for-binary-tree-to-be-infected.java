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
    TreeNode origin = null;
    public void findParent(TreeNode root,HashMap<TreeNode,TreeNode> parent,int start)
    {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty())
        {
            TreeNode ptr = q.remove();
            if(ptr.left != null)
            {
                parent.put(ptr.left,ptr);
                q.add(ptr.left);
            }
            if(ptr.right != null)
            {
                parent.put(ptr.right,ptr);
                q.add(ptr.right);
            }
            if(ptr.val ==  start)
            {
                origin = ptr;
            }
        }
    }
    public int amountOfTime(TreeNode root, int start) {
        
        HashMap<TreeNode,TreeNode> parent = new HashMap<>();
        findParent(root,parent,start);
        Queue<TreeNode> q = new LinkedList<>();
        int time = 0;
        HashMap<TreeNode,Boolean> vis = new HashMap<>();
        q.add(origin);
        vis.put(origin,true);
        while(!q.isEmpty())
        {
            int size = q.size();
            time++;
            while(size>0)
            {
                TreeNode ptr = q.remove();
                if(ptr.left != null && vis.get(ptr.left) == null)
                {
                    vis.put(ptr.left,true);
                    q.add(ptr.left);
                }
                if(ptr.right != null && vis.get(ptr.right) == null)
                {
                    vis.put(ptr.right,true);
                    q.add(ptr.right);
                }
                if(parent.get(ptr) != null && vis.get(parent.get(ptr)) == null)
                {
                    vis.put(parent.get(ptr),true);
                    q.add(parent.get(ptr));
                }
                size--;
            }
        }
        
        return time-1;
    }
}