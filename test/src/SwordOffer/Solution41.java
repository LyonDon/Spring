package SwordOffer;

import java.util.ArrayList;

/**
 * 小明很喜欢数学,有一天他在做数学作业时,要求计算出9~16的和,他马上就写出了正确答案是100。
 * 但是他并不满足于此,他在想究竟有多少种连续的正数序列的和为100(至少包括两个数)。
 * 没多久,他就得到另一组连续正数和为100的序列:18,19,20,21,22。
 * 现在把问题交给你,你能不能也很快的找出所有和为S的连续正数序列? Good Luck!
 * @author Administrator
 *输出所有和为S的连续正数序列。序列内按照从小至大的顺序，序列间按照开始数字从小到大的顺序
 */
public class Solution41 {
	public ArrayList<ArrayList<Integer> > FindContinuousSequence(int sum) {
		//双指针法
        //由于是差值为1的连续子序列，所以和为（a0+a1）*n/2
		int low=1;
		int high=2;
		ArrayList<ArrayList<Integer>> resArrayList=new ArrayList<ArrayList<Integer>>();
		while(low<high){
			int cur=(low+high)*(high-low+1)/2;
			ArrayList<Integer> tmpArrayList=new ArrayList<Integer>();
			if (cur==sum) {
				for (int i = low; i <= high; i++) {
					tmpArrayList.add(i);
				}
				resArrayList.add(tmpArrayList);
				low++;
			}else if (cur<sum) {
				high++;
			}else {
				low++;
			}
		}
		return resArrayList;
	}
}
