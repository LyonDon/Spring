package pencilTest;

import java.util.ArrayList;
import java.util.Scanner;

public class LinkedListReverse3 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String string=scanner.nextLine();
//		int num=Integer.parseInt(string);
		int n=Integer.valueOf(scanner.nextInt());
		String[] string2=string.substring(1, string.length()-1).trim().split(",");
		
		ArrayList<Integer> list=new ArrayList<Integer>();
		for (int i = 0; i < string2.length; i++) {
			list.add(Integer.valueOf(string2[i]));
		}
		
		for (int i = 0; i < string2.length; i+=n) {
			if (i+n<=string2.length) {
				if (i==0) {
					System.out.print("[");
				}
				for (int j = i+n-1; j>i; j--) {
					System.out.print(list.get(j)+",");
				}
				if (i+n==string2.length) {
					System.out.print(list.get(i)+"]");
				}else {
					System.out.print(list.get(i)+",");
				}
				//如果加一次n就超过了串的长度
			}else {
				if (i==0) {
					System.out.print("[");	
				}
				for (int j = i; j <string2.length-1; j++) {
					System.out.print(list.get(j)+",");
				}
				System.out.print(list.get(string2.length-1)+"]");
			}
		}
	}
}
