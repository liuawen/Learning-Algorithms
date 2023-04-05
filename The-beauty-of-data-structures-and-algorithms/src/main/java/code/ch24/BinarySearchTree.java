package code.ch24;

import org.junit.Test;

/**
 * @description 二叉查找树 BinarySearchTree
 * @create 2023-03-11
 */
public class BinarySearchTree {
    private Node tree;

    public static void main(String[] args) {


    }


    public static class Node {
        private int data;
        private Node left;
        private Node right;

        public Node(int data) {
            this.data = data;
        }

        public Node(int data, Node left, Node right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }

    @Test
    public void testFind() {
                /*
        4
       3 5
      2 6
      构造了一个模拟的 一个个插太麻烦 如何自动插入
         */
        Node two = new Node(2, null, null);
        Node six = new Node(6, null, null);
        Node three = new Node(3, two, six);
        Node five = new Node(5, null, null);
        Node four = new Node(4, three, five);
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.tree = four;
        Node node = binarySearchTree.find(3);
        System.out.println(node);
        if (node != null) {
            System.out.println(node.data);
        }
    }

    public Node find(int data) {
        Node p = tree;
        while (p != null) {
            if (data < p.data) p = p.left;
            else if (data > p.data) p = p.right;
            else return p;
        }
        return null;
    }

    @Test
    public void testInsert() {
        int i = 6;
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        for (int j = 0; j < i; j++) {
            binarySearchTree.insert(j);
        }
        System.out.println(binarySearchTree.find(4).data + ":" + binarySearchTree.find(4).right.data);
    }

    public void insert(int data) {
        if (tree == null) {
            tree = new Node(data);
            return;
        }

        Node p = tree;
        while (p != null) {
            if (data > p.data) {
                if (p.right == null) {
                    p.right = new Node(data);
                    return;
                }
                p = p.right;
            } else { // data < p.data
                if (p.left == null) {
                    p.left = new Node(data);
                    return;
                }
                p = p.left;
            }
        }
    }

    public void delete(int data) {
        Node p = tree; // p指向要删除的节点，初始化指向根节点
        Node pp = null; // pp记录的是p的父节点
        while (p != null && p.data != data) {
            pp = p;
            if (data > p.data) p = p.right;
            else p = p.left;
        }
        if (p == null) return; // 没有找到

        // 要删除的节点有两个子节点
        if (p.left != null && p.right != null) { // 查找右子树中最小节点
            Node minP = p.right;
            Node minPP = p; // minPP表示minP的父节点
            while (minP.left != null) {
                minPP = minP;
                minP = minP.left;
            }
            p.data = minP.data; // 将minP的数据替换到p中
            p = minP; // 下面就变成了删除minP了
            pp = minPP;
        }

        // 删除节点是叶子节点或者仅有一个子节点
        Node child; // p的子节点
        if (p.left != null) child = p.left;
        else if (p.right != null) child = p.right;
        else child = null;

        if (pp == null) tree = child; // 删除的是根节点
        else if (pp.left == p) pp.left = child;
        else pp.right = child;
    }
}
