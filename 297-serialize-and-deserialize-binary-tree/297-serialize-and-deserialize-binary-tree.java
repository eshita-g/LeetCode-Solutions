
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
	static int i;
	// Encodes a tree to a single string.
	public String serialize(TreeNode root) {

		if (root == null)
			return "#";
		String res = root.val + "," + serialize(root.left) + "," + serialize(root.right);

		return res;
	}
	public TreeNode des(ArrayList<String> pre)
	{
		String value = pre.get(i);
		if ("#".equals(value))
		{
			i++;
			return null;
		}
		TreeNode n = new TreeNode(Integer.valueOf(pre.get(i)));
		//n.left = null;
		//n.right = null;
		i++;
		n.left = des(pre);
		n.right = des(pre);

		return n;
	}

	// Decodes your encoded data to tree.
	public TreeNode deserialize(String data) {
        i = 0;
		ArrayList<String> pre = new ArrayList(Arrays.asList(data.split(",")));
		TreeNode root = des(pre);

		return root;
	}
}
// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));
