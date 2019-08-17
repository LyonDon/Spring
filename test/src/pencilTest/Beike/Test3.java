package pencilTest.Beike;

import java.util.Scanner;

public class Test3 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		int[] num=new int[n];
		for (int i = 0; i < n; i++) {
			num[i]=scanner.nextInt();
		}
		System.out.println(lengthOfLIS(num));
	}
	
    public static int lengthOfLIS(int[] nums) {
        if(nums == null || nums.length ==0) return 0;
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        int max = 0;
        for(int i =1; i<nums.length;i++){
            if(nums[i]>dp[max]){
                dp[++max] = nums[i];
            }else {
                int low = 0;
                int high = max;
                while(low<high){
                    int mid = low + (high - low)/2;
                    if(dp[mid]>=nums[i]){
                        high = mid;
                    }else {
                        low = mid +1;
                    }
                }
                dp[low] = nums[i];
            }
        }
        return max+1;
    }

}
