package SwordOffer;

import java.util.HashMap;
import java.util.HashSet;

import SwordOffer.Solution14.ListNode;

/**
 * 给一个链表，若其中包含环，请找出该链表的环的入口结点，否则，输出null。
 * @author Administrator
 *
 */
public class Solution55 {
	public ListNode meetingNode(ListNode pHead){
		if (pHead==null||pHead.next==pHead) {
			return pHead;
		}
		HashSet<ListNode> map=new HashSet<ListNode>();
		map.add(pHead);
		ListNode tmp=pHead.next;
		while(!map.contains(tmp)){
			map.add(tmp);
			tmp=tmp.next;
		}
		return tmp;
	}
}
