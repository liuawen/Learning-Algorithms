package cn.liuawen;

/**
 * @author : Liu Awen Email:willowawen@gmail.com
 * @create : 2020-06-10
 */
public class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
    @Override
    public String toString() {
        return val + " -> " + next;
    }
}

