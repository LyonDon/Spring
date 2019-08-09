package SortTest.List;

import SwordOffer.Solution14.ListNode;

public class BubbleSort {

	public static ListNode bubbleSort(ListNode head) {
		// 如果只有一个节点或者没有节点，则直接返回
		if (head == null || head.next == null) {
			return head;
		}
		ListNode tail = null;
		ListNode cur = head;
		while (cur.next!= tail) {
			while (cur.next != tail) {
				if (cur.val < cur.next.val) {
					int tmp = cur.val;
					cur.val = cur.next.val;
					cur.next.val = tmp;
				}
				cur = cur.next;
			}
			tail = cur;//下次遍历的尾节点是cur，因为每次遍历的最终位置都是最后一个节点
			cur = head;
		}
		return head;
	}
}
