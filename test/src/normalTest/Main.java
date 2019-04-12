package normalTest;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
	static HashMap<Long, Long> map = new HashMap<Long, Long>();

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
		map.put(-1L, 0L);
		map.put(0L, 1L);
		map.put(1L, 1L);
		long long1 = Long.valueOf(bReader.readLine());
		long result = check(long1);
		System.out.println(result);
	}

	public static long check(Long n) {
		if (map.containsKey(n)) {
			return map.get(n);
		}
		Long log = log2(n);

		Long x = check(n-(long) Math.pow(2, log)) + check((long) Math.pow(2, log + 1) - n - 2);
		map.put(n, x);
		return x;
	}

	public static long log2(long n) {
		return (long) (Math.log(n) / Math.log(2));
	}
}
