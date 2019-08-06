package normalTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Test3 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        String[] line1=bf.readLine().split(" ");
        int n=Integer.parseInt(line1[0]);
        int k=Integer.parseInt(line1[1]);
        String [] line2=bf.readLine().split(" ");
        int[] aa=new int[n];
        for(int i=0;i<n;i++) {
            aa[i]=Integer.parseInt(line2[i]);
        }
          
        find(n,k,aa);
	}

	public static void find(int n, int k, int[] array) {
		StringBuilder sBuilder = new StringBuilder();
		int h = 0, i;
		int max ;
		int min ;
		for (i = 0; i < k; i++) {
			max = 0;
			min = 0;
			for (int j = 0; j < n; j++) {
				if (array[j] > array[max]) {
					max = j;
				}
				if (array[j] < array[min]) {
					min = j;
				}
			}
			if ((array[max]-array[min])<=0) {
				break;
			}else {
				array[max]--;
				array[min]++;
				sBuilder.append((max+1)+" "+(min+1)+"\n");
			}
		}
		//再一次循环
		min=0;
		max=0;
		for (int p = 0; p <n; p++) {
			if (array[p]>array[max]) {
				max=p;
			}
			if (array[p]<array[min]) {
				min=p;
			}
		}
		h=array[max]-array[min];
		System.out.println(h+" "+i);
		System.out.println(sBuilder.toString().trim());
	}

}
