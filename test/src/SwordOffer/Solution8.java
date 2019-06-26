package SwordOffer;
/**
 * 跳台阶：一次可跳一个也可跳两个，一共n级台阶，有几种跳法
 * @author Administrator
 *
 */
public class Solution8 {
	//递归方式
	public int jump(int n){
		if (n==1||n==2) {
			return n;
		}
		return jump(n-1)+jump(n-2);
	}
	//动态规划方式
	//这里的n-1就是为了满足最后的i-1，否则会出现数组越界的问题
	//返回第n个数时，应该是dp[n-1],因为是从零开始算起的
	public static int climbStairs(int n){
		int dp[]=new int[n+1];
		dp[0]=1;
		dp[1]=1;
		if (n<2) {
			return 1;
		}
		for (int i = 2; i<n+1; i++) {
			dp[i]=dp[i-1]+dp[i-2];
		}
		return dp[n-1];
	}
	public static void main(String[] args) {
		System.out.println(climbStairs(10));
	}
}
