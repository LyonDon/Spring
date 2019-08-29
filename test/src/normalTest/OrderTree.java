package normalTest;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

import javax.swing.text.AbstractDocument.LeafElement;

public class OrderTree {
	class TreeNode{
		int val;
		TreeNode leftNode;
		TreeNode rightNode;
		public TreeNode(int val) {
			this.val=val;
			this.leftNode=null;
			this.leftNode=null;
		}
	}
	//先序
	public static void preOrderTree(TreeNode head) {
		if (head==null) {
			return;
		}
		Stack<TreeNode> stack=new Stack<OrderTree.TreeNode>();
		stack.add(head);
		while(!stack.isEmpty()){
			TreeNode popNode=stack.pop();
			System.out.println(popNode.val);
			if (popNode.rightNode!=null) {
				stack.add(popNode.rightNode);
			}
			if (popNode.leftNode!=null) {
				stack.add(popNode.leftNode);
			}
		}
	}
	//中序
	public static void inOrderTree(TreeNode head) {
		if (head==null) {
			return;
		}
		Stack<TreeNode> stack=new Stack<OrderTree.TreeNode>();
		while(!stack.isEmpty()||head!=null){
			if (head!=null) {
				stack.add(head);
				head=head.leftNode;
			}else {
				head=stack.pop();
				System.out.println(head.val);
				head=head.rightNode;	
			}
		}
	}
	//后序
	//和先序比较像，只是将原本直接打印的元素改为加入stack2栈中
	public static void postOrderTree(TreeNode head) {
		if (head==null) {
			return;
		}
		Stack<TreeNode> stack=new Stack<OrderTree.TreeNode>();
		Stack<TreeNode> stack2=new Stack<OrderTree.TreeNode>();
		stack.add(head);
		while(!stack.isEmpty()){
			head=stack.pop();
			stack2.add(head);
			//这里的顺序是先左后右，因为stack弹出的节点还要再压入stack2中
			if (head.leftNode!=null) {
				stack.add(head.leftNode);
			}
			if (head.rightNode!=null) {
				stack.add(head.rightNode);
			}
		}
		
		while(!stack2.isEmpty()){
			System.out.println(stack2.pop().val);
		}
	}
	
	//层序
	public static void topToBottom(TreeNode head) {
		ArrayList<Integer> arrayList=new ArrayList<>();
		if (head==null) {
			return;
		}
		LinkedList<TreeNode> queue=new LinkedList<OrderTree.TreeNode>();
		queue.add(head);
		while(!queue.isEmpty()){
			TreeNode pollNode=queue.poll();
			arrayList.add(pollNode.val);
			if (pollNode.leftNode!=null) {
				queue.add(pollNode.leftNode);
			}
			if (pollNode.rightNode!=null) {
				queue.add(pollNode.rightNode);
			}
		}
		System.out.println(arrayList);
	}
}
