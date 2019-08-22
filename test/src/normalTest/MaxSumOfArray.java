package normalTest;

import java.util.Scanner;

/**
 * 连续数组最大和
 * @author Administrator
 *
 */
public class MaxSumOfArray {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int N=scanner.nextInt();
		int[] num=new int[N];
		for (int i = 0; i < N; i++) {
			num[i]=scanner.nextInt();
		}
		System.out.println(max(num));
	}
	
	public static int max(int[] array) {
		int i=0;
		int tmp=0;
		int res=array[0];
		
		for (; i < array.length; i++) {
			tmp+=array[i];
			if (tmp>=0) {//核心在于对tmp>0的判断
				res=res>=tmp?res:tmp;
			}else{
				tmp=0;
			}
		}
		return res;
	}
}
