package SwordOffer;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 * 一个整型数组里除了两个数字之外，其他的数字都出现了两次。请写程序找出这两个只出现一次的数字。
 * @author Administrator
 *
 */
//num1,num2分别为长度为1的数组。传出参数
//将num1[0],num2[0]设置为返回结果
public class Solution40 {
	 public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
		 if (array.length<2) {
			return;
		}
		 Map<Integer, Integer> map=new HashMap<Integer, Integer>();
		 for (int i = 0; i < array.length; i++) {
			 int count=1;
			 if (!map.containsKey(array[i])) {
				map.put(array[i],count);
			}else {
				count++;
				map.put(array[i], count);
			}
		}
		 //第一种方法
		 Object[] values=map.keySet().toArray();
		 int num=0;
		 for (int i = 0; i < values.length; i++) {
			int value=(Integer)values[i];
			if (map.get(value)==1&&num==0) {
				num1[num++]=value;
			}else if (map.get(value)==1&&num==1) {
				num2[--num]=value;
				break;
			}
		}
		 //第二种方法
			 int flag=0;
			 for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
				if (entry.getValue()==1&&flag==0) {
					num1[0]=entry.getKey();
					flag++;
				}
				if (entry.getValue()==1&&flag==1) {
					num2[0]=entry.getKey();
			 		flag--;
				}
			}
	 }
}
