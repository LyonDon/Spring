package normalTest;

import java.util.Arrays;
import java.util.Scanner;

public class Testnew {
	public static void main(String[] args) {
//		Scanner scanner=new Scanner(System.in);
//		int[] nums=new int[4];
//		for (int i = 0; i < nums.length; i++) {
//			String[] strings=scanner.nextLine().trim().split(" ");
//			nums[i]=Integer.parseInt(strings[i]);
//		}
//		int s=nums[0];
//		for (int i = 1; i < 4; i++) {
//			if (nums[i]<s) {
//				combination(s, nums[i]);
//			}
//		}
//	}
//	public static long factorial(int n) {  
//	    return (n > 1) ? n * factorial(n - 1) : 1;  
//	}
//	
//	public static long combination(int n, int m) {  
//	    return (n >= m) ? factorial(n) / factorial(n - m) / factorial(m) : 0;  
		int[] x={1,23,4};
		int[] z=x;
		int[] y={1,23,4};
		System.out.println(Arrays.equals(x,y));
		System.out.println(Arrays.toString(z));
	}  
}
