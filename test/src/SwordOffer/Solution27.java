package SwordOffer;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * 输入一个字符串,按字典序打印出该字符串中字符的所有排列。
 * 例如输入字符串abc,则打印出由字符a,b,c所能排列出来的所有字符串abc,acb,bac,bca,cab和cba。
 * @author Administrator
 *
 */
public class Solution27 {
	public ArrayList<String> permutation(String string){
		//将字符串分为两个部分，前一部分为第一个字符，后一部分为后面的字符
		//将一个字符与后面的字符分别交换，并递归
		ArrayList<String> resArrayList=new ArrayList<String>();
		if (string!=null&&string.length()>=0) {	
			permutation(string.toCharArray(), 0, resArrayList);
			Collections.sort(resArrayList);
		}
		return resArrayList;
	}
	
	public static ArrayList<String> permutation(char[] ch,int i,ArrayList<String> resArrayList){
		if (i==ch.length-1) {
			resArrayList.add(String.valueOf(ch));
		}else {
			Set<Character> charSet=new HashSet<Character>();
			for (int j = 0; j < ch.length; j++) {
				if (j==i||charSet.contains(ch[j])) {
					charSet.add(ch[j]);
					swap(ch,i,j);
					permutation(ch, i+1, resArrayList);
					swap(ch,j,i);
				}
			}
		}
		return resArrayList;
	}
		
	public static void	swap(char[] array,int i,int j){
		char tmp=array[i];
		array[i]=array[j];
		array[j]=tmp;
	}
}
