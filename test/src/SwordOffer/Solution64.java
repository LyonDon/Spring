package SwordOffer;

import java.util.ArrayList;

/**
 * 给定一个数组和滑动窗口的大小，找出所有滑动窗口里数值的最大值。
 * 例如，如果输入数组{2,3,4,2,6,2,5,1}及滑动窗口的大小3，那么一共存在6个滑动窗口，他们的最大值分别为{4,4,6,6,6,5}；
 *  针对数组{2,3,4,2,6,2,5,1}的滑动窗口有以下6个： 
 *  {[2,3,4],2,6,2,5,1}， {2,[3,4,2],6,2,5,1}， {2,3,[4,2,6],2,5,1}， 
 *  {2,3,4,[2,6,2],5,1}， {2,3,4,2,[6,2,5],1}， {2,3,4,2,6,[2,5,1]}。
 * @author Administrator
 *
 */
public class Solution64 {
	public ArrayList<Integer> maxInWindows(int [] num, int size){
		ArrayList<Integer> resArrayList=new ArrayList<>();
		if (num.length<size||size<=0) {
			return resArrayList;
		}
		int len=num.length;
		int[] array=new int[size]; 
		for (int i = 0; i <= len-size; i++) {
			for (int j = 0; j < size; j++) {
				array[j]=num[j+i];
			}
			resArrayList.add(getMax(array));
			for (int j = 0; j < array.length; j++) {
				array[j]=0;
			}
		}
		return resArrayList;
		
	}
	
	public int getMax(int[] array){
		int max=Integer.MIN_VALUE;
		for (int i = 0; i < array.length; i++) {
			max=max>array[i]?max:array[i];
		}
		return max;
	}
}
