package SwordOffer;
/**
 * 输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。
 * 如果是则输出Yes,否则输出No。
 * 假设输入的数组的任意两个数字都互不相同
 * @author Administrator
 *
 */
public class Solution23 {
	public boolean VerifySquenceOfBST(int[] sequence) {
		//特殊情况判断
		if(sequence.length<=0){
			return false;
		}
		//分别判断左右子树和根节点的关系
		int root=sequence[sequence.length-1];//保存根节点
		int i=0;
		for (; i < sequence.length-1; i++) {
			if (sequence[i]>root) {
				break;
			}
		}
		int j=i;
		for (;  j< sequence.length; j++) {
			if (sequence[j]<root) {
				return false;
			}
		}
		//构建左右子树的数组
		int[] left_s=getSequence(i);
		for (int k = 0; k < i; k++) {
			left_s[k]=sequence[k];
		}
		int[] right_s=getSequence(sequence.length-i);
		for (int k = i+1; k < right_s.length-1; k++) {
			right_s[k]=sequence[k];
		}
		//递归判断左右子树是不是后序遍历
		boolean left=true;
		left=VerifySquenceOfBST(left_s);
		boolean right=VerifySquenceOfBST(right_s);
		//返回最后结果
		return left&&right;
	}
	public static int[] getSequence(int n) {
		int[] array=new int[n];
		return array;
	}
}
