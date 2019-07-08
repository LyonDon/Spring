package normalTest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) throws InterruptedException, ParseException {

		Scanner sc = new Scanner(System.in);
		int n = Integer.valueOf(sc.nextLine());
		Long[] array = new Long[n];
		for (int i = 0; i < n; i++) {
			String s = sc.nextLine();

			SimpleDateFormat sdf = new SimpleDateFormat("yyyy MM dd");
			Date oldTime = sdf.parse("2012 3 12");
			Date nowTime = sdf.parse(s);

			Long long1 = oldTime.getTime();
			Long long2 = nowTime.getTime();
			Long day = (long2 - long1) / 1000 / 60 / 60 / 24;
			array[i] = day;
		}
		for (int i = 0; i < n; i++) {
			System.out.println(array[i]);
		}
	}

}
