package SwordOffer;


/**
 * 输入一个复杂链表（每个节点中有节点值，以及两个指针，一个指向下一个节点，另一个特殊指针指向任意一个节点），
 * 返回结果为复制后复杂链表的head。
 * （注意，输出结果中请不要返回参数中的节点引用，否则判题程序会直接返回空）
 * @author Administrator
 *
 */
public class Solution25 {
	public class RandomListNode{
		int label;
		RandomListNode next=null;
		RandomListNode random=null;
		
		public RandomListNode(int label) {
			this.label=label;
		}
	}
	
	public RandomListNode clone(RandomListNode pHead) {
		if (pHead==null) {
			return pHead;
		}
		//第一步：复制节点
		RandomListNode pCur=pHead;
		while(pCur!=null){
			RandomListNode node=new RandomListNode(pCur.label);
			node.next=pCur.next;
			pCur.next=node;
			pCur=node.next;
		}
		//重置pCur的位置
		pCur=pHead;
		//第二步，复制random指针
		while(pCur!=null){
			if (pCur.random!=null) {
				pCur.next.random=pCur.random.next;
			}
			pCur=pCur.next.next;
		}
		pCur=pHead;
		//第三步,根据奇数和偶数位置拆解链表
		RandomListNode head=pHead.next;
		RandomListNode cur=head;
		while(pCur!=null){
			pCur.next=pCur.next.next;
			if (pCur.next!=null) {
				cur.next=cur.next.next;
			}
			pCur=pCur.next;
			cur=cur.next;
		}
		return head;
	}
}
