package pencilTest;

import java.util.Scanner;

public class Main3 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String string=scanner.nextLine();
		result(string);
	}
	
	public static void  result(String string) {
//		Stack<Character> stack=new Stack<Character>();
		StringBuffer sBuffer=new StringBuffer();
		int i=string.length()-1;
		int j=i-1;
		while(string.contains("(")||string.contains(")")){
			if (string.charAt(i)==')') {
				while(j!='('&&j!=')'){
					sBuffer.append(string.charAt(j));
					j--;
				}
				if (j=='(') {
					string.replace(string.charAt(j),' ');
					j--;
					int num=(int)string.charAt(j);
					copy(sBuffer, num);
					string.replace(string.charAt(i),' ');
				}
			}
			i--;
		}
		System.out.println(sBuffer.toString());
	}
	
	public static StringBuffer copy(StringBuffer sb,int n) {
		int i=0;
		String tmpString=sb.toString();
		while(i<n){
			sb.append(tmpString);
			i++;
		}
		return sb;
	}
}
