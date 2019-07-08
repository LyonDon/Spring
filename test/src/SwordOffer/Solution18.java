package SwordOffer;

import SwordOffer.Solution17.TreeNode;

public class Solution18 {
	public void Mirror(TreeNode root){
		TreeNode tmpNode=null;//创建一个对象时最好赋予一个初值
		//直接判断root是否为空。不为空则直接交换其左右子树(即便左右子树不存在也没关系，反正是交换的是null)
		//为空则不作任何操作
		if (root!=null) {
			tmpNode=root.right;
			root.right=root.left;
			root.left=tmpNode;
			//交换了左右子节点之后，再递归交换左右子树
			if (root.left!=null) {
				Mirror(root.left);
			}
			if (root.right!=null) {
				Mirror(root.right);
			}
		}
	}
}
