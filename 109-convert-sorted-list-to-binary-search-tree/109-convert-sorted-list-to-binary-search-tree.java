/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
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
    public TreeNode makeTree(List<Integer> res,int i,int j)
    {
        if(i>j)
            return null;
        int m = (i+j)/2;
        TreeNode root = new TreeNode(res.get(m),null,null);
        root.left = makeTree(res,i,m-1);
        root.right = makeTree(res,m+1,j);
        
        return root;
    }
    public TreeNode sortedListToBST(ListNode head) {
        
        List<Integer> res = new ArrayList<>();
        while(head!=null)
        {
            res.add(head.val);
            head = head.next;
            
        }
        int n = res.size();
        TreeNode root = makeTree(res,0,n-1);
        
        return root;
        
    }
}