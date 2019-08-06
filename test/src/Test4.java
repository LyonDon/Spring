import java.util.Scanner;
import java.util.Stack;

public class Test4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String string = scanner.nextLine();
		System.out.println(sol(string));			
	}

	public static String sol(String string) {
		Stack<Character> stack = new Stack<Character>();
		StringBuffer stringBuffer = new StringBuffer();
		int i = 0;
		int j = string.length() - 1;
		if (string.contains("(")&&string.contains(")")) {
			while(string.charAt(i)!='('){
				i++;
			}
			while(string.charAt(j)!=')'){
				j--;
			}	
		}
		if (string.charAt(i)=='('&&string.charAt(j)==')') {
			stringBuffer.append(string.subSequence(0, i));
			int num=string.charAt(j+1)-'0';
			for (int k = 0; k < num; k++) {
				stringBuffer.append(string.subSequence(i+1, j));
			}
			stringBuffer.append(string.subSequence(j+2, string.length()));	
		}
		
		if (!string.contains("(")) {
			for (int j2 = 0; j2 < string.length(); j2++) {
				if ('9' < string.charAt(j2) || string.charAt(j2) < '0') {
					stack.push(string.charAt(j2));
					stringBuffer.append(string.charAt(j2));
				} else {
					for (int k = 0; k < string.charAt(j2) - '0'-1; k++) {
						char s=stack.peek();
						stringBuffer.append(s);
					}
					stack.pop();
				}
			}
		}

		return stringBuffer.toString();

	}
}
