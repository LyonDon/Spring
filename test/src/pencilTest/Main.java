package pencilTest;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		System.out.println(findStep(n));
//		boolean x=("ab"==new String("ab").intern());
//		boolean y=("a"+"b"=="ab");
//		int z=Integer.MAX_VALUE-Integer.MIN_VALUE;
//		Object aa=0.1*6;
//		System.out.println(aa);
//		System.out.println(z);
//		System.out.println(x);
//		System.out.println(y);
		
	}

	public static long findStep(int n) {
		if (n < 0) {
			n=-n;
		}
		long res;
		if (n == 1 || n == 2 || n == 0) {
			return n;
		}
		if (n % 2 == 0) {
			res=findStep(n / 2) + 1;
		} else {
			long x = findStep((n + 1) / 2) + 2;
			long y = findStep((n - 1) / 2) + 2;
			res = Math.min(x, y);
		}
		return res;
	}
}