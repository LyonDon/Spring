package SwordOffer;

import SwordOffer.Solution14.ListNode;

/**
 * 在一个排序的链表中，存在重复的结点，请删除该链表中重复的结点，重复的结点不保留，返回链表头指针。 例如，链表1->2->3->3->4->4->5
 * 处理后为 1->2->5
 * 
 * @author Administrator
 *
 */
public class Solution56 {
	public ListNode deleteDuplication(ListNode pHead) {
		if (pHead == null) {
			return null;
		}
		if (pHead.next == null) {
			return pHead;
		}
		ListNode tmpListNode = null;
		if (pHead.val == pHead.next.val) {
			tmpListNode = pHead.next.next;
			while(tmpListNode!=null&&tmpListNode.val==pHead.val){
				tmpListNode=tmpListNode.next;
			}
			return deleteDuplication(tmpListNode);
		} else {
			tmpListNode = pHead.next;
			pHead.next=deleteDuplication(tmpListNode);
			return pHead;
		}
	}
}
