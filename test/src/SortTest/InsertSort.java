package SortTest;

import java.util.Arrays;

/**
 * 每步将一个待排序的记录，按其关键码值的大小插入前面已经排序的文件中的适当位置，直到全部插入为止。O（n^2）
 * 稳定排序
 * @author Administrator
 *
 */
public class InsertSort {
	
	public static void insertsort(int[]	array){
		int tmp;//用于保存当前值
		for (int i = 0; i < array.length; i++) {
			int j=i;
			tmp=array[i];
			for (;  j>0&&tmp<array[j-1]; j--) {
				array[j]=array[j-1];//将当前元素之前的元素一个一个向后移动
			}
			array[j]=tmp;
		}
	}
	
	public static void main(String[] args) {
		int[] array={5,4,3,2,1};
		insertsort(array);
		System.out.println(Arrays.toString(array));
	}
}
