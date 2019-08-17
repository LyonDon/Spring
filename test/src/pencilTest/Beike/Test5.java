package pencilTest.Beike;

import java.util.Scanner;

public class Test5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] nums = new int[n];
		for (int i = 0; i < n; i++) {
			nums[i] = scanner.nextInt();
		}
		int res = 0;
		int i = 0; 
		int j = n - 1;
		while (i + 1 < n && nums[i] < nums[i + 1]){
			i++;
		}
		while (j - 1 >= 0 && nums[j] < nums[j - 1]){
			j--;
		}
		if (i == j) {
			System.out.println(0);
		} else {
			int tmp1 = nums[i];
			int tmp2 = nums[j];
			for (i++, j--; i <= j;) {
				if (nums[i] <= tmp1 && nums[j] <= tmp2) {
					int len = Math.min(tmp1 - nums[i] + 1, tmp2 - nums[j] + 1);
					res += len;
					if (len == tmp1 - nums[i] + 1) {
						tmp1++;
						i++;
					} else {
						tmp2++;
						j--;
					}
				} else if (nums[i] <= tmp1) {
					tmp2 = nums[j];
					j--;
				} else if (nums[j] <= tmp2) {
					tmp1 = nums[i];
					i++;
				} else {
					int len2 = Math.max(nums[i] - tmp1, nums[j] - tmp2);
					if (len2 == nums[i] - tmp1 + 1) {
						tmp1 = nums[i];
						i++;
					} else {
						tmp2 = nums[j];
						j--;
					}
				}
			}
			if (n % 2 == 0) {
				if (nums[i] == nums[j])
					res++;
			}
			System.out.println(res);
		}
	}
}
