package pencilTest.Beike;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		long[] num=new long[n];
		long[] res=new long[2];
		long max=Long.MAX_VALUE;
		for (int i = 0; i < n; i++) {
			num[i]=scanner.nextLong();
		}
		for (int i = 0; i < num.length-1; i++) {
			if (Math.abs(num[i+1]-num[i])<max) {
				res[0]=num[i];
				res[1]=num[i+1];
				max=Math.abs(num[i+1]-num[i]);
			}else {
				continue;
			}
		}
		for (int i = 0; i < res.length; i++) {
			System.out.print(res[i]+" ");
		}
	}
}
