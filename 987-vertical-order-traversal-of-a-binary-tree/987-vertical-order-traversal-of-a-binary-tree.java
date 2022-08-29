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
class Pair{
    int hd;
    int l;
    TreeNode node;
    Pair(int hd,int l,TreeNode node)
    {
        this.hd = hd;
        this.l = l;
        this.node = node;
        
    }
}
class Solution {
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        
        TreeMap<Integer,TreeMap<Integer,PriorityQueue<Integer>>> map = new TreeMap<>();
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(0,0,root));
        while(!q.isEmpty())
        {
            Pair p = q.remove();
            TreeNode ptr = p.node;
            int hd = p.hd;
            int l= p.l;
            if(!map.containsKey(hd))
            {
                map.put(hd,new TreeMap<>());
            }
            if(!map.get(hd).containsKey(l))
            {
                map.get(hd).put(l,new PriorityQueue<>());
            }
            map.get(hd).get(l).add(ptr.val);
            if(ptr.left != null)
            {
                q.add(new Pair(hd-1,l+1,ptr.left));
            }
            if(ptr.right != null)
            {
                q.add(new Pair(hd+1,l+1,ptr.right));
            }
        }
        List<List<Integer>> res = new ArrayList<>();
        for(TreeMap<Integer,PriorityQueue<Integer>> val : map.values())
        {
            res.add(new ArrayList<>());
            for(PriorityQueue<Integer> nodes : val.values())
            {
                while(!nodes.isEmpty())
                {
                    res.get(res.size() - 1).add(nodes.poll());
                }
            }
        }
      return res;      
    }
}