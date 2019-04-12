package normalTest;

import java.util.Scanner;

public class Test31 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		String string=in.nextLine();
		int p=string.indexOf("01");
		int q=string.indexOf("10");
		while(p!=-1||q!=-1){
			p=string.indexOf("01");
			if (p!=-1) {
				StringBuffer sBuffer=new StringBuffer();
				for (int i = 0; i < args.length; i++) {
					sBuffer.append(string.charAt(i));
				}
				sBuffer.delete(p, p+2);
				string=sBuffer.toString();
			}
			q=string.indexOf("10");
			if (q!=-1) {
				StringBuffer sBuffer2=new StringBuffer();
				for (int i = 0; i < args.length; i++) {
					sBuffer2.append(string.charAt(i));
				}
				sBuffer2.delete(q, q+2);
				string=sBuffer2.toString();
			}
		}
		System.out.println(string.length());
	}
}
