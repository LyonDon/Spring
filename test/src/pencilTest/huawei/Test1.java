package pencilTest.huawei;

import java.util.LinkedHashMap;
import java.util.Scanner;

/**
 * 输入字符串a:2,b:3,c:4@b:1,c:2 输出a:2,b:1,c:2 为0的话不输出
 * 
 * @author Administrator
 *
 */
public class Test1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String string = scanner.nextLine();
		int i;
		for (i = 0; i < string.length(); i++) {
			if (string.charAt(i) == '@') {
				break;
			}
		}

		String string1 = string.substring(0, i);
		// 后半部分没有的话直接输出前半部分
		if (string.charAt(string.length() - 1) == '@') {
			System.out.println(string1);
		} else {
			String string2 = string.substring(i + 1, string.length());
			String[] tmpString1 = string1.split(",");
			String[] tmpString2 = string2.split(",");
			LinkedHashMap<String, Integer> hashMap = new LinkedHashMap<String, Integer>();
			LinkedHashMap<String, Integer> hashMap2 = new LinkedHashMap<String, Integer>();
			for (int j = 0; j < tmpString1.length; j++) {
				String[] tmpStrings = tmpString1[j].split(":");
				hashMap.put(tmpStrings[0], Integer.valueOf(tmpStrings[1]));
			}
			for (int k = 0; k < tmpString2.length; k++) {
				String[] tmpStrings = tmpString2[k].split(":");
				hashMap2.put(tmpStrings[0], Integer.valueOf(tmpStrings[1]));
			}
			for (String character : hashMap2.keySet()) {
				int value = hashMap.get(character) - hashMap2.get(character);
				hashMap.put(character, value);
			}
			String string3 = "";
			for (String c : hashMap.keySet()) {
				if (hashMap.get(c) == 0) {
					continue;
				} else {
					string3 += c;
				}
			}
			StringBuffer stringBuffer = new StringBuffer();
			for (int j = 0; j < string3.length(); j++) {
				stringBuffer.append(
						string3.charAt(j) + ":" + String.valueOf(hashMap.get(String.valueOf(string3.charAt(j)))));
				if (j < string3.length() - 1) {
					stringBuffer.append(",");
				}
			}
			System.out.println(stringBuffer.toString());
		}
	}
}
