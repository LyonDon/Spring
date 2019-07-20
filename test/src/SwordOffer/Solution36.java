package SwordOffer;

import java.util.HashSet;
import java.util.Set;

import SwordOffer.Solution14.ListNode;

/**
 * 输入两个链表，找出它们的第一个公共结点。
 * @author Administrator
 *
 */
public class Solution36 {
	public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
		if (pHead1==null||pHead2==null) {
			return null;
		}
		if (pHead1.next==null) {
			return pHead1;
		}
		if (pHead2.next==null) {
			return pHead2;
		}
		Set<ListNode> set=new HashSet<Solution14.ListNode>();
		while(pHead1!=null){
			set.add(pHead1);
			pHead1=pHead1.next;
		}
		while(pHead2!=null){
			if (!set.contains(pHead2)) {
				set.add(pHead2);
				pHead2=pHead2.next;
			}else {
				return pHead2;
			}
		}
		return null;
	}
}
