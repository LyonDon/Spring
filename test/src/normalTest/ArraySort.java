package normalTest;
/**
 * 整数数组按照绝对值排序
 * @author Administrator
 */
public class ArraySort {
	private static int[] sort(int[] array) {
		for (int i = array.length-1; i >=0; i--) {
			for (int j = 0; j < i; j++) {
				if (Math.abs(array[j])>Math.abs(array[j+1])) {
					int tmp=array[j];
					array[j]=array[j+1];
					array[j+1]=tmp;
				}
				if (Math.abs(array[j])==Math.abs(array[j+1])&&array[j+1]<0) {
					int tmp=array[j];
					array[j]=array[j+1];
					array[j+1]=tmp;
				}
			}
		}
		return array;
	}
	public static void main(String[] args) {
		int[] array={1,12,-1,-123,11};
		int[] res=sort(array);
		for (int i = 0; i < array.length; i++) {
			System.out.println(res[i]);
		}
	}
}
