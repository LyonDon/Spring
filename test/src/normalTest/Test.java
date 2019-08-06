package normalTest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) throws InterruptedException, ParseException {

//		Scanner sc = new Scanner(System.in);
//		int n = Integer.valueOf(sc.nextLine());
//		Long[] array = new Long[n];
//		for (int i = 0; i < n; i++) {
//			String s = sc.nextLine();
//
//			SimpleDateFormat sdf = new SimpleDateFormat("yyyy MM dd");
//			Date oldTime = sdf.parse("2012 3 12");
//			Date nowTime = sdf.parse(s);
//
//			Long long1 = oldTime.getTime();
//			Long long2 = nowTime.getTime();
//			Long day = (long2 - long1) / 1000 / 60 / 60 / 24;
//			array[i] = day;
//		}
//		for (int i = 0; i < n; i++) {
//			System.out.println(array[i]);
//		}
		
		ArrayList<ArrayList<Integer>> resArrayList=new ArrayList<ArrayList<Integer>>();
		ArrayList<ArrayList<Integer>> resArrayList2=new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(1);
		resArrayList.add(list);
		resArrayList2.add(new ArrayList<Integer>(list));
		System.out.println(resArrayList.toString());
		System.out.println(resArrayList2.toString());
		String string="(123)";
		System.out.println(string.substring(0,4));
	}

}
