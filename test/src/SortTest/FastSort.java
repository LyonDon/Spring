package SortTest;

import java.util.Arrays;

/**
 * 两个方向，左边的i下标一直往右走，当a[i] <= a[center_index]，
 * 其中center_index是中枢元素的数组下标，而右边的j下标一直往左走，当a[j] > a[center_index] 如果i和j都走不动了，i <=
 * j, 交换a[i]和a[j],重复上面的过程，直到i>j 交换a[j]和a[center_index]，完成一趟快速排序 枢轴采用三数中值分割法可以优化
 * O（nlogn） 不稳定排序
 * 
 * @author Administrator
 *
 */
public class FastSort {
	public static void fastSort(int[] array, int start, int end) {
		int tmp;//用于元素交换
		int base=array[start];//设置基准元素
		int i=start;
		int j=end;
		
		while(i<=j){
			while(i<end&&array[i]<base){
				i++;
			}
			while(j>start&&array[j]>base){
				j--;
			}
			if (i<=j) {
				tmp=array[i];
				array[i]=array[j];
				array[j]=tmp;
				i++;
				j--;
			}
		}
		if (i<end) {
			fastSort(array, i, end);
		}
		if (j>start) {
			fastSort(array, start, j);
		}
	}

	public static void main(String[] args) {
		int[] array={5,4,3,2,1};
		fastSort(array, 0, array.length-1);
		System.out.println(Arrays.toString(array));
	}
}

