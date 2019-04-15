package pencilTest;

import java.util.Scanner;

public class String01 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String string=sc.nextLine();
		boolean flagL=judgeLength(string);
		boolean flagLe=judgeLetter0aA(string);
		int x=judgeLetterSame(string);
		if (flagL&&flagLe&&(x==0)) {
			System.out.println(0);
		}else {
			System.out.println(moveTimes(string));
		}
		
	}
	
	public static boolean judgeLength(String string) {
		if (string.length()>20&&string.length()<6) {
			return false;
		}
		return true;
	}
	
	public static boolean judgeLetter0aA(String string){
		int counti=0;
		int countj=0;
		int countm=0;
		
		for (int i = 0; i < string.length(); i++) {
			if (string.charAt(i)>=97&&string.charAt(i)<=122) {
				counti++;
			}
		}
		for (int j = 0; j < string.length(); j++) {
			if (string.charAt(j)>=65&&string.charAt(j)<=90) {
				countj++;
			}
		}
		for (int m = 0; m < string.length(); m++) {
			if (string.charAt(m)>=48&&string.charAt(m)<=57) {
				countm++;
			}
		}
		
		if (counti>0&&countj>0&&countm>0) 
			return true;
		return false;
	}
	
	public static int judgeLetterSame(String string) {
		int countsame=0;
		for (int k = 0; k < string.length()-1; k++) {
			if (string.charAt(k)==string.charAt(k+1)) {
				countsame++;
			}else {
				countsame=0;
			}
		}
		int x=countsame/3;
		return x;
	}
	
	public static int moveTimes(String string) {
		int count=0;
		if (judgeLetter0aA(string)==false) {
			count++;
		}
		if (judgeLength(string)==false) {
			if (string.length()<6) {
				count+=6-string.length();
			}
			if (string.length()>20) {
				count+=string.length()-20;
			}
		}
		if (judgeLetterSame(string)>0) {
			count+=judgeLetterSame(string);
		}
		return count;
	}
}
