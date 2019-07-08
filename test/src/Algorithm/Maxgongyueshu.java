package Algorithm;

import java.math.BigInteger;
import java.util.Scanner;

public class Maxgongyueshu {
	public static int gcd(int x,int y) {
		if (y==0) {
			return x;
		}
		int z=x%y;
		return gcd(y, z);
	}
	
	public static int gcd_n(int[] array) {
		int res=0;
		for (int i = 0; i < array.length-1; i++) {
			res=gcd(array[i], array[i+1]);
		}
		return res;
	}
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		if (n>Integer.MAX_VALUE) {
			System.out.println();
		}
		int[] array=new int[n];
		for (int i = 0; i < array.length; i++) {
			array[i]=scanner.nextInt();
		}
		long max=0;
		for (int i = 0; i < array.length; i++) {
			max+=array[i];
		}
		System.out.println(max/gcd_n(array));
	}
}
