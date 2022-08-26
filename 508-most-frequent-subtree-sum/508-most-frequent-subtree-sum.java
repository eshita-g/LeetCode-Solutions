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
    public int[] findFrequentTreeSum(TreeNode root) {
        
        HashMap<Integer,Integer> map = new HashMap<>();
        subtreeSum(root,map);
        int maxf = 0;
        for(Integer i : map.keySet())
        {
            maxf = Math.max(maxf,map.get(i));
        }
        int count = 0;
        for(Integer i : map.keySet())
        {
            if(maxf == map.get(i))
            {
                count++;
            }
        }
        int[] res = new int[count];
        int k = 0;
        for(Integer i:map.keySet())
        {
            if(maxf == map.get(i))
            {
                res[k] = i;
                k++;
            }
        }
        
        return res;
    }
    public int subtreeSum(TreeNode root, HashMap<Integer,Integer> map)
    {
        if(root == null)
            return 0;
        
        int left = subtreeSum(root.left,map);
        int right = subtreeSum(root.right,map);
        
        map.put(left+right+root.val,map.getOrDefault(left+right+root.val,0)+1);
        
        return left+right+root.val;
    }
}