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
    public static class Diapair{
        int ht;
        int dia;
        
    }
    public static Diapair diameter2(TreeNode node){
        if(node == null)
        {
            Diapair bp=new Diapair();
            bp.ht=0;
            bp.dia=0;
            return bp;
        }
        Diapair left = diameter2(node.left);
        Diapair right = diameter2(node.right);
        Diapair mp=new Diapair();
        mp.ht = 1 + Math.max(left.ht,right.ht);
        int nes=left.ht+right.ht+1; 
        mp.dia = Math.max(nes ,Math.max(left.dia, right.dia));
        
        return mp;
    }
    
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null)
            return 0;
         Diapair diameter ;
        diameter = diameter2(root);
        return diameter.dia - 1; 
    
       
        
    }
}