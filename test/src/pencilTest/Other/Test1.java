package pencilTest.Other;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			int N = scanner.nextInt();
			int M = scanner.nextInt();
			int[][] num = new int[N][M];
			for (int j = 0; j < N; j++) {
				for (int j2 = 0; j2 < M; j2++) {
					num[j][j2] = scanner.nextInt();
				}
			}
			int count = 0;
			int res = 0;
			for (int i = 0; i < N; i++) {
				for (int i2 = 0; i2 < M; i2++) {
					int max = (num[i][i2] - 1) * 2;
					int mini = 0;
					if (i >= 1) {// 纵向
						mini = Math.min(num[i][i2],num[i - 1][i2]);
					}
					int mini2 = 0;
					if (i2 >= 1) {// 横
						mini2 = Math.min(num[i][i2],num[i][i2 - 1]);
					}
					count += (2 * (mini + mini2) + max);
					res += num[i][i2];
				}
			}
			System.out.println(res * 6 - count);

		}
	}
}