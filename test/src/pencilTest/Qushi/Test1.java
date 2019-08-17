package pencilTest.Qushi;

import java.util.Scanner;

/**
 * 大数相加
 * 
 * @author Administrator
 */
public class Test1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] string1 = scanner.nextLine().split("\\.");// .和|是转义字符，需要加\\
		String[] string2 = scanner.nextLine().split("\\.");

		//整数部分补零
		if (string1[0].length() > string2[0].length()) {
			StringBuilder sBuilder = new StringBuilder();
			for (int i = 0; i < string1[0].length() - string2[0].length(); i++) {
				sBuilder.insert(0, '0');
			}
			string2[0] = sBuilder.toString() + string2[0];
		} else {
			StringBuilder sBuilder = new StringBuilder();
			for (int i = 0; i < string2[0].length() - string1[0].length(); i++) {
				sBuilder.insert(0, '0');
			}
			string1[0] = sBuilder.toString() + string1[0];
		}
		//小数部分补零
		if (string1[1].length() > string2[1].length()) {
			StringBuilder sBuilder = new StringBuilder();
			for (int i = 0; i < string1[1].length() - string2[1].length(); i++) {
				sBuilder.append('0');
			}

			string2[1] += sBuilder.toString();
		} else {
			StringBuilder sBuilder = new StringBuilder();
			for (int i = 0; i < string2[1].length() - string1[1].length(); i++) {
				sBuilder.append('0');
			}
			string1[1] += sBuilder.toString();
		}
		StringBuilder res = new StringBuilder();
		// 小数部分相加
		int lenX = string1[1].length();
		int flag = 0;
		for (int i = lenX - 1; i >= 0; i--) {
			if ((string1[1].charAt(i) - '0') + (string2[1].charAt(i) - '0') + flag > 9) {
				int num = (int) (string1[1].charAt(i) - '0') + (int) (string2[1].charAt(i) - '0') + flag;
				num -= 10;
				flag = 1;
				res.insert(0, num);
			} else {
				int num = (string1[1].charAt(i) - '0') + (string2[1].charAt(i) - '0') + flag;
				res.insert(0, num);
				flag = 0;
			}
		}
		res.insert(0, '.');
		// 整数部分相加
		int lenZ = string1[0].length();
		for (int i = lenZ - 1; i >= 0; i--) {
			if ((string1[0].charAt(i) - '0') + (string2[0].charAt(i) - '0') + flag > 9) {
				int num = (string1[0].charAt(i) - '0') + (string2[0].charAt(i) - '0') + flag;
				num -= 10;
				flag = 1;
				res.insert(0, num);
			} else {
				int num = string1[0].charAt(i) - '0' + string2[0].charAt(i) - '0' + flag;
				res.insert(0, num);
				flag = 0;
			}
		}
		System.out.println(res.toString());
	}
}
