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
class Node {
    int minNode;
    int maxNode;
    boolean valid;
    int sum;
    
    Node(int minNode,int maxNode,boolean valid,int sum)
    {
        this.minNode= minNode;
        this.maxNode = maxNode;
        this.valid = valid ;
        this.sum = sum;
    }
    
}
class Solution {
    
    int maxSum = 0;
    public Node helper(TreeNode root)
    {
        if(root == null)
        {
            return new Node(Integer.MAX_VALUE,Integer.MIN_VALUE,true,0);
        }
        Node left = helper(root.left);
        Node right = helper(root.right);
        if(left.maxNode < root.val && root.val < right.minNode && left.valid == true && right.valid == true)
        {
            maxSum = Math.max(maxSum,left.sum + right.sum + root.val);
            return new Node(Math.min(root.val, left.minNode),Math.max(root.val,right.maxNode),true,left.sum + right.sum + root.val);
        }
        
        System.out.println(Math.max(left.sum,right.sum));
        return new Node(Integer.MIN_VALUE,Integer.MAX_VALUE,false,Math.max(left.sum,right.sum));
        
    }
    public int maxSumBST(TreeNode root) {
        
        helper(root);
        
        return maxSum;
        
    }
}