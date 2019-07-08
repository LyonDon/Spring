package SwordOffer;

import java.util.ArrayList;
import java.util.LinkedList;

import SwordOffer.Solution17.TreeNode;

/**
 * 从上往下打印出二叉树的每个节点，同层节点从左至右打印
 * @author Administrator
 *
 */
public class Solution22 {
	public ArrayList<Integer> printFromBottomToTop(TreeNode root){
		ArrayList<Integer> res=new ArrayList<Integer>();
		LinkedList<TreeNode> list=new LinkedList<Solution17.TreeNode>();
		if (root==null) {
			return res;
		}
		list.add(root);
		while(list!=null){
			TreeNode node=list.remove();
			if (node.left!=null) {
				list.add(node.left);
			}
			if (node.right!=null) {
				list.add(node.right);
			}
			res.add(node.val);
		}
		return res;
	}
}
