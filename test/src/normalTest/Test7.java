package normalTest;

import java.util.Scanner;

public class Test7 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		String[] strings=new String[ n];
		for (int i = 0; i < args.length; i++) {
			strings[i]=scanner.nextLine();
		}
		for (int i = 0; i < strings.length; i++) {
			System.out.println(test(strings[i]));
		}
	}
	
	public static String test(String string) {
		if (string.length()<4) {
			return string;
		}
		
		StringBuffer stringBuffer=new StringBuffer();
		char c = 0;
		String string2="";
		int count=0;
		int i=0;
		while(i<string.length()){
			if (string.charAt(i+1)-string.charAt(i)!=1) {
				stringBuffer.append(string.charAt(i));
			}
		}
		return stringBuffer.toString();
	}
}
