package SwordOffer;
/**
 * 统计一个数字在排序数组中出现的次数
 * @author Administrator
 *
 */
public class Solution37 {
	//可以直接遍历，使用二分查找的速度会更快
	public int GetNumberOfK(int[] array, int k) {
		int upper=getUpperCase(array,k);
		int lower=getLowerCase(array, k);
		return upper-lower+1;
	}
	
	public static int getLowerCase(int[] array,int k) {
		int start=0;
		int end=array.length-1;
		int mid=(start+end)/2;
		while(start<=end){
			if (array[mid]<k) {
				start=mid+1;
			}else {
				end=mid-1;
			}
			mid=(start+end)/2;
		}
		return start;
	}
	
	public static int getUpperCase(int[] array,int k) {
		int start=0;
		int end=array.length-1;
		int mid=(start+end)/2;
		while(start<=end){
			if (array[mid]<=k) {
				start=mid+1;
			}else{
				end=mid-1;
			}
			mid=(start+end)/2;
		}
		return end;
	}
}
