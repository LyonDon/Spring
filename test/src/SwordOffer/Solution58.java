package SwordOffer;

import SwordOffer.Solution17.TreeNode;

/**
 * 请实现一个函数，用来判断一颗二叉树是不是对称的。注意，如果一个二叉树同此二叉树的镜像是同样的，定义其为对称的
 * 
 * @author Administrator
 */
public class Solution58 {
	boolean isSymmetrical(TreeNode pRoot) {
		if (pRoot == null) {
			return true;
		}
		return isSame(pRoot.left, pRoot.right);
	}
	
	public static boolean isSame(TreeNode left,TreeNode right){
		if (left==null&&right==null) {
			return true;
		}
		if (left!=null&&right!=null) {
			return left.val==right.val&&isSame(left.left, right.right)&&isSame(left.right, right.left);
		}
		return false;
	}
}
