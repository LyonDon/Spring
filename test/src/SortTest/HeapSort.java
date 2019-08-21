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
	 * @param array 待排序的数组
	 */
	public static void heapSort(int[] array) {
		int n = array.length;
		int i, tmp;
		// 从（n/2-1）-->0逐次遍历，得到的数组是一个（最大）二叉堆
		for (i = (n / 2 - 1); i >= 0; i--) {
			maxHeapDown(array, i, n - 1);
		}
		// 从最后一个元素开始对序列进行调整，不断缩小调整的范围直到第一个元素
		//相当于是每次大顶堆出来一个元素时，将其与最后一个元素交换。然后进行下一次排序
		for (i = n - 1; i >= 0; i--) {
			tmp = array[0];
			array[0]=array[i];
			array[i]=tmp;
			// 调整a[0...i-1]仍然是一个最大堆
			// 使得a[i-1]是堆中最大的元素
			maxHeapDown(array, 0, i - 1);
		}
	}

	/**
	 * 在数组实现的堆中，节点与其孩子节点下标的关系是，i节点的左孩子是2*i+1节点，右孩子是2*i+2节点
	 * @param array 待排序的数组
	 * @param start 被下调节点的起始位置
	 * @param end 终止位置
	 */
	public static void maxHeapDown(int[] array, int start, int end) {
		int current = start;// 当前节点的位置
		int left = 2 * current + 1;// 左孩子的位置
		int tmp = array[current];
		for (; left <= end; current = left, left = 2 * left + 1) {
			if (left < end && array[left] < array[left + 1]) {
				left++;// l指向左右孩子中较大者
			}
			if (tmp >= array[left]) {
				break;// 如果当前节点比起孩子节点大，调整结束
			} else {
				//tmp=array[c]这一步因为之前已经写过了，所以这里没有写
				array[current]=array[left];//将当前节点与其孩子节点中较大的交换
				array[left]=tmp;
			}
		}
	}
	
	public static void main(String[] args) {
		int[] array={5,4,3,2,1};
		heapSort(array);
		System.out.println(Arrays.toString(array));
	}
}
