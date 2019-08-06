package normalTest;

import java.util.ArrayList;
import java.util.Scanner;

public class Test5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int[] array = new int[N];
		for (int i = 0; i < array.length; i++) {
			array[i] = scanner.nextInt();
		}
		ArrayList<Integer> arrayA = new ArrayList<Integer>();
		arrayA.add(0);
		ArrayList<Integer> arrayB = new ArrayList<Integer>();
		arrayB.add(0);
		int i = 0;
		int j = array.length - 1;
		int kA = 0;
		int kB = 0;
		boolean flag=true;//设置奇偶校验位
		while (i < j) {
			if (Math.abs(array[i] - arrayA.get(kA)) < Math.abs(array[j] - arrayA.get(kA))) {
				if (i >= j) {
					break;
				}
				arrayA.add(array[j]);
				j--;
				kA++;
			}
			if (Math.abs(array[i] - arrayA.get(kA)) >= Math.abs(array[j] - arrayA.get(kA))) {
				if (i >= j) {
					break;
				}
				arrayA.add(array[i]);
				i++;
				kA++;
			}
			if (Math.abs(array[i] - arrayB.get(kB)) < Math.abs(array[j] - arrayB.get(kB))) {
				if (i >= j) {
					break;
				}
				arrayB.add(array[j]);
				j--;
				kB++;
			}
			if (Math.abs(array[i] - arrayB.get(kB)) >= Math.abs(array[j] - arrayB.get(kB))) {
				if (i >= j) {
					break;
				}
				arrayB.add(array[i]);
				i++;
				kB++;
			}
		}
		arrayB.add(array[j]);
		long sumA = 0;
		long sumB = 0;
		for (int k = 0; k < arrayA.size(); k++) {
			System.out.print(arrayA.get(k));
		}
		System.out.println();
		for (int k = 0; k < arrayB.size(); k++) {
			System.out.print(arrayB.get(k));
		}
		System.out.println();

		for (int k = 0; k < arrayA.size() - 1; k++) {

			sumA += Math.abs(arrayA.get(k + 1) - arrayA.get(k));
		}
		for (int k = 0; k < arrayB.size() - 1; k++) {
			sumB += Math.abs(arrayB.get(k + 1) - arrayB.get(k));
		}
		System.out.println(sumA + " " + sumB);
	}
}
