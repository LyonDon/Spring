package normalTest;

import java.util.Scanner;
import java.util.Stack;

public class Test7 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = Integer.valueOf(scanner.nextLine());
		String[] strings = new String[n];
		for (int i = 0; i < n; i++) {
			strings[i] = scanner.nextLine();
		}
		for (int i = 0; i < n; i++) {
			System.out.println(sol(strings[i]));
		}
	}
	
	public static String sol(String string) {
		StringBuffer sBuffer=new StringBuffer();
		if (string.length()<4) {
			return string;
		}
		int count=0;
		if (string.length()==4) {
			for (int i = 0; i < string.length()-1; i++) {
				if (string.charAt(i+1)-string.charAt(i)==1) {
					count++;
				}
			}
			if (count==3) {
				return sBuffer.append(string.charAt(0)+"-"+string.charAt(string.length()-1)).toString();
			}else {
				return string;
			}
		}
		Stack<Character> stack1=new Stack<Character>();
		Stack<Character> stack2=new Stack<Character>();
		
		stack1.push(string.charAt(0));
		sBuffer.append(string.charAt(0));
		boolean flag=true;
		for (int i = 1; i < string.length(); i++) {
			if (flag) {
				if (string.charAt(i)-stack1.peek()!=1) {
					sBuffer.append(string.charAt(i));
					flag=false;
					stack1.pop();
					stack1.push(string.charAt(i));
				}
			}
			else {
				if (string.charAt(i)-stack1.peek()!=1) {
					stack2.push(stack1.peek());
					if (stack2.size()>=4) {
						stack2.push('-');
						sBuffer.append(stack2.pop());
						stack2.clear();
					}
					sBuffer.append(stack1.pop());
					stack1.push(string.charAt(i));
					
				}else {
					stack2.push(stack1.pop());
					stack1.push(string.charAt(i));
				}	
			}
			
//			if (stack2.peek()=='-') {
//				sBuffer.append(stack2.pop());
//				stack2.clear();
//			}
			if (i==string.length()-1) {
				sBuffer.append(string.charAt(i));
			}
//			System.out.println(sBuffer.toString());
		}
		return sBuffer.toString();
	}
}
