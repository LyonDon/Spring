package SwordOffer;

import java.util.ArrayList;

/**
 * 输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字，
 * 例如，如果输入如下4 X 4矩阵： 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 
 * 则依次打印出数字1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.
 * @author Administrator
 *
 */
public class Solution19 {
	public ArrayList<Integer> printMatrix(int[][] matrix){
		ArrayList<Integer> resList=new ArrayList<Integer>();
		if (matrix.length==0) {
			return resList;
		}
		//行
		int m=matrix.length;
		//列
		int n=matrix[0].length;
		//层（列出几种情况就明白了）
		int layer=(Math.min(m, n)-1)/2+1;
		for (int i = 0; i < layer; i++) {
			for (int j =i; j < n-i; j++) {
				resList.add(matrix[i][j]);
			}
			for (int k = i+1; k < m-i; k++) {
				resList.add(matrix[k][n-i-1]);
			}
			for (int j = n-i-2; (j >= i)&&(m-1-i!=i); j--) {
				resList.add(matrix[m-i-1][j]);
			}
			for (int k = m-i-2; (k >i)&&(n-1-i!=i) ; k--){
				resList.add(matrix[k][i]);
			}
		}
		return resList;
	}
}
