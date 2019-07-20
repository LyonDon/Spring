package SwordOffer;

import SwordOffer.Solution4.TreeNode;

/**
 * 请实现两个函数，分别用来序列化和反序列化二叉树
 * 
 * @author Administrator
 *
 */

public class Solution61 {
	int index = -1;

	public String Serialize(TreeNode root) {
		StringBuffer string = new StringBuffer();
		if (root == null) {
			string.append("#,");
			return string.toString();
		}
		string.append(root.val+",");
		string.append(Serialize(root.left));
		string.append(Serialize(root.right));
		return string.toString();
	}

	public TreeNode DeSerialize(String string) {
		index++;
		int len = string.length();
		String[] res = string.split(",");
		TreeNode node = null;
		while (!res[index].equals("#")) {
			node = new TreeNode(Integer.valueOf(res[index]));
			node.left = DeSerialize(res[index]);
			node.right = DeSerialize(res[index]);
		}
		return node;
	}
}
