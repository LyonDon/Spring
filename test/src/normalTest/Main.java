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
		int i = 0;
		int a = i++;
		int b = ++a;
		int c = a + b;
		int d = (a == 1) ? b : c;
		System.out.println(i);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}

	public static long check(Long n) {
		if (map.containsKey(n)) {
			return map.get(n);
		}
		Long log = log2(n);

		Long x = check(n - (long) Math.pow(2, log)) + check((long) Math.pow(2, log + 1) - n - 2);
		map.put(n, x);
		return x;
	}

	public static long log2(long n) {
		return (long) (Math.log(n) / Math.log(2));
	}
}
