package SwordOffer;

import java.util.Stack;
/**
 * 用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型
 * @author Administrator
 *
 */
public class Solution5 {
	Stack<Integer> stack1=new Stack<Integer>();
	Stack<Integer> stack2=new Stack<Integer>();
	/**
	 * 将stack2种的所有元素全都压入stack1中，然后压栈stack2，再将stack1中的所有元素压回到stack2
	 * @param x
	 */
	public void push(int x) {
		while (!stack2.isEmpty()) {
			stack1.push(stack2.pop());
		}
		stack2.push(x);
		while(!stack1.isEmpty()){
			stack2.push(stack1.pop());
		}
	}
	
	public int pop() {
		if (!stack2.isEmpty()) {
			return(stack2.pop());
		}
		return -1;
	}
}
