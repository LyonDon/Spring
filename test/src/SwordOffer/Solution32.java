package SwordOffer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * 输入一个正整数数组，把数组里所有数字拼接起来排成一个数，打印能拼接出的所有数字中最小的一个。
 * 例如输入数组{3，32，321}，则打印出这三个数字能排成的最小数字为321323
 * 
 * @author Administrator
 *
 */
public class Solution32 {
	public String PrintMinNumber(int[] numbers) {
		int n=numbers.length;
		ArrayList<Integer> resArrayList=new ArrayList<Integer>();
		String resString="";
		for (int i = 0; i < numbers.length; i++) {
			resArrayList.add(numbers[i]);
		}
		//一次性排序完成
		Collections.sort(resArrayList, new Comparator<Integer>() {

			@Override
			public int compare(Integer s1, Integer s2) {
				String string1=s1+""+s2;
				String string2=s2+""+s1;
				return string1.compareTo(string2);//返回的是按字典序排序的结果，小的是负数，大的话是正数
			}
		});
		for (Integer integer : resArrayList) {
			resString+=integer;
		}
		return resString;
	}
}
