/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public void findParent(TreeNode root,HashMap<TreeNode,TreeNode> parent)
    {
        Queue<TreeNode> q= new LinkedList<>();
        q.add(root);
        while(!q.isEmpty())
        {
            TreeNode ptr = q.remove();
            if(ptr.left != null)
            {
                parent.put(ptr.left,ptr);
                q.add(ptr.left);
            }
            if(ptr.right !=null)
            {
                parent.put(ptr.right,ptr);
                q.add(ptr.right);
            }
        }
    }
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
       
        HashMap<TreeNode,TreeNode> parent = new HashMap<>();
        findParent(root,parent);
        HashMap<TreeNode,Boolean> vis = new HashMap<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(target);
        vis.put(target,true);
        int cur = 0;
        while(!q.isEmpty())
        {
            int size =q.size();
            if(cur == k)
                break;
            cur++;
            while(size > 0)
            {
                TreeNode ptr = q.remove();
                if(ptr.left != null && vis.get(ptr.left) == null)
                {
                    q.add(ptr.left);
                    vis.put(ptr.left,true);
                }
                if(ptr.right != null && vis.get(ptr.right) == null)
                {
                    q.add(ptr.right);
                    vis.put(ptr.right,true);
                }
                if(parent.get(ptr) != null && vis.get(parent.get(ptr)) == null)
                {
                    q.add(parent.get(ptr));
                    vis.put(parent.get(ptr),true);
                }
                size--;
            }
        }
        List<Integer> res = new ArrayList<>();
        while(!q.isEmpty())
        {
            TreeNode ptr = q.remove();
            res.add(ptr.val);
        }
        
        return res;
    }
}