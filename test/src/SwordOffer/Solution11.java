package SwordOffer;
/**
 * 输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。
 * @author Administrator
 *
 */
public class Solution11 {
	public int numberOf1(int n) {
		int count=0;
		String res=Integer.toBinaryString(n);
		for (int i = 0; i < res.length(); i++) {
			if (res.charAt(i)=='1') {
				count++;
			}
		}
		return count;
	}
	public int numberOf12(int n) {
		int count=0;
		int flag=1;
		while(flag!=0){
			if ((flag&n)!=0) {
				count++;
			}
			flag=flag<<1;
		}
		return flag;
	}
}
