package common;

import java.util.Comparator;

@SuppressWarnings("unchecked")
public class BinarySearchTree<E> extends BinaryTree<E> {
	private Comparator<E> comparator;
	
	public BinarySearchTree() {
		
	}
	
	public BinarySearchTree(Comparator<E> comparator) {
		this.comparator = comparator;
	}
	
	public boolean contains(E element) {
		return node(element) != null;
	}
	
	public void add(E element) {
		elementNotNullCheck(element);
		
		// 第一个节点
		if (root == null) {
			root = new Node<>(element, null);
			size++;
			return;
		}
		
		// 找出父节点
		Node<E> parent = root;
		Node<E> node = root;
		int cmp = 0;
		while (node != null) {
			cmp = compare(element, node.element);
			parent = node;
			if (cmp > 0) {
				node = node.right;
			} else if (cmp < 0) {
				node = node.left;
			} else {
				node.element = element;
				return;
			}
		}
		
		// 看看嫁接到父节点的左还是右
		Node<E> newNode = new Node<>(element, parent);
		if (cmp > 0) {
			parent.right = newNode;
		} else {
			parent.left = newNode;
		}
		size++;
	}
		
	public void remove(E element) {
		remove(node(element));
	}
	
	private void remove(Node<E> node) {
		if (node == null) return;
		
		// 数量减1
		size--;
		
		// 如果度为2
		if (node.isComplete()) {
			// 用后继节点的内容覆盖当前节点
			Node<E> s = successor(node);
			node.element = s.element;
			// 将后继节点删掉（这里的后继节点的度要么是1，要么是0）
			node = s;
		}
		
		// 用来替代的元素
		Node<E> replacement = (node.left != null) ? node.left : node.right;
		if (replacement != null) { // node是度为1的节点
			replacement.parent = node.parent;
			if (node.parent == null) {
				root = replacement;
			} else if (node.parent.left == node) { // node是父节点的左子树
				node.parent.left = replacement;
			} else { // node是父节点的右子树
				node.parent.right = replacement;
			}
		} else if (node.parent == null) { // node是根节点
			root = null;
		} else { // node是叶子节点
			if (node == node.parent.left) {
				node.parent.left = null;
			} else {
				node.parent.right = null;
			}
		}
	}
	
	/**
	 * 根据元素找出对应的节点
	 */
	private Node<E> node(E element) {
		elementNotNullCheck(element);
		Node<E> node = root;
		while (node != null) {
			int cmp = compare(element, node.element);
			if (cmp == 0) return node;
			if (cmp > 0) {
				node = node.right;
			} else {
				node = node.left;
			}
		}
		return node;
	}
	
	/**
	 * 比较两个元素的大小
	 */
	private int compare(E e1, E e2) {
		return (comparator != null) 
				? comparator.compare(e1, e2) 
						: ((Comparable<E>)e1).compareTo(e2);
	}

	private void elementNotNullCheck(E element) {
		if (element == null) {
			throw new IllegalArgumentException("element must not be null");
		}
	}
}
