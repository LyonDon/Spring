package normalTest;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		// Scanner scanner=new Scanner(System.in);
		// String[] strings=scanner.nextLine().split(" ");
		// int N=Integer.valueOf(strings[0]);
		// for (int i = 0; i < N; i++) {
		// String[] strings2=scanner.nextLine().split(" ");
		// if (strings2[0].charAt(0)=='1') {
		// System.out.println("true");
		// }else {
		// System.out.println("false");
		// }
		// }
//		int[] array = { 1, 2, 3 };
//		int[] res = change(array, 1, 8);
//		for (int i = 0; i < array.length; i++) {
//			System.out.println(res[i]);
//		}
//		StringBuilder stringBuilder = new StringBuilder("ABN");
//		stringBuilder.append("C");
//		System.out.println(stringBuilder.toString());
//		Scanner scanner=new Scanner(System.in);
//		String[] strings=scanner.nextLine().split("\\.");
//		for (int i = 0; i < strings.length; i++) {
//			System.out.println(strings[i]);
//		}
		String string="ade";
		System.out.println(string.charAt(0));
		String string1="123";
		String string2="123";
		int flag=1;
		int num=string1.charAt(2)-'0'+string2.charAt(2)-'0'+flag;
		System.out.println(num);
	}

//	public static int[] change(int[] array, int i, int j) {
//		array[i - 1] = j;
//		return array;
//		
//	}
}