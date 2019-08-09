package normalTest;

import java.util.Scanner;

public class Test9 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int caseNum=scanner.nextInt();
		for (int i = 0; i < caseNum; i++) {
			int gameNum=scanner.nextInt();
			int gameTime=scanner.nextInt();
			
			int[] price=new int[gameNum+1];
			int[] time=new int[gameNum+1];
			for (int j = 1; j <= gameNum; j++) {
				time[j]=scanner.nextInt();
				price[j]=scanner.nextInt();
			}
			int[][] res=new int[gameNum+1][gameTime+1];
			for (int j = 1; j <= gameNum; j++) {
				for (int k = 1; k <= gameTime; k++) {
					if (time[j]<=k) {
						res[j][k]=Math.max(res[j-1][k], res[j-1][k-price[j]]+time[j]);
					}else {
						res[j][k]=res[j-1][k];
					}	
				}
			}
			System.out.println(res[gameNum][gameTime]);
		}
	}
}
