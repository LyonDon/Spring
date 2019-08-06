package normalTest;

import java.util.*;

/**
 * 小易在学校中学习了关于字符串的理论, 于是他基于此完成了一个字典的项目。
小易的这个字典很奇特, 字典内的每个单词都包含n个'a'和m个'z', 并且所有单词按照字典序排列。
小易现在希望你能帮他找出第k个单词是什么。
 * @author Administrator
 *
 */
public class Test2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int k = sc.nextInt();
		StringBuilder stringBuilder=new StringBuilder();
		//不用把每一个都列出来，直接找第k个就行了
		while(n>0&&m>0){
			//每次迭代的问题缩减一个单位
			//假设当前的首字母为a，剩下的n-1个a在n-1+m个位置上的排布有几种可能
			long count=1;
			for (int i = 1; i <= n-1; i++) {
				count*=n+m-i;
				count/=i;
				if (count>k) {
					break;
				}
			}
			if (k<=count) {//说明首字母肯定是a
				stringBuilder.append('a');//问题简化为n-1个a和m个z中找第k个
				n--;
			}else {
				stringBuilder.append('z');
				m--;//问题简化为n个a和m-1个z中找第k-count个（把首字母为a的可能性都排除了，即前count个减去）
				k-=count;
			}
		}
		if (k!=1) {//说明没有找到（k=1表示的是第k个数，若=0则表示k+1个数）
			System.out.println(-1);
			return;
		}else {
			//说明后面肯定都是a或者都是z
			//注意这里是while，因为n--和m--的判定不止一次
			while (n-->0) {
				stringBuilder.append('a');
			}
			while (m-->0) {
				stringBuilder.append('z');
			}
			System.out.println(stringBuilder.toString());
		}
	}
}