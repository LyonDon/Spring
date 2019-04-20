package pencilTest;

import java.util.Scanner;

public class Main1{
	public static int getTitle(String s) {
		int count=0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i)!='#') {
				count++;
			}
		}
		return count;
	}
	
	public static int getLink(String s) {
		int count=0;
		int e=s.indexOf("]");
		count+=e-1;
		
		return count;
	}
	
	public static int getList(String s) {
		int count=0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i)!='\t'&&s.charAt(i)!='+') {
				count++;
			}
		}
		return count;
	}
	
	public static int getSum(int count,int line,String[] s) {
		for (int i = 0; i < line; i++) {
			if (s[i].charAt(0)=='#') {
				while(s[i].contains("[")){
					int sindex=s[i].indexOf("[");
					int eindex=s[i].indexOf(")");
					String init=s[i].substring(0,sindex);
					String rest=s[i].substring(sindex,eindex);
					count+=getTitle(init);
					count+=getLink(rest);
					s[i]=s[i].substring(eindex+1,s[i].length());
				}
				count+=getTitle(s[i]);
			}
			else if(s[i].charAt(0)=='+') {
				count++;
				while(s[i].contains("[")){
					int sindex=s[i].indexOf("[");
					int eindex=s[i].indexOf(")");
					String init=s[i].substring(0,sindex);
					String rest=s[i].substring(sindex,eindex);
					count+=getList(init);
					count+=getLink(rest);
					s[i]=s[i].substring(eindex+1,s[i].length());
				}
				count+=getList(s[i]);
			}else {
				while(s[i].contains("[")){
					int sindex=s[i].indexOf("[");
					int eindex=s[i].indexOf(")");
					String init=s[i].substring(0,sindex);
					String rest=s[i].substring(sindex,eindex);
					count+=init.length();
					count+=getLink(rest);
					s[i]=s[i].substring(eindex+1,s[i].length());
				}
				count+=s[i].length();
			}
		}
		return count;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=Integer.valueOf(sc.nextLine());
		for (int i = 0; i <n; i++) {
			int line=Integer.valueOf(sc.nextLine());
			int count=0;
			String[] s=new String[line];
			for (int j = 0; j < line; j++) {
				s[j]=sc.nextLine();
			}
			int result=getSum(count, line, s);
			System.out.println(result);
		}
	}
}