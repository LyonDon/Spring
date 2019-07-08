package SwordOffer;

/**
 * 输入两棵二叉树A，B，判断B是不是A的子结构。（ps：我们约定空树不是任意一个树的子结构）
 * 
 * @author Administrator
 *
 */
public class Solution17 {
	public class TreeNode {
		int val = 0;
		TreeNode left = null;
		TreeNode right = null;

		public TreeNode(int val) {
			this.val = val;

		}

	}

	public static boolean hasSubTree(TreeNode root1, TreeNode root2) {
		boolean res=false;
		if (root1 != null && root2 != null) {
			if (root1.val == root2.val) {
				 res = doesTree1HasTree2(root1, root2);
			}
			//这里应该是遍历，如果还是调用doesTree1HasTree2的话，如何遍历呢！？就只有一次操作
			//应该是分别用root1的左孩子和右孩子代替root1节点，执行遍历操作
			//有上面的判断调用作为执行语句
			if (!res) {
				res=hasSubTree(root1.left, root2);
			}
			if (!res) {
				res=hasSubTree(root1.right, root2);
			}
		}
		return res;
	}

	public static boolean doesTree1HasTree2(TreeNode node1, TreeNode node2) {
		// 二叉树b已经遍历完成
		if (node2 == null) {
			return true;
		}
		// 二叉树a还未遍历完成
		if (node1 != null) {
			return false;
		}
		// 二叉树a的节点值不等于二叉树b的节点值
		if (node1.val != node2.val) {
			return false;
		}
		return doesTree1HasTree2(node1.left, node2.left) && doesTree1HasTree2(node1.right, node2.right);
	}

}
