package Algorithm;

public class RBTree<T extends Comparable<T>> {
	private RBTree<T>.RBTNode<T> mRoot;

	private static final boolean RED = false;
	private static final boolean Black = false;

	public class RBTNode<T extends Comparable<T>> {
		boolean color;// 颜色
		T key;// 关键字
		RBTNode<T> left;
		RBTNode<T> right;
		RBTNode<T> parent;

		public RBTNode(boolean color, T key, RBTNode<T> left, RBTNode<T> right, RBTNode<T> parent) {
			this.color=color;
			this.key=key;
			this.left=left;
			this.right=right;
			this.parent=parent;
		}
	}
	
	/**
	 * 对红黑树节点进行左旋
	 * * 左旋示意图(对节点x进行左旋)：
 *      px                              px
 *     /                               /
 *    x                               y                
 *   /  \      --(左旋)-.           / \                #
 *  lx   y                          x  ry     
 *     /   \                       /  \
 *    ly   ry                     lx  ly  
 *
	 * @param x	节点
	 */
	private void leftRotate(RBTNode<T> x) {
		//设置y节点为x的右孩子节点
		RBTNode<T> y=x.right;
		//将y的左孩子设为x的右孩子
		x.right=y.left;
		//如果y的左孩子不为空，则设x为y的左孩子的父亲节点
		if (y.left!=null) {
			x=y.left.parent;
		}
		//将x的父亲设为y的父亲
		y.parent=x.parent;
		//如果x的父亲为空，则将y设为根节点
		if (x.parent==null) {
			this.mRoot=y;
		}else if (x==x.parent.left) {//若x是其父节点的左孩子，则将y作为其父节点的左孩子
			x.parent.left=y;
		}else {//若x是其父节点的右孩子，则y作为其父节点的右孩子
			x.parent.right=y;
		}
		//设置y的左孩子是x
		y.left=x;
		//设置x的父节点是y
		x.parent=y;
	}
	
	/** 
	 * 对红黑树的节点(y)进行右旋转
	 *
	 * 右旋示意图(对节点y进行左旋)：
	 *            py                               py
	 *           /                                /
	 *          y                                x                  
	 *         /  \      --(右旋)-.            /  \                     #
	 *        x   ry                           lx   y  
	 *       / \                                   / \                   #
	 *      lx  rx                                rx  ry
	 * 
	 */
	private void rightRotate(RBTNode<T> y) {
		//设置x是y的左孩子
		RBTNode<T> x=y.left;
		
		//将x的右孩子置为y的左孩子
		y.left=x.right;
		//若x的右孩子不为空，则将y作为x的右孩子的父节点
		if (x.right!=null) {
			x.right.parent=y;
		}
		//将y的父节点置为x的父节点
		x.parent=y.parent;
		//如果y的父节点为空，则将x作为根节点
		if (y.parent==null) {
			this.mRoot=x;
		}else if (y==y.parent.left) {
			x=y.parent.left;//如果y是其父节点的左孩子，则将x作为其父节点的左孩子
		}else {
			x=y.parent.right;
		}
		//将y置为x的右孩子
		x.right=y;
		//将x置为y的父节点
		y.parent=x;
	}
	
	/** 
	 * 将结点插入到红黑树中
	 *
	 * 参数说明：
	 *     node 插入的结点        // 对应《算法导论》中的node
	 */
	private void insert(RBTNode<T> node){
		int cmp;
		RBTNode<T> y=null;
		RBTNode<T> x=this.mRoot;
		
		//将红黑树当做一棵二叉查找树，将节点添加到二叉查找树中
		while(x!=null){//这里的while语句相当于是遍历这棵树
			y=x;//用y保存根节点
			cmp=node.key.compareTo(x.key);//将node与原根节点比较
			if (cmp<0) {
				x=x.left;
			}else {
				x=x.right;
			}
		}
		
		node.parent=y;
		if (y!=null) {
			cmp=node.key.compareTo(y.key);
			if (cmp<0) {
				y.left=node;
			}else {
				y.right=node;
			}
		}else {
			this.mRoot=node;
		}
		//设置节点颜色为红色
		node.color=RED;
		//将其重新修正为一棵二叉树
		insertFixUp(node);
	}
	public void insert(T key) {
		RBTNode<T> node=new RBTNode<T>(Black, key, null, null, null);
		
		//若新建节点失败，则返回
		if (node!=null) {
			insert(node);
		}
	}
	
	/*
	 * 红黑树插入修正函数
	 *
	 * 在向红黑树中插入节点之后(失去平衡)，再调用该函数；
	 * 目的是将它重新塑造成一颗红黑树。
	 *
	 * 参数说明：
	 *     node 插入的结点        // 对应《算法导论》中的z
	 */
	private void insertFixUp(RBTNode<T> node) {
	    RBTNode<T> parent, gparent;

	    // 若“父节点存在，并且父节点的颜色是红色”
	    while (((parent = parentOf(node))!=null) && isRed(parent)) {
	        gparent = parentOf(parent);

	        //若“父节点”是“祖父节点的左孩子”
	        if (parent == gparent.left) {
	            // Case 1条件：叔叔节点是红色
	            RBTNode<T> uncle = gparent.right;
	            if ((uncle!=null) && isRed(uncle)) {
	                setBlack(uncle);
	                setBlack(parent);
	                setRed(gparent);
	                node = gparent;
	                continue;
	            }

	            // Case 2条件：叔叔是黑色，且当前节点是右孩子
	            if (parent.right == node) {
	                RBTNode<T> tmp;
	                leftRotate(parent);
	                tmp = parent;
	                parent = node;
	                node = tmp;
	            }

	            // Case 3条件：叔叔是黑色，且当前节点是左孩子。
	            setBlack(parent);
	            setRed(gparent);
	            rightRotate(gparent);
	        } else {    //若“z的父节点”是“z的祖父节点的右孩子”
	            // Case 1条件：叔叔节点是红色
	            RBTNode<T> uncle = gparent.left;
	            if ((uncle!=null) && isRed(uncle)) {
	                setBlack(uncle);
	                setBlack(parent);
	                setRed(gparent);
	                node = gparent;
	                continue;
	            }

	            // Case 2条件：叔叔是黑色，且当前节点是左孩子
	            if (parent.left == node) {
	                RBTNode<T> tmp;
	                rightRotate(parent);
	                tmp = parent;
	                parent = node;
	                node = tmp;
	            }

	            // Case 3条件：叔叔是黑色，且当前节点是右孩子。
	            setBlack(parent);
	            setRed(gparent);
	            leftRotate(gparent);
	        }
	    }

	    // 将根节点设为黑色
	    setBlack(this.mRoot);
	}

	private void setRed(RBTree<T>.RBTNode<T> gparent) {
		gparent.color=RED;
	}

	private void setBlack(RBTree<T>.RBTNode<T> uncle) {
		uncle.color=Black;
	}

	private boolean isRed(RBTree<T>.RBTNode<T> uncle) {
		return uncle.color==RED;
	}

	private RBTree<T>.RBTNode<T> parentOf(RBTree<T>.RBTNode<T> node) {
		return node.parent;
	}
}
