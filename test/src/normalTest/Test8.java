package normalTest;

import java.util.HashMap;
import java.util.Scanner;

public class Test8 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNextLine()) {
			String[] string = scanner.nextLine().split(" ");
			int M = Integer.valueOf(string[0]);
			int N = Integer.valueOf(string[1]);

			HashMap<String, String> map = new HashMap<String, String>();
			for (int i = 0; i < M; i++) {
				String[] str = scanner.nextLine().split(" ");
				map.put(str[0], str[1]);
			}
			String[] resStrings = new String[N];
			for (int i = 0; i < N; i++) {
				resStrings[i] = scanner.nextLine();
			}
			for (int i = 0; i < N; i++) {
				System.out.print(map.get(resStrings[i]));
				System.out.println();
			}
		}

	}
}
