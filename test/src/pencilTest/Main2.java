package pencilTest;

import java.util.Scanner;

//分巧克力
public class Main2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
//		if (num<6) {
//			System.out.println(0);
//		}
//		if (num==6) {
//			System.out.println(1);
//		}
//		int count=1;
//		while(num-6>0){
//			count*=2;
//			num--;
//		}
//		System.out.println(count%666666666);
		int[] result=new int[num];
		
		for (int start = 0; start < num; start++) {
			int row=scanner.nextInt();
			int col=scanner.nextInt();
			int[][] matrix=new int[row][col];
		}
	}
}
