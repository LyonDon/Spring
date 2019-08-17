package pencilTest.Pin;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int L = scanner.nextInt();
		int N = scanner.nextInt();
		int[] num = new int[N];
		for (int i = 0; i < N; i++) {
			num[i] = scanner.nextInt();
		}
		int jun = 0;
		for (int i = 0; i < N; i++) {
			jun += num[i];
		}
		jun /= N;
		//res1表示向均值移动的结果
		int res1 = 0;
		for (int i = 0; i < N; i++) {
			res1 += Math.abs(num[i] - jun);
		}
		int k = 1;
		for (int i = 0; i < N / 2; i++) {
			res1 -= k;
			k++;
		}
		int k2 = 1;
		for (int i = 0; i < N / 2; i++) {
			res1 -= k2;
			k2++;
		}
		//res2表示向端点移动的结果
		int res2 = 0;
		for (int i = 0; i < N; i++) {
			if (num[i] < jun) {
				int pos = 1;
				res2 += num[i] - pos;
				pos++;
			} else {
				int pos = 1;
				res2 += Math.abs(num[i] - L - pos);
				pos++;
			}
		}
		res2 -= 4;
		int res = res1 > res2 ? res2 : res1;
		System.out.println(res);
	}
}
