package normalTest;

import java.util.Stack;

/**
 * 静态方法与构造方法
 * @author Administrator
 *
 */
public class Block {
	public static Block t1 = new Block();
	public static Block t2 = new Block();
	{
		System.out.println("构造块");
	}
	static {
		System.out.println("静态块");
	}

	public static void main(String[] args) {
		Block tB = new Block();
		Stack<Integer> stack=new Stack<Integer>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		System.out.println(stack.peek());
		System.out.println('A'>'9');
	}
}
