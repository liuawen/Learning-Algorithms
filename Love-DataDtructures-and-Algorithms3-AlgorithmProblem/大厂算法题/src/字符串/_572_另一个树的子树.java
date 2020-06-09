package 字符串;

import com.mj.printer.BinaryTreeInfo;
import com.mj.printer.BinaryTrees;

import common.TreeNode;

/**
 * https://leetcode-cn.com/problems/subtree-of-another-tree/
 * 
 * @author MJ
 *
 */
public class _572_另一个树的子树 {

	public boolean isSubtree(TreeNode s, TreeNode t) {
		if (s == null || t == null) return false;
		return contains(postSerialize(s), postSerialize(t));
	}
	
	private boolean contains(String text, String pattern) {
		int plen = pattern.length();
		int tlen = text.length();
		if (tlen == 0 || plen == 0 || tlen < plen) return false;
		int[] next = next(pattern);
		int pi = 0, ti = 0;
		int tmax = tlen - plen;
		while (pi < plen && ti - pi <= tmax) {
			if (pi < 0 || text.charAt(ti) == pattern.charAt(pi)) {
				ti++;
				pi++;
			} else {
				pi = next[pi];
			}
		}
		return pi == plen;
	}
	
	private int[] next(String pattern) {
		int len = pattern.length();
		int[] next = new int[len];
		int i = 0; 
		int n = next[i] = -1;
		int imax = len - 1;
		while (i < imax) {
			if (n < 0 || pattern.charAt(i) == pattern.charAt(n)) {
				i++;
				n++;
				if (pattern.charAt(i) == pattern.charAt(n)) {
					next[i] = next[n];
				} else {
					next[i] = n;
				}
			} else {
				n = next[n];
			}
		}
		return next;
	}
	
	/**
	 * 利用后序遍历的方式进行序列化
	 * @param root 树的根节点
	 * @return
	 */
	private String postSerialize(TreeNode root) {
		StringBuilder sb = new StringBuilder("!");
		postSerialize(root, sb);
		return sb.toString();
	}
	
	private void postSerialize(TreeNode node, StringBuilder sb) {
		sb.append(node.val).append("!");
		if (node.left == null) {
			sb.append("#!");
		} else {
			postSerialize(node.left, sb);
		}
		if (node.right == null) {
			sb.append("#!");
		} else {
			postSerialize(node.right, sb);
		}
	}
	
	public static void main(String[] args) {
		TreeNode root = new TreeNode(12);
//		root.right = new TreeNode(5);
//		root.left = new TreeNode(4);
//		root.left.left = new TreeNode(1);
//		root.left.right = new TreeNode(2);
		BinaryTrees.println(new BinaryTreeInfo() {
			@Override
			public Object string(Object node) {
				return ((TreeNode) node).val;
			}
			
			@Override
			public Object root() {
				return root;
			}
			
			@Override
			public Object right(Object node) {
				return ((TreeNode) node).right;
			}
			
			@Override
			public Object left(Object node) {
				return ((TreeNode) node).left;
			}
		});
		
		TreeNode root2 = new TreeNode(2);
//		root2.left = new TreeNode(1);
//		root2.right = new TreeNode(2);
		BinaryTrees.println(new BinaryTreeInfo() {
			@Override
			public Object string(Object node) {
				return ((TreeNode) node).val;
			}
			
			@Override
			public Object root() {
				return root2;
			}
			
			@Override
			public Object right(Object node) {
				return ((TreeNode) node).right;
			}
			
			@Override
			public Object left(Object node) {
				return ((TreeNode) node).left;
			}
		});
		
		_572_另一个树的子树 o = new _572_另一个树的子树();
		System.out.println(o.postSerialize(root));
		System.out.println(o.postSerialize(root2));
	}
}
