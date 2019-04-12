package pencilTest;

import java.util.ArrayList;
import java.util.Scanner;

public class LinkedListReverse2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = sc.nextLine();
		int n = Integer.valueOf(sc.nextLine());

		String[] t = s.substring(1, s.length() - 1).trim().split(",");

		ArrayList<Integer> list = new ArrayList<>();

		for (int i = 0; i < t.length; i++)
			list.add(Integer.valueOf(t[i]));

		for (int i = 0; i < t.length; i = i + n) {
			if (i + n <= t.length) {
				if (i == 0)
					System.out.print("[");
				for (int j = i + n - 1; j > i; j--) {
					System.out.print(list.get(j) + ",");
				}
				if ((i + n - 1) == t.length - 1) {
					System.out.println(list.get(i) + "]");
				} else
					System.out.print(list.get(i) + ",");

			} else {
				if (i == 0)
					System.out.print("[");
				for (int j = i; j < t.length - 1; j++) {
					System.out.print(list.get(j) + ",");

				}
				System.out.println(list.get(t.length - 1) + "]");
			}
		}
	}
}