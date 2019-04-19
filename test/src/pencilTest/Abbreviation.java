package pencilTest;

import java.util.Scanner;

/**
 * 在英文中,我们会把一些长的名字或者短语进行缩写。例如"looks good to me"缩写为"lgtm",短语中的每个单词的首字母组成缩写。
 * 现在给出一个字符串s,字符串s中包括一个或者多个单词,单词之间以空格分割,请输出这个字符串的缩写
 * @author Administrator
 *
 */
public class Abbreviation {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String string=scanner.nextLine().trim();
		StringBuffer stringBuffer=new StringBuffer();
		for (int i = 0; i < string.length(); i++) {
			if (i==0) {
				stringBuffer.append(string.charAt(0));	
			}
			if (string.charAt(i)==' ') {
				stringBuffer.append(string.charAt(i+1));
			}
		}
		System.out.println(stringBuffer.toString());
	}
}
