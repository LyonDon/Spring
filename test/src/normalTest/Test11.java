package normalTest;

import java.util.Scanner;

public class Test11 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()){
			
			String[] str = scanner.nextLine().split(" ");

			int N = Integer.valueOf(str[0]);
			int M = Integer.valueOf(str[1]);
			String[] tmpString=scanner.nextLine().split(" ");
			int[] score = new int[N];
			for (int i = 0; scanner.hasNext()&&i < N; i++) {
				score[i] =Integer.valueOf(tmpString[i]); 
			}
			
			for (int j = 0;scanner.hasNext()&& j < M; j++) {
				String[] strings = scanner.nextLine().split(" ");
				
				if (strings[0] .charAt(0)== 'Q') {
					int i1 = Integer.valueOf(strings[1]);
					int j1 = Integer.valueOf(strings[2]);
					if (i1>j1) {
						System.out.println();
					}else {
						System.out.println(get(score, i1, j1));						
					}
				}
				if (strings[0] .charAt(0)=='U') {
					int i1 = Integer.valueOf(strings[1]);
					int j1 = Integer.valueOf(strings[2]);
					change(score, i1, j1);
				}
			}
			}
		}

	public static int get(int[] array, int i, int j) {
		int max = array[i - 1];
		for (int k = i - 1; k < j - 1; k++) {
			max = max > array[k] ? max : array[k];
		}
		return max;
	}

	public static int[] change(int[] array, int i, int j) {
		array[i-1] = j;
		return array;
	}
}
