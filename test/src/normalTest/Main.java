package normalTest;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		for (int j = 0;j<t; j++) {
			int n = scanner.nextInt();
			long[] array = new long[n];
			for (int i = 0; i < n; i++) {
				array[i] = scanner.nextLong();
			}
			
			if (get(array)==true) {
				System.out.println("YES");
			}
			if (get(array)==false) {
				System.out.println("NO");
			}
		}
	}
	
	public static boolean get(long[] array){
		int n=array.length;
		if (n < 3) {
			return false;
		}
		if (array[0] != array[n - 1]) {
			return false;
		}
		for (int i = 1; i < array.length-1; i++) {
			if (array[i]>array[i-1]+array[i+1]) {
				return false;
			}
		}
		return true;
	}
}
