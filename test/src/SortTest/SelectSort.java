package SortTest;

import java.util.Arrays;

/**
 * 每次从待排序的数据中选出最小（或最大）的一个元素，存放在序列的起始位置，直到全部待排序的数据元素排完。O（n^2） 
 * 不稳定排序
 * 
 * @author Administrator
 *
 */
public class SelectSort {
	public static void selectSort(int[] array) {
		for (int i = 0; i < array.length; i++) {
			int min=array[i];//待排序元素的头元素
			int index=i;//头元素下标
			for (int j = i; j < array.length; j++) {
				if (array[j]<min) {//若产生新的最小元素，将min和index指向它
					min=array[j];
					index=j;
				}
			}
			if (i!=index) {//将最小元素和队头元素交换
				array[index]=array[i];//将i元素放到后面去
				array[i]=min;//将最小的元素放到i位置
			}
		}
	}
	
	public static void main(String[] args) {
		int[] array={5,4,3,2,1};
		selectSort(array);
		System.out.println(Arrays.toString(array));
	}
}


