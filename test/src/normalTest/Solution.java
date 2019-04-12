package normalTest;

import java.util.Scanner;

public class Solution {
	public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
        while (in.hasNextLine()) {
            String a = in.nextLine();
            int[] tmp=new int[a.length()];
            for (int i1 = 0; i1 < tmp.length; i++) {
				tmp[i1]=a.charAt(i1);
			}
            int[][] res=new int[3][a.length()];
            
            	for (int j = 0; j < a.length(); j++) {
//            		res[i][j]=
				}
			}
       }
    }

	public void solve(int[][] input) {
		int count = 0;// 表示每次花掉的费用
		int numOfMonster = input[0][0];
		int power = 0;// 表示每只怪兽的能量值
		for (int i = 1; i < numOfMonster - 1; i++) {
			count += input[2][0];
			power += input[1][0];
			if (power > input[1][i + 1]) {
				power += input[1][i + 1];
			} else {
				count += input[2][i];
				power += input[1][i];
			}
		}
		System.out.println(count);
	}

}