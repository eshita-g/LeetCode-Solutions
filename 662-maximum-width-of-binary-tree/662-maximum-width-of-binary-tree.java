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
    TreeNode node;
    int num;
    Pair(TreeNode node,int num){
        
        this.node = node;
        this.num = num;
    }
}
class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        if(root == null)
            return 0;
        int ans = 0;
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(root,0));
        while(!q.isEmpty())
        {
            int size = q.size();
            int minVal = q.peek().num;
            int f = 0;
            int l = 0;
            for(int i=0;i<size;i++)
            {
                int cur = q.peek().num - minVal;
                TreeNode ptr = q.peek().node;
                q.poll();
                if(i == 0)
                {
                    f = cur;
                }
                if(i == size -1)
                {
                    l = cur;
                }
                if(ptr.left!=null)
                {
                    q.add(new Pair(ptr.left,2*cur+1));
                }
                if(ptr.right != null)
                {
                    q.add(new Pair(ptr.right,2*cur+2));
                }
            }
            ans = Math.max(ans,l-f+1);
        }
        return ans;
    }
}