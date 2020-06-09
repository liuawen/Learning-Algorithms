package 高频题;

import java.util.*;

public class LRUCache {
    private Map<Integer, Node> map;
    private int capacity;
    // 虚拟头结点
    private Node first;
    // 虚拟尾结点
    private Node last;

    public LRUCache(int capacity) {
        map = new HashMap<>(capacity);
        this.capacity = capacity;
        first = new Node();
        last = new Node();
        first.next = last;
        last.prev = first;
    }

    public int get(int key) {
        Node node = map.get(key);
        if (node == null) return -1;

        removeNode(node);
        addAfterFirst(node);

        return node.value;
    }

    /**
     * @param node 将node节点插入到first节点的后面
     */
    private void addAfterFirst(Node node) {
        // node与first.next
        node.next = first.next;
        first.next.prev = node;

        // node与first
        first.next = node;
        node.prev = first;
    }

    /**
     * @param node 从双向链表中删除node节点
     */
    private void removeNode(Node node) {
        node.next.prev = node.prev;
        node.prev.next = node.next;
    }

    public void put(int key, int value) {
        Node node = map.get(key);
        if (node != null) {
            node.value = value;
            removeNode(node);
        } else { // 添加一对新的key-value
            if (map.size() == capacity) {
                // 淘汰最近最少使用的node\
                removeNode(map.remove(last.prev.key));
//                map.remove(last.prev.key);
//                removeNode(last.prev);
            }
            map.put(key, node = new Node(key, value));
        }
        addAfterFirst(node);
    }

    private static class Node {
        public int key;
        public int value;
        public Node prev;
        public Node next;
        public Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
        public Node() {}
    }
}
