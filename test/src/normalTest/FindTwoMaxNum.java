package normalTest;

import java.util.Scanner;

public class FindTwoMaxNum {
	public static void main(String[] args) {
//		int[] num=new int[]{1,2,32,11,3};
//		int[] res=find(num);
//		for (int i = 0; i < res.length; i++) {
//			System.out.println(res[i]);	
//		}
		Scanner scanner=new Scanner(System.in);
		String[] string=scanner.nextLine().trim().split(" ");
		int[] res=new int[string.length];
		for (int i = 0; i < string.length; i++) {
			res[i]=Integer.parseInt(string[i]);
		}
		int[] res2=find(res);
		for (int i = 0; i < res2.length; i++) {
			System.out.println(res2[i]);	
		}
		
//		int[] nums={1,21,11,10,99};
//		int[] res=find(nums);
//		for (int i = 0; i < res.length; i++) {
//			System.out.println(res[i]);	
//		}
	}
	
	public static int[] find(int[] num) {
		if (num.length<2) {
			return null;
		}
		if (num.length==2) {
			return new int[]{num[0],num[1]};
		}
		int max1=num[0]>num[1]?num[0]:num[1];
		int max2=num[1]>num[0]?num[0]:num[1];
		for (int i = 2; i < num.length; i++) {
			if (num[i]>=max1) {
				max2=max1;
				max1=num[i];
			}else if (num[i]>=max2) {
				max2=num[i];
			}
		}
		return new int[]{max1,max2};
	}
}
