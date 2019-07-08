package SwordOffer;

import java.util.ArrayList;

import javax.swing.RootPaneContainer;

import SwordOffer.Solution17.TreeNode;

/**
 * 输入一颗二叉树的跟节点和一个整数，打印出二叉树中结点值的和为输入整数的所有路径。
 * 路径定义为从树的根结点开始往下一直到叶结点所经过的结点形成一条路径。
 * (注意: 在返回值的list中，数组长度大的数组靠前)
 * @author Administrator
 *
 */
public class Solution24 {
	public ArrayList<ArrayList<Integer>> findPath(TreeNode root,int target) {
		ArrayList<ArrayList<Integer>> resArrayList=new ArrayList<ArrayList<Integer>>();
		if (root==null) {
			return null;
		}
		return findPath(resArrayList, new ArrayList<Integer>(), root, target);
	}
	
	public ArrayList<ArrayList<Integer>> findPath(ArrayList<ArrayList<Integer>> arrayList,
			ArrayList<Integer> path,TreeNode node,int target) {
		path.add(node.val);
		if (node.left==null&&node.right==null) {
			if (target==node.val) {
				arrayList.add(path);
			}	
			return arrayList;
		}
		//创建一个path2用来保存右孩子的递归结果
		ArrayList<Integer> path2=new ArrayList<Integer>();
		path2.addAll(path);
		if (node.left!=null) {
			findPath(arrayList, path, node, target);
		}
		if (node.right!=null) {
			findPath(arrayList, path2, node, target);
		}
		return arrayList;
	}
}
