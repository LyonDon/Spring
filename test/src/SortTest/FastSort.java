package SortTest;

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
//		int tmp;// 用于后面的元素交换
//		int base = array[start];// 选择基准值为第一个元素
//		int i = start;
//		int j = end;
//		if (start < end) {// 首先判断start要在end之前（一般情况下，start是0，end是array.length-1）
//			do {
//				while (i < end && array[i] < base) {
//					i++;
//				}
//				while (j > start && array[j] > base) {
//					j--;
//				}
//				while (i <= j) {
//					tmp = array[i];
//					array[i] = array[j];
//					array[j] = tmp;
//					i++;
//					j--;
//				}
//			} while (i <= j);//一次排序过程结束
//			//分别针对基准元素的左右子数组递归排序
//			if (start < j) {
//				fastSort(array, start, j);
//			}
//			if (i < end) {
//				fastSort(array, i, end);
//			}
//		}
		int tmp;
		int base=array[start];
		int i=start;
		int j=end;
		
		do {
			while(i<end&&array[i]<base){
				i++;
			}
			while(j>start&&array[j]>base){
				j--;
			}
			while(i<=j){
				tmp=array[j];
				array[j]=array[i];
				array[i]=tmp;
				i++;
				j--;
			}
		} while (i<=j);
		if (i<end) {
			fastSort(array, i, end);
		}
		if (j>start) {
			fastSort(array, start, j);
		}
	}
}
