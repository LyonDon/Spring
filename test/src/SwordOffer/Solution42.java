package SwordOffer;

import java.util.ArrayList;

/**
 * 输入一个递增排序的数组和一个数字S，在数组中查找两个数，
 * 使得他们的和正好是S，如果有多对数字的和等于S，输出两个数的乘积最小的。
 * 
 * 对应每个测试案例，输出两个数，小的先输出
 * @author Administrator
 *
 */
public class Solution42 {
	public ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) {
		//双指针法,递增遍历
		ArrayList<Integer> resArrayList=new ArrayList<Integer>();
		//递增序列，第一次查找到的元素就是乘积最小的
//		for (int i = 0; i < array.length; i++) {
//			for (int j = i+1; j < array.length; j++) {
//				if (array[i]+array[j]==sum) {
//					resArrayList.add(array[i]);
//					resArrayList.add(array[j]);
//					return resArrayList;
//				}
//			}
//		}
//		return resArrayList;
		
		//双指针左右夹逼
		ArrayList<Integer> resArrayList2=new ArrayList<Integer>();
		int i=0;
		int j=array.length-1;
		while(i<j){
			if (array[i]+array[j]==sum) {
				resArrayList2.add(array[i]);
				resArrayList2.add(array[j]);
				return resArrayList2;
			}else if (array[i]+array[j]>sum) {
				j--;
			}else {
				i++;
			}
		}
		return resArrayList2;
	}
	
}
