package SortTest;

/**
 * 每次从待排序的数据中选出最小（或最大）的一个元素，存放在序列的起始位置，直到全部带排序的数据元素排完。O（n^2） 
 * 不稳定排序
 * 
 * @author Administrator
 *
 */
public class SelectSort {
	public static void selectSort(int[] array) {
		for(int i=0;i<array.length;i++){
			int min=array[i];//min存储当前最小的元素值
			int minindex=i;//minindex存储当前最小元素下标
			for (int j = i; j < array.length; j++) {
				if (array[j]<min) {//选择当前最小元素
					min=array[j];
					minindex=j;
				}
			}
			if (i!=minindex) {//若i不是当前元素最小的，则将i元素与找到的那个元素交换
				array[minindex]=array[i];
				array[i]=min;
			}
		}
	}
}
