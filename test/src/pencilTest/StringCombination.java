package pencilTest;

import java.util.Scanner;
import java.util.TreeSet;

public class StringCombination {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String string=scanner.nextLine();
		
		StringBuffer sBuffer=new StringBuffer();
		for (int i = 1; i <= string.length(); i++) {
			TreeSet<String> set=new TreeSet<String>();//有序set
			for (int j = 0; j+i <= string.length(); j++) {
				set.add(string.substring(j,j+i));//因为这里的subString不包括后一个元素，所以j+i应该取到string.length()
			}
			
			for (String string2:set) {
				sBuffer.append(string2).append(" ");
			}
		}
		System.out.println(sBuffer);
	}
}
