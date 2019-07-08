package SwordOffer;

import java.util.Stack;

/**
 * 定义栈的数据结构，请在该类型中实现一个能够得到栈中所含最小元素的min函数（时间复杂度应为O（1））
 * @author Administrator
 *
 */
public class Solution20 {
	//定义两个栈，一个用来保存数据，一个用来保存最小值
	Stack<Integer> data=new Stack<Integer>();
	Stack<Integer> min=new Stack<Integer>();
	
	public void push(int node) {
		data.push(node);
		if (min.isEmpty()||node<min.peek()) {
			min.push(node);
		}
	}
	
	public void pop() {
		if (data.peek()==min.peek()) {
			min.pop();
		}
		data.pop();
	}
	
	public int top() {
		return data.peek();
	}
	
	public int min(){
		return min.peek();
	}
}
