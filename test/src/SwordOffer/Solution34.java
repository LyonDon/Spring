package SwordOffer;

import java.util.HashMap;
import java.util.Map;

/**
 * 在一个字符串(0<=字符串长度<=10000，全部由字母组成)中找到第一个只出现一次的字符,并返回它的位置, 
 * 如果没有则返回 -1（需要区分大小写）.
 * @author Administrator
 *
 */
public class Solution34 {
	public int FirstNotRepeatingChar(String str) {
		//使用hashmap保存字符串的每个字符
		Map<Character,Integer> map=new HashMap<Character,Integer>();
		for (int i = 0; i < str.length(); i++) {
			char key=str.charAt(i);
			int count=1;
			if (!map.containsKey(key)) {
				map.put(key, count);
			}else{
				count++;
				map.put(key, count);
			}
		}
		for (int j = 0; j < str.length(); j++) {
			Integer value=map.get(str.charAt(j));
			if (value==1) {
				return j;
			}
		}
		return -1;
		
	}
}
