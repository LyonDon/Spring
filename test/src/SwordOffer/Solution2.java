package SwordOffer;

import java.util.Scanner;

/**
 * 请实现一个函数，将一个字符串中的每个空格替换成“%20”。 例如，当字符串为We Are
 * Happy.则经过替换之后的字符串为We%20Are%20Happy。
 * 
 * @author Administrator
 *
 */
public class Solution2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String string = scanner.nextLine();
		StringBuffer stringBuffer = new StringBuffer(string);
		System.out.println(replaceSpace(stringBuffer));
	}

	public static String replaceSpace(StringBuffer stringBuffer) {
		int spaceNum = 0;// 设置字符串下标
		for (int i = 0; i < stringBuffer.length(); i++) {
			if (stringBuffer.charAt(i) == ' ') {
				spaceNum++;
			}
		}
		int indexOld = 0;// 旧的字符串下标
		int newLen = stringBuffer.length() + spaceNum * 2;// 新的字符串长度
		int indexNew = 0;// 新的字符串下标
		String string = stringBuffer.toString();// 用来保存stringbuffer中的内容
		stringBuffer.setLength(newLen);//防止字符串越界，设置新的字符串长度
		for (; indexOld < stringBuffer.length() && indexNew < newLen; indexOld++) {
			if (string.charAt(indexOld) == ' ') {
				stringBuffer.setCharAt(indexNew++, '%');
				stringBuffer.setCharAt(indexNew++, '2');
				stringBuffer.setCharAt(indexNew++, '0');
			} else {
				stringBuffer.setCharAt(indexNew++, string.charAt(indexOld));
			}
		}
		return stringBuffer.toString();
	}
}
