package SwordOffer;

/**
 * 例如:{6,-3,-2,7,-15,1,2,2},连续子向量的最大和为8(从第0个开始,到第3个为止)。
 * 给一个数组，返回它的最大连续子序列的和
 * @author Administrator
 *
 */
public class Solution30 {
	public int FindGreatestSumOfSubArray(int[] array){
		if(array.length==0){
            return 0;
        }
        if(array.length==1){
            return array[0];
        }
        int res=array[0];
        int max=array[0];
        for(int i=1;i<array.length;i++){
            res=array[i]>(res+array[i])?array[i]:res+array[i];
            max=res>max?res:max;
        }
        return max;
	}
}
