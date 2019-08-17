package pencilTest;

import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Zijie {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int N=Integer.valueOf(scanner.nextLine());
		int[][] num=new int[N][2];
		for (int i = 0; i < N; i++) {
			String[] string=scanner.nextLine().split(" ");
			num[i][0]=Integer.valueOf(string[0]);
			num[i][1]=Integer.valueOf(string[1]);
		}
		int X=Integer.valueOf(scanner.nextLine());
		int num2[]=new int[2];
		String[] str=scanner.nextLine().split(" ");
		for (int i = 0; i < 2; i++) {
			num2[i]=Integer.valueOf(str[i]);
		}
		int i;
		for (i = 0; i < N; i++) {
			if(get(num[i], X, num2)){
				continue;
			}else {
				break;
			}
		}
		for (int k = 0; k < 2; k++) {
			System.out.print(num[i-1][k]+" ");
		}
		
	}
	
	public static boolean get(int[] num1,int x,int[] num2) {
		int tmp=num1[0]*60+num1[1];
		int tmp2=num2[0]*60+num2[1];
		if (tmp+x>tmp2) {
			return false;
		}
		return true;
	}
}
