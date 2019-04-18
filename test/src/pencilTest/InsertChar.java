package pencilTest;

import java.util.Scanner;

/**
 * 用Java或C语言实现一个函数，要求对一个8位的数字随机插入3个随机英文字母，如： insertChars(12345678) -->
 * "a123d4567f8" 或 insertChars(12345678) --> "12ca345k678" 等 （注：可使用库函数）
 * 
 * @author Administrator
 *
 */
public class InsertChar {
	public static void main(String[] args) {
		insertChars();
	}
	public static void insertChars() {
		String string1="qwertyuioplkjhgfdsazxcvbnmMNBVCXZASDFGHJKLPOIUYTREWQ";
		
		Scanner scanner=new Scanner(System.in);
		String string=scanner.nextLine();
		StringBuilder sBuffer=new StringBuilder();
		for (int i = 0; i < string.length(); i++) {
			sBuffer.append(string.charAt(i));
		}
		int num1=(int)(Math.random()*8);
		int num2=(int)(Math.random()*8);
		int num3=(int)(Math.random()*8);
		
		int x=(int)(Math.random()*52);
		int y=(int)(Math.random()*52);
		int z=(int)(Math.random()*52);
		
//		System.out.println(x);
//		System.out.println(y);
//		System.out.println(z);
		
		char letter1=string1.charAt(x);
		char letter2=string1.charAt(y);
		char letter3=string1.charAt(z);
		
//		System.out.println(letter1);
//		System.out.println(letter2);
//		System.out.println(letter3);
		
		sBuffer.insert(num1, letter1);
		sBuffer.insert(num2, letter2);
		sBuffer.insert(num3, letter3);
		
		System.out.println(sBuffer.toString());
	}
}
