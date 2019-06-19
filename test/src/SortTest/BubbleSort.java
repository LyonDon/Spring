package SortTest;

/**
 * 持续比较相邻的元素。如果第一个比第二个大，就交换。直到没有任何一对数字进行比较。O（n^2）
 * 稳定
 * @author Administrator
 *
 */
public class BubbleSort {
	public static void bubbleSort(int[] array) {
		int tmp;
		boolean flag=false;//记录是否发生数据交换
		for (int i = array.length-1; i>=0; i--) {//每一轮选出一个最大元素，然后将i指针前移一个元素
			for (int j = 0; j < i; j++) {
				if (array[j]>array[j+1]) {
					tmp=array[j];
					array[j+1]=array[j];
					array[j+1]=tmp;
					flag=true;//设置数据交换的标志位为真
				}
			}
			if (flag==false) {
				break;//如果这一轮没有出现数据交换，说明排序完成，退出循环
			}
		}
	}
}
