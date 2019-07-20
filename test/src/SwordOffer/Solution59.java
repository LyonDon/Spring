package SwordOffer;

import java.util.ArrayList;
import java.util.Stack;

import SwordOffer.Solution17.TreeNode;

/**
 * 请实现一个函数按照之字形打印二叉树，
 * 即第一行按照从左到右的顺序打印，第二层按照从右至左的顺序打印，第三行按照从左到右的顺序打印，其他行以此类推
 * @author Administrator
 *
 */
public class Solution59 {
	public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
		ArrayList<ArrayList<Integer>> resArrayList=new ArrayList<>();
		if (pRoot==null) {
			return resArrayList;
		}
		//两个栈分别用于存储奇数层和偶数层的节点
		//奇数层先左子树后右子树,偶数层先右子树后左子树
		Stack<TreeNode> stack1=new Stack<Solution17.TreeNode>();
		Stack<TreeNode> stack2=new Stack<Solution17.TreeNode>();
		stack1.push(pRoot);
		int floor=1;
		ArrayList<Integer> list=new ArrayList<>();
		while(!stack1.isEmpty()||!stack2.isEmpty()){
			if (floor%2==1) {
				while(!stack1.isEmpty()){
					TreeNode node=stack1.pop();
					list.add(node.val);
					if (node.left!=null) {
						stack2.push(node.left);
					}
					if (node.right!=null) {
						stack2.push(node.right);
					}
				}
			}
			if (floor%2==0) {
				while(!stack2.isEmpty()){
					TreeNode node=stack2.pop();
					list.add(node.val);
					if (node.right!=null) {
						stack1.push(node.right);
					}
					if (node.left!=null) {
						stack1.push(node.left);
					}
				}
			}
			resArrayList.add(new ArrayList<Integer>(list));
			list.clear();
			floor++;
		}
		return resArrayList;
	}
}
