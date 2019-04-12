package pencilTest;

import java.util.ArrayList;
import java.util.Scanner;

public class LinkedListReverse {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String string = scanner.nextLine();
		String testString=string;
		String[] strings = string.split(",");

		StringBuffer sBuffer = new StringBuffer();
		for (int i = 0; i < strings.length; i++) {
			if (strings[i] != "[" || strings[i] != "]") {
				sBuffer.append(strings[i]);
			}
		}
		sBuffer.deleteCharAt(0);
		sBuffer.deleteCharAt(sBuffer.length() - 1);

		int x = scanner.nextInt();
		if (x < sBuffer.length()) {
			String tmpString = sBuffer.substring(0, x);
			StringBuffer tmp2 = new StringBuffer();
			for (int i = 0; i < tmpString.length(); i++) {
				tmp2.append(tmpString.charAt(i));
			}
			tmp2.reverse();
			String res0 = tmp2.toString();

			String resString = sBuffer.replace(0, x, res0).toString();

			ArrayList<Character> ress = new ArrayList<Character>();
			for (int i = 1; i < resString.length(); i++) {
				ress.add(resString.charAt(i));
				if ((int)ress.get(i)-(int)ress.get(i-1)!=1) {
					
				}
			}
			System.out.println(ress);
		}else {
			System.out.println(testString);
		}

	}
}
