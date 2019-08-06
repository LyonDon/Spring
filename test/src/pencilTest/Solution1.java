package pencilTest;

import java.util.Scanner;

public class Solution1 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
//		double D=scanner.nextDouble();
//		int[] res1=res(D);
//		for (int i = 0; i < res1.length; i++) {
//			System.out.print(res1[i]+" ");
//		}
		
		String string11=scanner.nextLine();
		String string12=scanner.nextLine();
		String string21=scanner.nextLine();
		String string22=scanner.nextLine();
		String string31=scanner.nextLine();
		String string32=scanner.nextLine();
		System.out.println(sol(string11, string12));
		System.out.println(sol(string21, string22));
		System.out.println(sol(string31, string32));
	}
	
	public static int[] res(double d) {
		int[] res=new int[2];
		for (int i = 1; i <= 10000; i++) {
			if ((int)(d*i)-(d*i)==0) {
				res[0]=(int) (d*i);
				res[1]=i;
				return res;
			}
		}
		return res;
	}
	
	public static int sol(String string1,String string2){
		if (string2.length()>string1.length()) {
			return 0;
		}
		for (int i = 0; i < string2.length(); i++) {
			if (!string1.contains(String.valueOf(string2.charAt(i)))) {
				return 0;
			}
		}
		String tmpString="";
		StringBuffer stringBuffer=new StringBuffer();
		stringBuffer.append(string1);
		stringBuffer.append(string1.substring(0, string1.length()-2));
		if (stringBuffer.toString().contains(string2)) {
			return 1;
		}
		return 0;
	}
}
