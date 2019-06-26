package SwordOffer;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

/**
 * 输入一个链表，按链表值从尾到头的顺序返回一个ArrayList
 * @author Administrator
 *
 */
public class Solution3 {
//	public class ListNode {
//		int val;
//		ListNode next = null;
//
//		ListNode(int val) {
//			this.val = val;
//		}
//	}
//	
//	public static ArrayList<ListNode> printListFromTailToHead(ListNode listNode) {
//		//使用栈
//		Stack<ListNode> tmp=new Stack<Solution3.ListNode>();
//		ArrayList<ListNode> arrayList=new ArrayList<ListNode>();//创建ArrayList用于保存返回值
//		ListNode node=listNode;//创建链表节点用来保存listnode的值
//		while (node!=null) {
//			tmp.push(node);
//			node=node.next;
//		}
//		while (tmp!=null) {
//			arrayList.add(tmp.pop());
//		}
//		return arrayList;
//	}
	public class ListNode{
		int val;
		ListNode next=null;
		
		public ListNode(int val) {
			this.val=val;
		}
	}
	
	public static ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
		//使用栈
		Stack<Integer> tmp=new Stack<>();
		ArrayList<Integer> arrayList=new ArrayList<Integer>();//这里的数据类型是Integer，因为
//		ListNode node=listNode;
		
		while(listNode!=null){
			tmp.push(listNode.val);
			listNode=listNode.next;
		}
		while(tmp!=null){
			arrayList.add(tmp.pop());
		}
		return arrayList;
	}
	
}
