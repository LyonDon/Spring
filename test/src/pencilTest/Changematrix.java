package pencilTest;

import java.util.Scanner;

public class Changematrix {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int row = scanner.nextInt();
		int col = scanner.nextInt();

		int[][] matrix = new int[row][col];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				matrix[i][j] = scanner.nextInt();
			}
		}
	}
	
	public static int[][] name() {

		return null;
	}
}
