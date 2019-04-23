package pencilTest;

import java.util.Scanner;

/**
 * 给定一个无序数组，包含正数、负数和0，要求从中找出3个数的乘积，使得乘积最大，要求时间复杂度：O(n)，空间复杂度：O(1)
 * @author Administrator
 *
 */
public class Maxchengji {
	//找出最大的三个正数和最小的两个负数
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int length=scanner.nextInt();
//		System.out.println(length);
		long[] num=new long[length];
		for (int i = 0; i < length; i++) {
			num[i]=scanner.nextInt();
//			System.out.println(num[i]);
		}
		long max1=0;
		long max2=0;
		long max3=0;
		
		long min1=0;
		long min2=0;
		for (int i = 0; i < num.length; i++) {
			if(num[i]>max1){
				max3=max2;
				max2=max1;
				max1=num[i];
			}else if (num[i]>max2) {
				max3=max2;
				max2=num[i];
			}else if (num[i]>max3) {
				max3=num[i];
			}
			
			if (num[i]<min1) {
				min2=min1;
				min1=num[i];
			}else if (num[i]<min2) {
				min2=num[i];
			}else {
				continue;
			}
		}
		long x=max1*max2*max3;
		long y=min1*min2*max1;
//		System.out.println(max1);
//		System.out.println(max2);
//		System.out.println(max3);
//		System.out.println(min1);
//		System.out.println(min2);
		
		if (x>y) {
			System.out.println(x);
		}else {
			System.out.println(y);
		}
	}
}
