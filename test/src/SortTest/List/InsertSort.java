package SortTest.List;

import SwordOffer.Solution14.ListNode;

public class InsertSort {
	public ListNode InsertSort(ListNode head) {
		if (head == null || head.next == null) {
			return head;
		}
		ListNode pri = head;// 已排序的节点（的最终元素）
		ListNode cur = head.next;// 未排序的节点(的开始元素)

		ListNode tmp = new ListNode(-1);// 辅助节点
		tmp.next = head;
		while (cur != null) {
			if (cur.val<pri.val) {
				//先删除cur，再将其插入到已排序队列的合适位置
				pri.next=cur.next;
				ListNode l1=tmp;
				ListNode l2=tmp.next;
				//从前向后找到l2>cur,将cur插入到l2和l1之间
				while(cur.val>l2.val){
					l1=l2;
					l2=l2.next;
				}
				l1.next=cur;
				cur.next=l2;
				cur=pri.next;
			}else {
				pri.next=cur;
				cur=cur.next;
			}
		System.out.println(tmp.next.val);
		}
		//如果不走if分支的话，最终返回的是head。也就是原顺序
		return tmp.next;
	}
}
