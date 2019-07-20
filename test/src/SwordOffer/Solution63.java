package SwordOffer;

import java.util.PriorityQueue;
import java.util.Comparator;

/**
 * 如何得到一个数据流中的中位数？如果从数据流中读出奇数个数值，那么中位数就是所有数值排序之后位于中间的数值。
 * 如果从数据流中读出偶数个数值，那么中位数就是所有数值排序之后中间两个数的平均值。
 * 我们使用Insert()方法读取数据流，使用GetMedian()方法获取当前读取数据的中位数
 * @author Administrator
 *
 */
public class Solution63 {
	//创建两个堆，一个小顶堆(右)，一个大顶堆（左）
	//按顺序插入，如果小于大顶堆的堆顶元素，则插入大顶堆。否则插入小顶堆。然后判断两个堆的元素个数（大-小<=1）。否则进行调整。
	//相等的话,表示元素个数是偶数取两个堆的堆顶元素取均值
	//不等的话，表示元素个数是奇数取大顶堆的堆顶元素
	PriorityQueue<Integer> rHeap=new PriorityQueue<Integer>();
	private PriorityQueue<Integer> lHeap = new PriorityQueue<Integer>(15, new Comparator<Integer>() {
        public int compare(Integer o1, Integer o2) {
            return o2 - o1;
        }
    });
	
	//保证lHeap.size()>rHeap.size(),且相差不超过1
	public void Insert(Integer num) {
		if (lHeap.isEmpty()||num<lHeap.peek()) {
			lHeap.add(num);
		}else {
			rHeap.offer(num);
		}
		if(lHeap.size()<rHeap.size()){
			lHeap.offer(rHeap.peek());
			rHeap.poll();
		}else if (lHeap.size()-rHeap.size()==2) {
			rHeap.offer(lHeap.peek());
			rHeap.poll();
		}
	}
	
	
	public Double GetMedian() {
		if (lHeap.size()>rHeap.size()) {
			return new Double(lHeap.peek());
		}else {
			return new Double(lHeap.peek()+rHeap.peek())/2;	
		}
		
	}
}
