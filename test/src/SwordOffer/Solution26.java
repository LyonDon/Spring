package SwordOffer;

import SwordOffer.Solution17.TreeNode;

/**
 * 输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的双向链表。要求不能创建任何新的结点，只能调整树中结点指针的指向
 * 
 * @author Administrator
 *
 */
public class Solution26 {
	//将左子树构建为双向链表，返回最后一个节点
	public TreeNode Convert(TreeNode root) {
		if (root==null) {
			return root;
		}
		if (root.left==null&&root.right==null) {
			return root;
		}
		TreeNode left=Convert(root.left);
		TreeNode pNode=left;
		while(pNode!=null&&pNode.right!=null){
			pNode=pNode.right;
		}
		if (left!=null) {
			pNode.right=root;
			root.left=pNode;
		}
		TreeNode right=Convert(root.right);
		if (right!=null) {
			right.left=root;
			root.right=right;
		}
		return left!=null?left:root;
		
	}
}
