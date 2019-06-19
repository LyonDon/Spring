package Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchTest {
	public static void main(String[] args) throws IOException {
		Scanner scanner=new Scanner(System.in);
		int key=scanner.nextInt();
		int len=scanner.nextInt();
		String[] strings=scanner.nextLine().trim().split(" ");
		int[] nums=new int[strings.length];
		for (int i = 0; i < len; i++) {
			nums[i]=Integer.parseInt(strings[i]);
		}
		System.out.println(rank(key, nums));
	}
	
	public static int rank(int key,int[] a) {
		int lo=0;
		int hi=a.length-1;
		while(lo<hi){
			int mid=lo+(hi-lo)/2;
			if(key<a[mid]) hi=mid;
			else if (key>a[mid]) {
				lo=mid+1;
			}else if (key==a[mid]) {
				return mid;
			}
		}
		return -1;
	}
}
