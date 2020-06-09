package common;

import com.mj.printer.BinaryTreeInfo;

import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;

@SuppressWarnings("unchecked")
public class BinaryTree<E> implements BinaryTreeInfo  {
	protected Node<E> root;
	protected int size;

	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public void clear() {
		size = 0;
		root = null;
	}
	
	public boolean isComplete() {
		if (root == null) return false;
		Queue<Node<E>> queue = new LinkedList<>();
		queue.offer(root);
		
		boolean leaf = false;
		while (!queue.isEmpty()) {
			Node<E> node = queue.poll();
			if (leaf && !node.isLeaf()) {
				return false;
			}
			
			if (node.isComplete()) {
				queue.offer(node.left);
				queue.offer(node.right);
			} else if (node.left == null && node.right != null) {
				return false;
			} else {
				leaf = true;
			}
		}
		
		return true;
	}
	
	public int height() {
		if (root == null) return 0;
		Queue<Node<E>> queue = new LinkedList<>();
		queue.offer(root);
		int height = 0;
		// 记录正在出队那一层的剩余数量
		int count = 1;
		
		while (!queue.isEmpty()) {
			Node<E> node = queue.poll();
			count--;
			
			if (node.left != null) {
				queue.offer(node.left);
			}
			
			if (node.right != null) {
				queue.offer(node.right);
			}
			
			if (count == 0) {
				count = queue.size();
				height++;
			}
		}
		return height;
	}
	
	/**
	 * 找到前驱节点
	 */
	protected Node<E> predecessor(Node<E> node) {
		if (node == null) return null;
		
		// 左子树的最大节点就是前驱
		if (node.left != null) {
			Node<E> s = node.left;
			while (s.right != null) {
				s = s.right;
			}
			return s;
		}
		
		// 往上找，如果是parent的右子树，那么parent就是前驱
		while (node.parent != null && node == node.parent.left) {
			node = node.parent;
		}
		return node.parent;
	}
	
	/**
	 * 找到后继节点
	 */
	protected Node<E> successor(Node<E> node) {
		if (node == null) return null;
		
		// 右子树的最小节点就是后继
		if (node.right != null) {
			Node<E> s = node.right;
			while (s.left != null) {
				s = s.left;
			}
			return s;
		}

		// 往上找，如果是parent的左子树，那么parent就是后继
		while (node.parent != null && node == node.parent.right) {
			node = node.parent;
		}
		return node.parent;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		toString(sb, root, "");
		return sb.toString();
	}
	
	private void toString(StringBuilder sb, Node<E> node, String prefix) {
		if (node == null) return;

		sb.append(prefix).append("【")
		.append(node.element).append("】").append("\n");
		
		toString(sb, node.left, prefix + "〖L〗");
		toString(sb, node.right, prefix + "〖R〗");
	}
	
	public void preorder(Visitor<E> visitor) {
		if (visitor == null) return;
		
		preorder(visitor, root);
	}
	
	private void preorder(Visitor<E> visitor, Node<E> node) {
		if (node == null || visitor.stop) return;

		visitor.stop = visitor.visit(node.element);
		preorder(visitor, node.left);
		preorder(visitor, node.right);
	}
	
	public void postorder(Visitor<E> visitor) {
		if (visitor == null) return;
		
		postorder(visitor, root);
	}
	
	private void postorder(Visitor<E> visitor, Node<E> node) {
		if (node == null || visitor.stop) return;

		postorder(visitor, node.left);
		postorder(visitor, node.right);
		if (visitor.stop) return;
		visitor.stop = visitor.visit(node.element);
	}
	
	public void inorder(Visitor<E> visitor) {
		if (visitor == null) return;
		inorder(visitor, root);
	}
	
	private void inorder(Visitor<E> visitor, Node<E> node) {
		if (node == null || visitor.stop) return;
		inorder(visitor, node.left);
		if (visitor.stop) return;
		visitor.stop = visitor.visit(node.element);
		inorder(visitor, node.right);
	}
	
	public void levelOrder(Visitor<E> visitor) {
		if (visitor == null || root == null) return;
		
		Queue<Node<E>> queue = new LinkedList<>();
		queue.offer(root);
		
		while (!queue.isEmpty()) {
			Node<E> node = queue.poll();
			if (visitor.visit(node.element)) return;
			
			if (node.left != null) {
				queue.offer(node.left);
			}
			
			if (node.right != null) {
				queue.offer(node.right);
			}
		}
	}
	
	public static abstract class Visitor<E> {
		boolean stop;
		abstract boolean visit(E element);
	}
	
	protected static class Node<E> {
		public E element;
		public Node<E> left;
		public Node<E> right;
		public Node<E> parent;
		
		public Node(E element, Node<E> parent) {
			this.element = element;
			this.parent = parent;
		}
		
		public boolean isLeaf() {
			return left == null && right == null;
		}
		
		public boolean isComplete() {
			return left != null && right != null;
		}
		
		@Override
		public String toString() {
			E pv = parent == null ? null : parent.element;
			E lv = left == null ? null : left.element;
			E rv = right == null ? null : right.element;
			return element + "_p(" + pv + ")_l(" + lv + ")_r(" + rv + ")";
		}
		
		@Override
		public boolean equals(Object obj) {
			if (obj == null || obj.getClass() != getClass()) return false;
			Node<E> node = (Node<E>) obj;
			E pv = parent == null ? null : parent.element;
			E lv = left == null ? null : left.element;
			E rv = right == null ? null : right.element;
			E npv = node.parent == null ? null : node.parent.element;
			E nlv = node.left == null ? null : node.left.element;
			E nrv = node.right == null ? null : node.right.element;
			return Objects.equals(element, node.element)
					&& Objects.equals(pv, npv)
					&& Objects.equals(lv, nlv)
					&& Objects.equals(rv, nrv);
		}
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj == null || obj.getClass() != getClass()) return false;
		BinaryTree<E> tree = (BinaryTree<E>) obj;
		if (size != tree.size) return false;
		if (root == null && tree.root == null) return true;
		if (root == null || tree.root == null) return false;
		
		Queue<Node<E>> queue1 = new LinkedList<>();
		queue1.offer(root);
		Queue<Node<E>> queue2 = new LinkedList<>();
		queue2.offer(tree.root);
		
		while (!queue1.isEmpty()) {
			Node<E> node1 = queue1.poll();
			Node<E> node2 = queue2.poll();
			if (!node1.equals(node2)) return false;
			
			if (node1.left != null) {
				queue1.offer(node1.left);
				queue2.offer(node2.left);
			}
			
			if (node1.right != null) {
				queue1.offer(node1.right);
				queue2.offer(node2.right);
			}
		}
		return queue2.isEmpty();
	}

	/********** BinaryTreeInfo **********/
	@Override
	public Object root() {
		// 根节点是谁？
		return root;
	}

	@Override
	public Object left(Object node) {
		// 如何查找左节点？
		return ((Node<E>)node).left;
	}

	@Override
	public Object right(Object node) {
		// 如何查找右节点？
		return ((Node<E>)node).right;
	}

	@Override
	public Object string(Object node) {
		// 如何打印单个节点？
		return ((Node<E>)node).element;
	}
	/********** BinaryTreeInfo **********/
}
