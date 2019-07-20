package SwordOffer;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * 请实现一个函数用来找出字符流中第一个只出现一次的字符。例如，当从字符流中只读出前两个字符"go"时，第一个只出现一次的字符是"g"。
 * 当从该字符流中读出前六个字符“google"时，第一个只出现一次的字符是"l"
 *
 * 如果当前字符流没有存在出现一次的字符，返回#字符
 * @author Administrator
 *
 */

public class Solution54{
	public static LinkedList<Character> list=new LinkedList<Character>();
	public static HashMap<Character, Integer> map=new HashMap<Character, Integer>();
	
	public static LinkedList<Character> insert(char ch) {
		list.add(ch);
		if (map.containsKey(ch)) {
			map.put(ch, map.get(ch)+1);
		}else {
			map.put(ch, 1);
		}
		return list;
	}
	
	public static char findFirst(){
		for(char ch:list){
			if (map.get(ch)==1) {
				return ch;
			}		
		}
		return '#';
	}
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String string=scanner.nextLine();
		for(int i=0;i<string.length();i++){
			insert(string.charAt(i));
		}
		System.out.println(findFirst());
	}
}