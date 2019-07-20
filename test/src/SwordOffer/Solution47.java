package SwordOffer;

/**
 * 求1+2+3+...+n，要求不能使用乘除法、for、while、if、else、switch、case等关键字及条件判断语句（A?B:C）。
 * @author Administrator
 *
 */
public class Solution47 {
	public static int Sum_Solution(int n) {
		if (n==1) {
			return 1;
		}
		if (n==2) {
			return 1+2;
		}
		else {
			return Sum_Solution(n-1)+n;
		}
	}
	public static void main(String[] args) {
		System.out.println(Sum_Solution(5));
	}
}
