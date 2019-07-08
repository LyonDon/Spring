package SwordOffer;

/**
 * 求出1~13的整数中1出现的次数,并算出100~1300的整数中1出现的次数？
 * 为此他特别数了一下1~13中包含1的数字有1、10、11、12、13因此共出现6次,但是对于后面问题他就没辙了。
 * ACMer希望你们帮帮他,并把问题更加普遍化,可以很快的求出任意非负整数区间中1出现的次数（从1 到 n 中1出现的次数）。
 * 
 * @author Administrator
 *
 */
public class Solution31 {
	public int NumberOf1Between1AndN_Solution(int n) {
		//暴力法，遍历1到n中的每一个数，分别求出其1的个数相加
		int count = 0;
		for (int i = 0; i <= n; i++) {
			int tmp = i;
			while (tmp != 0) {
				if (tmp % 10 == 1) {
					count++;
				}
				tmp /= 10;
			}
		}
		return count;
		
	}
	public int NumberOf1Between1AndN_Solution2(int n) {
		//数学法
		if (n<1) {
			return 0;
		}
		int count=0;//1的个数
		int base=1;//每一位的权值
		int round=n;//一共有多少位（这里因为round每次是除以10的，所以表示的是位数）
		while(round>0){
			int weight=round%10;//每一个权重上1的个数
			round/=10;
			count+=round*base;
			if (weight==1) {
				count+=(n%base)+1;
			}else if (weight>1) {
				count+=base;
			}
			base*=10;
		}
		return count;
	}
}
