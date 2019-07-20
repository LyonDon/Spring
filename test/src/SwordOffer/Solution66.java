package SwordOffer;

/**
 * 地上有一个m行和n列的方格。
 * 一个机器人从坐标0,0的格子开始移动，每一次只能向左，右，上，下四个方向移动一格，但是不能进入行坐标和列坐标的数位之和大于k的格子。
 * 例如，当k为18时，机器人能够进入方格（35,37），因为3+5+3+7 = 18。
 * 但是，它不能进入方格（35,38），因为3+5+3+8 = 19。请问该机器人能够达到多少个格子？
 * @author Administrator
 *
 */
public class Solution66 {
	public int movingCount(int threshold, int rows, int cols) {
		int[][] flag=new int[rows][cols];//记录走过的位置
		return help(0,0,rows,cols,flag,threshold);
	}
	
	public static int help(int row,int col,int rows,int cols,int[][] flag,int threshold) {
		if(row<0||row>=rows||col<0||col>=cols||num_Sum(row)+num_Sum(col)>threshold||flag[row][col]==1){
			return 0;
		}
		flag[row][col]=1;
		return help(row-1, col, rows, cols, flag, threshold)+
				help(row, col-1, rows, cols, flag, threshold)+
				help(row+1, col, rows, cols, flag, threshold)+
				help(row, col+1, rows, cols, flag, threshold)+1;
	}
	
	public static int num_Sum(int num){
		int sum=0;
		do{
			sum+=num%10;
			num/=10;
		}while(num%10!=0);
		
		return sum;
	}
	
}
