package SwordOffer;

/**
 * 输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
 * 例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，则重建二叉树并返回
 * 
 * @author Administrator
 *
 */
public class Solution4 {
	public static class TreeNode {
		int val;
		TreeNode left = null;
		TreeNode right = null;

		public TreeNode(int x) {
			val = x;
		}
	}

	public TreeNode reConstructBinaryTree(int[] pre,int[] in) {
		return reConstructTreeNode(pre, in, 0, pre.length-1, 0, in.length-1);
	}

	public TreeNode reConstructTreeNode(int[] pre, int[] in, int pstart, int pend, int istart, int iend) {
		//特殊情况判断是必要的，由于递归的引入
		if (pstart>pend||istart>iend) {
			return null;
		}
		//创建node用来保存根节点,这里必须是pstart，因为后续的遍历过程要求
		TreeNode node=new TreeNode(pre[pstart]);
		//获取根节点在in数组中的相对位置，这里必须是相对位置，因为后续的遍历过程需要左右子树的根节点
		int i=find(in, 0, in.length-1, pre[pstart])-istart;
		//获取node节点的左子树
		node.left=reConstructTreeNode(pre, in, pstart+1, pstart+i, istart, istart+i);
		//获取node节点的右子树
		node.right=reConstructTreeNode(pre, in, pstart+i+1, pend, istart+i+1, iend);
		
		return node;
	}

	public int find(int[] array, int start, int end, int target) {
		for (int i = start; i <= end; i++) {
			if (array[i] == target) {
				return i;
			}
		}
		return -1;
	}
	
}
