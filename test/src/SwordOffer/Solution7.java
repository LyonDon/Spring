package SwordOffer;

//斐波那契数列
public class Solution7 {
	public int Fibonacci(int n) {
		if (n==0||n==1) {
			return 0;
		}
		return Fibonacci(n-1)+Fibonacci(n-2);
	}
}
