package SwordOffer;

import SwordOffer.Solution14.ListNode;

/**
 * 输入一个链表，反转链表后，输出新链表的表头。
 * @author Administrator
 *
 */
public class Solution15 {
	/**
	 * 非递归解法
	 * @param head
	 * @return
	 */
	public ListNode ReverseList(ListNode head) {
		ListNode pre=null;
		ListNode next=null;
		
		while(head.next!=null){
			next=head.next;
			head.next=pre;
			next=pre.next;
			head=head.next;
		}
		return head;
	}
	/**
	 * 递归解法
	 * @param head
	 * @return
	 */
	public ListNode ReverseList2(ListNode head){
			if (head==null||head.next==null) {
				return head;
			}else {
				ListNode resListNode=ReverseList2(head.next);
				head.next.next=head;
				head.next=null;
				return resListNode;
			}
			
	}
}
