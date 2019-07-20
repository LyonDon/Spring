package SwordOffer;

import SwordOffer.Solution17.TreeNode;

/**
 * 输入一棵二叉树，判断该二叉树是否是平衡二叉树
 * @author Administrator
 *
 */
public class Solution39 {
	public boolean IsBalanced_Solution(TreeNode root) {
		if (root==null) {
			return true;
		}
		int left=treeDepth(root.left);
		int right=treeDepth(root.right);
		int balance=Math.abs(left-right);
		if (balance>1) {
			return false;
		}
		return IsBalanced_Solution(root.left)&&IsBalanced_Solution(root.right);
	}
	
	public static int treeDepth(TreeNode rootNode) {
		if (rootNode==null) {
			return 0;
		}
		int left=treeDepth(rootNode.left);
		int right=treeDepth(rootNode.right);
		return left>right?left+1:right+1;
	}
}
