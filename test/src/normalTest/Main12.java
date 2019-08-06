package normalTest;

import java.awt.Checkbox;
import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeMap;

public class Main12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		int i=0;
		while (i<t) {
			int n1=sc.nextInt();
			long[] array=new long[n1];
			for (int j = 0; j < n1; j++) {
				array[j]=sc.nextInt();	
			}
			find(array);
			i++;
		}
		
	}

	public static void find(long[] array) {
		Arrays.sort(array);
		int length = array.length;
		boolean flag=true;
		for (int i = 0; i < length; i++) {
			if (i==0) {
				if (array[i]>array[i+1]+array[length-1]) {
					System.out.println("NO");
					flag=false;
					
				}
				continue;
			}
			if (i==length-1) {
				if (array[i]>array[i-1]+array[0]) {
					System.out.println("NO");
					flag=false;
					
				}
				break;
			}
			if (array[i]>array[i-1]+array[i+1]) {
				System.out.println("NO");
				flag=false;
			}
		}
		if (flag) {
			System.out.println("YES");
		}
	}
}
