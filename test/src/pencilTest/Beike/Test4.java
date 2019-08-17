package pencilTest.Beike;

import java.util.Arrays;
import java.util.Scanner;

public class Test4 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		long[] num=new long[n];
		for (int i = 0; i < n; i++) {
			num[i]=scanner.nextLong();
		}
		Arrays.sort(num);
		int count=0;
		for (int i = 0; i < num.length; i++) {
			for (int j = i+1; j < num.length; j++) {
				if ((double)num[i]/(double)num[j]>=0.9) {
					count+=get_round(i, j-1);
				}else {
					break;
				}
			}
		}
		System.out.println(count/2);
	}
	
	public static int get_round(int i,int j) {
		int n=j-i;
		if (n==0) {
			return 0;
		}
		int res=0;
		for (int k = 1; k <= n; k++) {
			res+=k;
		}
		return res;
	}
}
