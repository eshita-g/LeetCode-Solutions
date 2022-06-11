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
    public void addElement(TreeNode root,List<Integer> res)
    {
        if(root == null)
            return;
        
        addElement(root.left,res);
        res.add(root.val);
        addElement(root.right,res);
    }
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        addElement(root1,l1);
        addElement(root2,l2);
        List<Integer> res = new ArrayList<Integer>();
        int n1 = l1.size();
        int n2 = l2.size();
        int i =0,j=0;
        while(i<n1 && j<n2)
        {
            if(l1.get(i) < l2.get(j))
            {
                res.add(l1.get(i));
                i++;
            }
            else
            {
                res.add(l2.get(j));
                j++;
            }
        }
        res.addAll(l1.subList(i,n1));
        res.addAll(l2.subList(j,n2));
        return res;
        
    }
}