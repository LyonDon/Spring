package SwordOffer;

import java.util.Stack;

/**
 * 输入一个链表，输出该链表中倒数第k个结点
 * 
 * @author Administrator
 *
 */
public class Solution14 {
	public class ListNode {
		int val;
		ListNode next = null;

		ListNode(int val) {
			this.val = val;
		}
	}

	/**
	 * 使用栈
	 * 
	 * @param head
	 * @param k
	 * @return
	 */
	public static ListNode findKthToTail(ListNode head, int k) {
		if (head == null) {
			return head;
		}
		ListNode node = head;
		Stack<ListNode> stack = new Stack<>();
		int count = 0;
		int count1 = 0;
		ListNode tmp = null;
		while (node != null) {
			stack.push(node);
			node = node.next;
			count1++;
		}
		if (count1 < k) {
			return null;
		}
		while (count < k && !stack.empty()) {
			tmp = stack.pop();
			count++;
		}
		return tmp;
	}
	/**
	 * 使用快慢指针
	 * @param head
	 * @param k
	 * @return
	 */
	public static ListNode findKthToTail2(ListNode head,int k) {
		ListNode fast=head;
		ListNode slow=head;
		if (head==null||k<=0) {
			return null;
		}
		for (int i = 1; i < k; i++) {
			if (fast.next!=null) {
				fast=fast.next;	
			}else {
				return null;
			}
			
		}
		
		while(fast.next!=null){
			fast=fast.next;
			slow=slow.next;
		}
		
		return slow;
	}

}

