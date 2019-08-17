package pencilTest.Pin;

import java.util.Scanner;

public class Test3 {
	static long countNum;
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int N=scanner.nextInt();
		int S=scanner.nextInt();
		countNum=0;
		
		if ((2+N-1)*N<2*S) {
			for (int i = 1; (2*i+N-1)*N<=2*S; i++) {
				check(N-1,S-i,i+1);
			}
			System.out.println(countNum%1000000007);
		}
	}
	
	public static void check(int n,int s,int cur) {
		if (n==2) {
			while(cur<(s-cur)){
				countNum++;
				cur++;
			}
			return;
		}
		for (int i = cur;(2*i+n-1)*n<=2*s; i++) {
			check(n-1, s-i, i+1);
		}
	}
}
