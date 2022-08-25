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
    int sum = 0;
    public void help(TreeNode root,List<String> temp)
    {
        if(root == null)
            return;
        temp.add(root.val + "");
        if(root.left == null && root.right == null)
        {
            StringBuilder sb = new StringBuilder();
            for(int i=0;i<temp.size();i++)
            {
                //System.out.print(temp.get(i));
                sb.append(temp.get(i));
            }
            String s = sb.toString();
            //System.out.println(s + " ");
            int p = Integer.parseInt(s);
            System.out.println(p + " ");
            
            sum = sum + p;
        }
        else
        {
            help(root.left,temp);
            help(root.right,temp);
        }
        temp.remove(temp.size() - 1);
    }
    public int sumNumbers(TreeNode root) {
        
        List<String> temp = new ArrayList<>();
        help(root,temp);
        
        return sum;
        
    }
}