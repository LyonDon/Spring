package SwordOffer;

/**
 * 请设计一个函数，用来判断在一个矩阵中是否存在一条包含某字符串所有字符的路径。
 * 路径可以从矩阵中的任意一个格子开始，每一步可以在矩阵中向左，向右，向上，向下移动一个格子。
 * 如果一条路径经过了矩阵中的某一个格子，则之后不能再次进入这个格子。 例如 a b c e s f c s a d e e 这样的3 X 4
 * 矩阵中包含一条字符串"bcced"的路径，但是矩阵中不包含"abcb"路径，
 * 因为字符串的第一个字符b占据了矩阵中的第一行第二个格子之后，路径不能再次进入该格子。
 * 
 * @author Administrator
 *
 */
public class Solution65 {
	public boolean hasPath(char[] matrix, int rows, int cols, char[] str) {
		//特殊情况判断
		if (matrix==null||rows<=0||cols<=0||str==null) {
			return false;
		}
		//设置每个位置是否访问过boolean数组
		boolean[] visit=new boolean[rows*cols];
		//遍历矩阵的每个元素
		for (int row = 0; row < rows; row++) {
			for (int col = 0; col < cols; col++) {
				if (hasPathCore(matrix, rows, cols, row, cols, str, 0, visit)) {
					return true;
				}
			}
		}
		return false;
	}	

	public static boolean hasPathCore(char[] matrix, int rows, int cols, int row, int col, char[] str, int pathLength,
			boolean[] visit) {
		if (row < 0 || row >= rows || col < 0 || col >= cols || matrix[row * cols + col] != str[pathLength]
				|| visit[row * cols + col] == true) {
			return false;
		}
		visit[row * cols + col] = true;
		if (hasPathCore(matrix, rows, cols, row - 1, col, str, pathLength + 1, visit)
				|| hasPathCore(matrix, rows, cols, row, col - 1, str, pathLength + 1, visit)
				|| hasPathCore(matrix, rows, cols, row + 1, col, str, pathLength + 1, visit)
				|| hasPathCore(matrix, rows, cols, row, col + 1, str, pathLength + 1, visit)) {
			return true;
		}
		visit[row*cols+col]=false;
		return false;
	}
}
