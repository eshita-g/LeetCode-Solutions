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
class BSTIterator {
    
    ArrayList<Integer> res = new ArrayList<>();
    int c = 0;
    public void traverse(TreeNode root)
    {
        
        if(root == null)
            return;
        traverse(root.left);
        res.add(root.val);
        traverse(root.right);
    }

    public BSTIterator(TreeNode root) {
        
        traverse(root);
    }
    
    public int next() {
        
        int out = res.get(c);
        c++;
        
        return out;
        
    }
    
    public boolean hasNext() {
        
        if(c < res.size())
            return true;
        
        return false;
        
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */