package pencilTest;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 给定5个正整数, 它们的最小的众倍数是指的能够被其中至少三个数整除的最小正整数。 给定5个不同的正整数, 请计算输出它们的最小众倍数。
 * 
 * @author Administrator
 *
 */
public class Number {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int[] nums=new int[5];
		String[] strings=scanner.nextLine().trim().split(" ");
		for (int i = 0; i < nums.length; i++) {
			nums[i]=Integer.parseInt(strings[i]);
		}
		Arrays.sort(nums);
		int max=Integer.MAX_VALUE;
		/**
		 * 三个指针，分别指向0,1,2位置。求出最小公倍数，k指针向后遍历……完成之后，j指针向后遍历……i指针向后遍历……
		 * 保证每次都求出三个新元素的最小公倍数，最后得到最小的
		 * 相当于暴力法
		 */
		for (int i = 0; i < 3; i++) {
			for (int j = i+1; j < 4; j++) {
				for (int k = j+1; k < 5; k++) {
					int j1=maxGongYueShu(nums[i], nums[j]);//求nums[i],num[j]最大公约数
					int ijmax=nums[i]*(nums[j]/j1);//求nums[i],nums[j]最小公倍数
					int k1=maxGongYueShu(ijmax,nums[k]);
					int ijkmax=nums[k]*(ijmax/k1);
					max=max<ijkmax?max:ijkmax;
				}
			}
		}
		System.out.println(max);
	}
	//求最小公约数函数
	public static int maxGongYueShu(int m,int n) {
		if (m%n==0) {
			return n;
		}else {
			return maxGongYueShu(n, m%n);
		}
	}
}
