package pencilTest;

import java.util.Arrays;
import java.util.Scanner;

public class Main1{
    public static int getCount(int num,int temp){
		int count=0;
		if (num>temp) {
			while(num!=temp){
				num/=2;
				count++;
			}
			return count;
		}
		else if (num<temp) {
			while(num!=temp){
				num*=2;
				count++;
			}
			return count;
		}else {
			return count;
		}
			
    }
    public static boolean right(int temp,int[] a,int len) {
		boolean flags=true;
		for (int i = 0; i < a.length; i++) {
			if (i!=len&&a[i]<temp) {
				if(temp%a[i]!=0){
					flags=false;
				}
				if (i!=len&&a[i]>temp) {
					if(a[i]%temp!=0){
						flags=false;
					}
				}
			}
		}
		return flags;
	}
    
    public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		int[] a=new int[n];
		
		for (int i = 0; i < n; i++) {
			a[i]=scanner.nextInt();
		}
		Arrays.sort(a);
		int temp=a[a.length/2];
		
		int count=0;
		while(!right(temp, a, a.length/2)){
			temp/=2;
			count++;
		}
		for (int i = 0; i < a.length/2; i++) {
			count=count+getCount(a[i], temp);
		}
		for (int j = a.length/2+1; j < a.length; j++) {
			count=count+getCount(a[j], temp);
		}
		System.out.println(count);
	}
}