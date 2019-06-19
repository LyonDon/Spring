package chapter1.section1;

import java.util.Scanner;

/**
 * 10进制转2进制
 * @author Administrator
 *
 */
public class Ex09 {
	public static void main(String[] args) {
		String string="";
		Scanner scanner=new Scanner(System.in);
		int N=scanner.nextInt();
		for (int n = N; n >0; n/=2) {
			string=(n%2)+string;
		}
		System.out.println(string);
	}
}
