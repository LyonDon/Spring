package SwordOffer;

import SwordOffer.Solution14.ListNode;

/**
 * 输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则。
 * @author Administrator
 *
 */
public class Solution16 {
	public ListNode combineListNode(ListNode list1,ListNode list2) {
		if (list1==null) { 
			return list2;
		}
		if (list2==null) {
			return list1;
		}
		
		ListNode resListNode=new ListNode(0);
		ListNode tmpListNode=resListNode;
		
		while(list1!=null&&list2!=null){
			if (list1.val<list2.val) {
				tmpListNode.next=list1;
				list1=list1.next;
				tmpListNode=tmpListNode.next;
			}else {
				tmpListNode.next=list2;
				list2=list2.next;
				tmpListNode=tmpListNode.next;
			}
		}
		
		while(list1!=null){
			tmpListNode.next=list1;
			list1=list1.next;
			tmpListNode=tmpListNode.next;
		}
		while(list2!=null){
			tmpListNode.next=list2;
			list2=list2.next;
			tmpListNode=tmpListNode.next;
		}
		return resListNode.next;
	}
}
