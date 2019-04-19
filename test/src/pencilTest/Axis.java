package pencilTest;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 例如牛牛有三个朋友分别所在数轴坐标为-7, 4, 7, s = 5
那么第一个朋友-7向右移动s,变为-2
第二个朋友4向左移动s,变为-1
第三个朋友7向左移动s,变为2。
现在最左和最右的朋友距离是4,没有比这个更优的方案了。
 * @author Administrator
 *
 */
public class Axis {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] axis = scanner.nextLine().trim().split(" ");
		int num = Integer.parseInt(axis[0]);
		int len = Integer.parseInt(axis[1]);
		axis=scanner.nextLine().split(" ");
		int[] axisnum = new int[num];
		for (int i = 0; i < num; i++) {
			axisnum[i] = Integer.parseInt(axis[i]);
		}
		Arrays.sort(axisnum);
		int res=Integer.MAX_VALUE;
		for (int i = 0; i < num-1; i++) {
			int right=Math.max(axisnum[i]+len, axisnum[num-1]-len);
			int left=Math.min(axisnum[i+1]-len, axisnum[0]+len);
			if (right-left<res) {
				res=right-left;
			}
		}
		System.out.println(res);
	}
	
}
