package pencilTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * 小明去附近的水果店买橙子，水果商贩只提供整袋购买，有每袋6个和每袋8个的包装（包装不可拆分）。
 * 可是小明只想购买恰好n个橙子，并且尽量少的袋数方便携带。如果不能购买恰好n个橙子，小明将不会购买
 * 
 * @author Administrator
 *
 */
public class Orange {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		if (num < 6 || num < 8) {
			System.out.println(-1);
		}
		System.out.println(bags(num));
	}

	public static int bags(int num) {
		List<Integer> list=new ArrayList<Integer>();
		int min=num/6;
		int max=num/8;
		for (int i = 0; i <= min; i++) {
			for (int j = 0; j <= max; j++) {
				if (6*i+8*j==num) {
					list.add(i+j);
				}
			}
		}
		if (list.size()==0) {
			return -1;
		}
		return Collections.min(list);
	}
}
