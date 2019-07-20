package SwordOffer;

import java.util.ArrayList;
import java.util.LinkedList;

import SwordOffer.Solution17.TreeNode;

/**
 * 二叉树层序遍历
 * 从上到下按层打印二叉树，同一层结点从左至右输出。每一层输出一行。
 * @author Administrator
 *
 */
public class Solution60 {
	ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
		//使用linkedList遍历节点，用end保存每层的节点数
		ArrayList<ArrayList<Integer>> resArrayList=new ArrayList<ArrayList<Integer>>();
		if (pRoot==null) {
			return resArrayList;
		}
		ArrayList<Integer> arrayList=new ArrayList<Integer>();
		LinkedList<TreeNode> list=new LinkedList<>();
		list.add(pRoot);
		int start=0;
		int end=1;
		while(!list.isEmpty()){
			TreeNode node=list.remove();
			arrayList.add(node.val);
			start++;
			if (node.left!=null) {
				list.add(node.left);
			}
			if (node.right!=null) {
				list.add(node.right);
			}
			if (start==end) {
				end=list.size();
				start=0;
				resArrayList.add(arrayList);
				arrayList=new ArrayList<Integer>();
			}
		}
		return resArrayList;
	}
}
