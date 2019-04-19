package pencilTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Digitalrearrangement {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int num[] = new int[n];
		ArrayList<String> arrayList = new ArrayList<String>();
		for (int i = 0; i < n; i++) {
			num[i] = scanner.nextInt();
			if (canrearrange(num[i]) == true) {
				arrayList.add("Possible");
			} else {
				arrayList.add("Impossible");
			}
		}
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println(arrayList.get(i));
		}
	}

	public static boolean canrearrange(int num) {
		int n = String.valueOf(num).length();
		int[] letter = new int[n];
		int temp = num;
		for (int i = 0; i < n; i++) {
			letter[i] = temp % 10;
			temp /= 10;
		}
		int[] letter_tmp = new int[n];
		for (int i = 2; String.valueOf(num * i).length() == n; i++) {
			int tmp = num * i;
			for (int j = 0; j < n; j++) {
				letter_tmp[j] = tmp % 10;
				tmp /= 10;
			}
			int[] tmp_letter = new int[n];
			tmp_letter = letter;
			Arrays.sort(tmp_letter);
			Arrays.sort(letter_tmp);
			if (Arrays.equals(tmp_letter, letter_tmp)) {
				return true;
			}
		}
		return false;
	}
}
