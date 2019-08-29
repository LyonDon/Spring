package normalTest;

import java.util.Arrays;
import java.util.Scanner;

public class Test5 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String string1=scanner.nextLine();
		String string2=scanner.nextLine();
		String[] strings=string1.split(" ");
		int lim=Integer.parseInt(string2);
		int[] array=new int[strings.length];
		for (int i = 0; i < strings.length; i++) {
			array[i]=Integer.parseInt(strings[i]);
		}
		System.out.println(countboat(array, lim));
	}
	
	public static int countboat(int[] nums,int max) {
		Arrays.sort(nums);
		int count=0;
		int i=0;
		int j=nums.length-1;
		while(i<j){
			if (nums[i]+nums[j]<=max) {
				i++;
				j--;
			}else {
				j--;
			}
			count++;
		}
		return count+=(j==i?1:0);
	}
}
