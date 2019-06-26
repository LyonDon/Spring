package normalTest;

import java.util.Arrays;
import java.util.Scanner;

import SwordOffer.Solution4.TreeNode;

public class Testnew {
	public static void main(String[] args) {
//		Scanner scanner=new Scanner(System.in);
//		int[] nums=new int[4];
//		for (int i = 0; i < nums.length; i++) {
//			String[] strings=scanner.nextLine().trim().split(" ");
//			nums[i]=Integer.parseInt(strings[i]);
//		}
//		int s=nums[0];
//		for (int i = 1; i < 4; i++) {
//			if (nums[i]<s) {
//				combination(s, nums[i]);
//			}
//		}
//	}
//	public static long factorial(int n) {  
//	    return (n > 1) ? n * factorial(n - 1) : 1;  
//	}
//	
//	public static long combination(int n, int m) {  
//	    return (n >= m) ? factorial(n) / factorial(n - m) / factorial(m) : 0;  
		int[] x={1,23,4};
		int[] z=x;
		int[] y={1,23,4};
		System.out.println(Arrays.equals(x,y));
		System.out.println(Arrays.toString(z));
	}  
//	public static class TreeNode{
//		int val;
//		TreeNode left=null;
//		TreeNode right=null;
//		public TreeNode(int x) {
//			val=x;
//		}
//	}
//	//用来调用实际的函数
//	public static TreeNode reConstructBinaryTree(int[] pre,int[] in) {
//		return reConstructBinaryTree(pre, 0, pre.length-1, in, 0, in.length-1);
//	}
//	
//	//作为实际被调函数,这里的start和end是动态变化的，看递归函数就能明白。所以i的值是find（0，in.length-1）,不能用start和end
//	public static TreeNode reConstructBinaryTree(int[] pre,int pstart,int pend,int[] in,int istart,int iend) {
//		//判断特殊情况
//		if (pstart>pend||istart>iend) {
//			return null;
//		}
//		TreeNode node=new TreeNode(pre[pstart]);
//		int i=find(in, 0, in.length-1, pre[pstart])-istart;//in数组中的根节点的相对位置
//		node.left=reConstructBinaryTree(pre, pstart+1, pstart+i, in, istart, istart+i);
//		node.right=reConstructBinaryTree(pre, pstart+i+1, pend, in, istart+i+1, iend);
//		return node;
//	}
//	
//	//用来找到对应节点在数组中位置
//	public static int find(int[] array,int start,int end,int target) {
//		for (int i = start; i < end; i++) {
//			if (array[i]==target) {
//				return array[i];
//			}
//		}
//		return -1;
//	}
}
