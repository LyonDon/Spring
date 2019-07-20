package SwordOffer;

import SwordOffer.Solution4.TreeNode;

/**
 * 给定一棵二叉搜索树，请找出其中的第k小的结点。例如， （5，3，7，2，4，6，8） 中，按结点数值大小顺序第三小结点的值为4
 * 
 * @author Administrator
 *
 */
public class Solution62 {
	// 中序遍历二叉树，输出第k个节点
	int i = 0;

	TreeNode KthNode(TreeNode pRoot, int k) {
		if (pRoot != null) {
			TreeNode leftNode = KthNode(pRoot.left, k);
			if (leftNode!=null) {
				return leftNode;
			}
			i++;
			if (i==k) {
				return pRoot;
			}
			TreeNode rightNode=KthNode(pRoot.right, k);
			if (rightNode!=null) {
				return rightNode;
			}
		}
		return null;
	}
}
