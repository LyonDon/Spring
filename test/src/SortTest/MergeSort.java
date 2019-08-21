package SortTest;

import java.util.Arrays;

/**
 * 将待排序的数组分成前后两个部分，再递归的将前半部分数据和后半部分的数据各自归并排序，得到的两部分数据.
 * 然后使用merge合并算法（算法见代码）将两部分算法合并到一起。
 * 例如：如果N=1；那么只有一个数据要排序，N=2，只需要调用merge函数将前后合并，N=4，........... 
 * 也就是将一个很多数据的数组分成前后两部分，然后不断递归归并排序，再合并，最后返回有序的数组。O(nlogn)
 * 
 * 稳定排序，比较占用内存，但是效率较高
 * @author Administrator
 *
 */
public class MergeSort {
	
	/**
	 * 归并排序函数
	 * @param array 待排序数组
	 * @param tmp	暂存数组
	 * @param left	左指针
	 * @param right	右指针
	 */
	private static void mergeSort(int[] array,int[] tmp,int left,int right){
        if(left<right){
            int center = ( left + right ) / 2;//取数组的中点
            mergeSort(array,tmp,left,center);//归并排序数组的前半部分
            mergeSort(array,tmp,center+1,right);//归并排序数组的后半部分
            merge(array,tmp,left,center+1,right);//将数组的前后半部分合并
        }
    }

	
	/**
	 * 合并函数
	 * @param array 合并数组
	 * @param tmp 暂存数组
	 * @param leftPos 左节点位置
	 * @param rightPos 右节点位置
	 * @param rightEnd 右终点位置
	 */
	public static void merge(int[] array,int[] tmp,int leftPos,int rightPos,int rightEnd) {
		int leftEnd=rightPos-1;//左终点位置
		int tmpPos=leftPos;//暂存数组节点位置
		int numElements=rightEnd-leftPos+1;//元素个数
		while(leftPos<=leftEnd&&rightPos<=rightEnd){
			if (array[leftPos]<=array[rightPos]) {
				tmp[tmpPos++]=array[leftPos++];
			}else {
				tmp[tmpPos++]=array[rightPos++];
			}
		}
		while(leftPos<=leftEnd){
			tmp[tmpPos++]=array[leftPos++];
		}
		while(rightPos<=rightEnd){
			tmp[tmpPos++]=array[rightPos++];
		}
		for (int i = 0; i < numElements; i++,rightEnd--) {
			array[rightEnd]=tmp[rightEnd];
		}
	}
	//函数重载，参数不同
	public static void mergeSort(int[] array) {
		int[] tmp=new int[array.length];//声明一个用来合并的数组
		mergeSort(array,tmp,0,array.length-1);//调用合并函数，传入数组的起点和终点
		
	}
	
	public static void main(String[] args) {
		int[] array={5,4,3,2,1};
		mergeSort(array);
		System.out.println(Arrays.toString(array));
	}
}
