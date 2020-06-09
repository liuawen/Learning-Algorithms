package common;

import com.mj.printer.BinaryTrees;

import java.util.Random;

public class TestMorris {
    private static class MorrisTree extends BinarySearchTree<Integer> {
        /**
         * 利用Morris进行中序遍历
         */
        public void inorder() {
            Node<Integer> node = root;
            while (node != null) {
                if (node.left != null) {
                    // 找到前驱节点(predecessor)、后继节点(successor)
                    Node<Integer> pred = node.left;
                    while (pred.right != null && pred.right != node) {
                        pred = pred.right;
                    }

                    if (pred.right == null) {
                        pred.right = node;
                        node = node.left;
                    } else { // pred.right == node
                        System.out.print(node.element + " ");
                        pred.right = null;
                        node = node.right;
                    }
                } else {
                    System.out.print(node.element + " ");
                    node = node.right;
                }
            }
        }
    }

    public static void main(String[] args) {
        MorrisTree tree = new MorrisTree();
        for (int i = 0; i < 10; i++) {
            tree.add(new Random().nextInt(100));
        }
        BinaryTrees.println(tree);
        System.out.println("------------------");
        tree.inorder();
        System.out.println("------------------");
        BinaryTrees.println(tree);
    }
}
