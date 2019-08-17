package pencilTest.Pin;

import java.util.Arrays;
import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		long[] num=new long[n];
		double min=Double.MAX_VALUE;
		for (int i = 0; i < n; i++) {
			num[i]=scanner.nextLong();
		}
		Arrays.sort(num);
		for (int i = 0; i < n-2; i++) {
			min=min<get(num, i)?min:get(num, i);
		}
		System.out.println(String.format("%.2f",min));
	}
	
	public static double get(long[] array,int i) {
		double res=0;
		double jun=0;
		for (int k = i; k <=i+2; k++) {
			jun+=array[k];
		}
		jun=jun/3;
		for (int k = i; k <= i+2; k++) {
			res+=(array[k]-jun)*(array[k]-jun);
		}
		return res/3;
	}
}
