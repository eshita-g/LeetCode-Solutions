/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        
        if(root == null)
            return "#";
        String res = root.val + "," + serialize(root.left) + "," + serialize(root.right);
        
        return res;
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        
        Queue<String> q = new LinkedList<>();
        q.addAll(Arrays.asList(data.split(",")));
        
        return help(q);
    }
    public TreeNode help(Queue<String> q)
    {
        String s = q.poll();
        if(s.equals("#")) return null;
        TreeNode node  = new TreeNode(Integer.valueOf(s));
        node.left = help(q);
        node.right = help(q);
        
        return node;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// String tree = ser.serialize(root);
// TreeNode ans = deser.deserialize(tree);
// return ans;