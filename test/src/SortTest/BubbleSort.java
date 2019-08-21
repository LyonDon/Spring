package SortTest;

import java.util.Arrays;

/**
 * 持续比较相邻的元素。如果第一个比第二个大，就交换。直到没有任何一对数字进行比较。O（n^2）
 * 稳定
 * @author Administrator
 *
 */
public class BubbleSort {
	public static void bubbleSort(int[] array) {
		int tmp;//用于元素交换
		boolean flag=false;//保存当前轮是否发生元素交换
		for (int i = array.length-1; i>=0; i--) {
			for (int j = 0; j < i; j++) {
				if (array[j]>array[j+1]) {
					tmp=array[j];
					array[j]=array[j+1];
					array[j+1]=tmp;
					flag=true;
				}
			}
			if(flag==false){
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		int[] array={1,4,7,5,2};
		bubbleSort(array);
		System.out.println(Arrays.toString(array));
	}
}
