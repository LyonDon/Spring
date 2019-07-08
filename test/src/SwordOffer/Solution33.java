package SwordOffer;

import java.util.ArrayList;

/**
 * 把只包含质因子2、3和5的数称作丑数（Ugly Number）。例如6、8都是丑数，但14不是，因为它包含质因子7。 
 * 习惯上我们把1当做是第一个丑数。求按从小到大的顺序的第N个丑数
 * @author Administrator
 *
 */
public class Solution33 {
	public int GetUglyNumber_Solution(int index) {
		//借助一个ArrayList将所有的丑数按顺序保存起来
		ArrayList<Integer> res=new ArrayList<Integer>();
		res.add(1);
		int i2=0;
		int i3=0;
		int i5=0;
		while(res.size()<index){
			int a2=res.get(i2)*2;
			int a3=res.get(i3)*3;
			int a5=res.get(i5)*5;
			int min=Math.min(a2, Math.min(a3, a5));
			res.add(min);
			if (a2==min) i2++;
			if (a3==min) i3++;
			if (a5==min) i5++;
		}
		return res.get(res.size()-1);
	}
}
