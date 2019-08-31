package normalTest;

import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;

import SwordOffer.Solution14.ListNode;

public class HHH {
	public static void main(String[] args) {

	}
	
	public static ListNode get(ListNode[] lists) {
		PriorityQueue<ListNode> queue=new PriorityQueue<ListNode>(new Comparator<ListNode>() {
			@Override
			public int compare(ListNode o1, ListNode o2) {
				return o1.val-o2.val;
			}
		});
		for(ListNode e:lists){
			if (e!=null) {
				queue.add(e);
			}
		}
		ListNode head=new ListNode(0);
		head.next=null;
		ListNode tmpListNode=head;
		while(queue!=null){
			tmpListNode.next=queue.poll();
			tmpListNode=tmpListNode.next;
			if (tmpListNode.next!=null) {
				queue.add(tmpListNode.next);
			}
		}
		return head.next;
	}
}
