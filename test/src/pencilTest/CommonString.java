package pencilTest;

import java.util.Scanner;

/**
 * 有两个字符串（可能包含空格）,请找出其中最长的公共连续子串,输出其长度。
 * 
 * @author Administrator
 *
 */
public class CommonString {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String str1=scanner.nextLine();
		String str2=scanner.nextLine();
		if (str1.length()==1||str2.length()==1) {
			System.out.println(1);
		}
		common(str1, str2);
		
		Scanner scanner2=new Scanner(System.in);
		char[] ch1=scanner2.nextLine().toCharArray();
		char[] ch2=scanner2.nextLine().toCharArray();
		if (str1.length()==1||str2.length()==1) {
			System.out.println(1);
		}
		dp(ch1, ch2);
		
	}
	
	/**
	 * dp法，将字符串读入为字符数组，用二维数组dp保存每个位置上比较的结果，若一样就在原基础上加一，最后使用一个res进行迭代
	 * @param ch1
	 * @param ch2
	 */
	public static void dp(char[] ch1,char[] ch2) {
		int[][] dp=new int[ch1.length][ch2.length];
		int res=0;
		for (int i = 0; i < ch1.length; i++) {
			for (int j = 0; j < ch2.length; j++) {
				if (ch1[i]==ch2[j]) {
					dp[i][j]=(i==0||j==0)?1:dp[i-1][j-1]+1;
					res=dp[i][j]>res?dp[i][j]:res;
				}
			}
		}
		System.out.println(res);
	}
	
	/**
	 * 遍历求子串
	 * @param str1
	 * @param str2
	 */
	public static void common(String str1,String str2) {
		int tmp=0;
		int max=0;
		if (str1.length()>str2.length()) {
			for (int i = 0; i < str2.length()-1; i++) {
				for (int j = i; j < str2.length(); j++) {
					if (str1.contains(str2.substring(i, j))) {
						tmp=str2.substring(i, j).length();
						max=tmp>max?tmp:max;
					}
				}
			}
		}else {
			for (int i = 0; i < str1.length()-1; i++) {
				for (int j = i; j < str1.length(); j++) {
					if (str2.contains(str1.substring(i, j))) {
//						System.out.println("zichuanwei:"+str1.substring(i,j));
						tmp=str1.substring(i, j).length();
						max=tmp>max?tmp:max;
//						System.out.println("max值为："+max);
					}
				}
			}
		}
		System.out.println(max);
	}
}
