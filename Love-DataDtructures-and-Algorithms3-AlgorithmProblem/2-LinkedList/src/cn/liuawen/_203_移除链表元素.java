package cn.liuawen;

import java.util.List;

/**
 * @author : Liu Awen Email:willowawen@gmail.com
 * @create : 2020-06-10
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) { val = x; }
 * }
 *
 * 删除链表中等于给定值 val 的所有节点。
 *
 * 示例:
 *
 * 输入: 1->2->6->3->4->5->6, val = 6
 * 输出: 1->2->3->4->5
 * 通过次数81,849提交次数179,482
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/remove-linked-list-elements
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 */
public class _203_移除链表元素 {
    /*    public ListNode removeElements(ListNode head, int val) {
            if (head == null) return null;
            //新链表的头结点
            ListNode newHead = null;
            //新链表的尾结点
            ListNode newTail = null;

            while (head != null) {
                if (head.val != val) {
                    //将head拼接到newTail的后面
                    if (newTail == null) { //没有头结点
                        newHead = head;
                        newTail = head;
                    } else {
    //                    newTail = newTail.next = head;
                        newTail.next = head;
                        newTail = head;
                    }
                }
                head = head.next;
            }
            if (newTail == null) {
                return null;
            } else {
                //尾结点的next为空
                newTail.next = null;
                return newHead;
            }

        }*/
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) return null;
        //新链表的头结点
        //虚拟头结点
        ListNode newHead = new ListNode(0);
        //新链表的尾结点
        ListNode newTail = newHead;
        while (head != null) {
            //值不等于就放到新的链表中
            if (head.val != val) {
                newTail.next = head;
                newTail = head;
            }
            head = head.next;
        }
        newTail.next = null;

        return newHead.next;
    }
}
