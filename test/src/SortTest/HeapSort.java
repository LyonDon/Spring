package SortTest;

import java.util.Arrays;

/**
 * 在排序过程中，将R[l..n]看成是一棵完全二叉树的顺序存储结构，利用完全二叉树节点的内在关系，
 * 在当前无序区中选择关键字最大或者最小的记录。O(nlogn)
 * 
 * 不稳定排序
 * 
 * @author Administrator
 *
 */
public class HeapSort {
	/**
	 * 堆排序 调整最大堆，交换根元素和最后一个元素
	 * 
	 * @param array
	 *            待排序的数组
	 */

	public static void heapSort(int[] array) {
		int n = array.length;
		int i, tmp;
		for (i = n / 2 - 1; i >= 0; i--) {// 对节点遍历，结果形成一个大顶堆，相当于是插入一个一个元素，并不断建堆
			maxHeapDown(array, i, n - 1);
		}
		for (i = n - 1; i >= 0; i--) {// 交换根结点和尾节点位置然后形成新堆
			tmp = array[i];
			array[i] = array[0];
			array[0] = tmp;
			maxHeapDown(array, 0, i - 1);
		}
	}

	/**
	 * 在数组实现的堆中，节点与其孩子节点下标的关系是，i节点的左孩子是2*i+1节点，右孩子是2*i+2节点
	 * 
	 * @param array
	 *            待排序的数组
	 * @param start
	 *            被下调节点的起始位置
	 * @param end
	 *            终止位置
	 */
	public static void maxHeapDown(int[] array, int start, int end) {
		int current = start;
		int left = current * 2 + 1;//left指示子节点中较大的那一个
		int tmp = array[current];
		for (; left <= end; current = left, left = left * 2 + 1) {
			if (left < end && array[left] < array[left + 1]) {
				left++;
			}
			if (tmp >= array[left]) {
				break;
			} else {
				array[current] = array[left];
				array[left] = tmp;
			}
		}
	}

	public static void main(String[] args) {
		int[] array = { 5, 4, 3, 2, 1 };
		heapSort(array);
		// maxHeapDown(array, 0, array.length-1);
		System.out.println(Arrays.toString(array));
	}
}
