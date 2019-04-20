package pencilTest;

import java.util.Scanner;

public class NewTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int testPoint = Integer.valueOf(scanner.nextLine());
		int lineNumber = Integer.valueOf(scanner.nextLine());
		// System.out.println(lineNumber);
		int res = 0;
		int count = 0;
		String[] strings = new String[lineNumber];
		for (int i = 0; i < lineNumber; i++) {
			// System.out.println('*');
			strings[i] = scanner.nextLine();
			// System.out.println(i+strings[i]);
			// for (int j = 0; j < strings[i].length(); j++) {
			if (strings[i].charAt(0) == '#') {
				String tmpString = chaolianjie(jinghao(strings[i]));
				res += tmpString.length();
			} else if (strings[i].charAt(0) == '+') {
				String tmpString = chaolianjie(jiahao(strings[i]));
				res += tmpString.length();
			} else {
				String string = chaolianjie(strings[i]);
				res += string.length();
			}
			// }
		}
		System.out.println(res);
	}

	public static String jinghao(String str) {
		StringBuffer sBuffer = new StringBuffer();
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != '#') {
				sBuffer.append(str.charAt(i));
			}
		}
		return sBuffer.toString();
	}

	public static String jiahao(String str) {
		StringBuffer sBuffer = new StringBuffer();
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != '+' && str.charAt(i) != 9) {
				sBuffer.append(str.charAt(i));
			}
		}
		return sBuffer.toString();
	}

	public static String chaolianjie(String str) {
		StringBuffer sBuffer = new StringBuffer();
		sBuffer.append(str);
		for (int i = 0; i < sBuffer.length(); i++) {
			if (sBuffer.charAt(i) == '[') {
				sBuffer.deleteCharAt(i);
			}
			if (sBuffer.charAt(i) == ']') {
				sBuffer.deleteCharAt(i);
			}
			for (int j = i; j < sBuffer.length(); j++) {
				if (sBuffer.charAt(i) == '(' && sBuffer.charAt(j) == ')') {
					sBuffer.delete(i, j + 1);
				}
			}
		}
		return (sBuffer.toString());
	}
}