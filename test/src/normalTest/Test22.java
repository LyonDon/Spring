package normalTest;

import java.util.ArrayList;
import java.util.Arrays;

import javax.annotation.Resource;

/**
 * 华为笔试一题
 * @author Administrator
 *
 */
public class Test22 {
	ArrayList<String> res = new ArrayList<String>();

	public void sort(String in) {
		System.out.println(res);
	}

	public String sort2(int[][] in) {
		String string = null;
		for (int i = 0; i < in.length; i++) {
			string = Arrays.toString(in[i]);
			string.split(",");
			res.add(string);
		}
		return string;
	}

	public static void main(String[] args) {
		Test22 test22 = new Test22();
		int[][] put = { { 3 }, { 2, 5, 6, 7, 9, 5, 6 }, { 3, 6, 9 } };
	}
}
