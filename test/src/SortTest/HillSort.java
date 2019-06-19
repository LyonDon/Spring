package SortTest;

/**
 * 先取一个小于n的整数d1作为第一个增量，把文件的全部记录分组。
 * 所有距离为d1的倍数的记录放在同一个组中。先在各组内进行直接插入排序；
 * 然后，取第二个增量d2<d1重复上述的分组和排序，直至所取的增量dt=1(dt<dt-1…<d2<d1)，
 * 即所有记录放在同一组中进行直接插入排序为止.0(nlogn)
 * 
 * 不稳定
 * @author Administrator
 *
 */
public class HillSort {
	public static void hillSort(int[] array) {
		int j;
		for (int gap = array.length/2; gap>0; gap/=2) {//定义gap作为增量，初始取array.lengh/2，每次取1/2
			for (int i=gap; i < array.length; i++) {
				int tmp=array[i];
				for (j = i;  j>=gap&& tmp<array[j-gap]; j-=gap) {
					array[j]=array[j-gap];
				}
				array[j]=tmp;
			}
		}	
	}
}
